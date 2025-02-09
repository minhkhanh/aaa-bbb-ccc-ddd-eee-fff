/**
 * 
 */
package jsql.parse;

import java.util.Arrays;

import jsql.data.IntType;
import jsql.data.StringType;

/**
 * @author tmkhanh
 *
 */
public class Utils {
	public static String[] splitString(String str, String[] pattern) {
		//tach index
		int[] vIndex = new int[pattern.length];
		for (int i = 0; i < vIndex.length; i++) {
			vIndex[i] = indexOfStringExtent(str, pattern[i]);
		}
		Arrays.sort(vIndex);
		String[] result = new String[vIndex.length];
		for (int i = 0; i < vIndex.length; i++) {
			if (vIndex[i]>-1) {
				if (i==vIndex.length-1) result[i] = str.substring(vIndex[i]).trim();
				else result[i] = str.substring(vIndex[i], vIndex[i+1]).trim();
			}
		}
		return result;
	}
	public static boolean checkStringPrefix(String str, String prefix) {
		if (str.length()<prefix.length()) return false;
		String tmp = str.substring(0, prefix.length());
		tmp = tmp.toUpperCase();
		return tmp.equals(prefix);
	}
	public static int indexOfStringExtent(String str, String find) {
		//xoa het cac tu trong chuoi 'xxx'
		str = str.toUpperCase().trim();
		find = find.toUpperCase().trim();
		boolean inString = false;
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i)=='(') count++;
			if (str.charAt(i)==')') count--;
			if (str.charAt(i)=='\'') inString = !inString;
			if (!inString && count==0 && str.substring(i).startsWith(find)) return i;
		}
		return -1;
	}
	public static int indexOfString(String str, String find) {
		//xoa het cac tu trong chuoi 'xxx'
		int oldLength = -1;
		int num = 0;
		int k = -1;
		while ((k=str.indexOf('\''))>=0 && oldLength!=str.length() && str.toUpperCase().indexOf(find.toUpperCase())>k) {
			int i = str.indexOf('\'');
			int j = str.substring(i + 1).indexOf('\'') + i;
			str = str.substring(0, i + 1) + str.substring(j + 1);
			num += (j-i);
			oldLength = str.length();
		}
		return str.toUpperCase().indexOf(find.toUpperCase()) + num;
	}
	public static int indexOfString(StringBuilder str, String find) {
		return indexOfString(str.toString(), find);
	}	
	public static StringBuilder trim(StringBuilder string) {
		if (string==null) return null;
		if (string.length()==0) return string;
		while (string.length()>0 && string.charAt(0)==' ') string = string.deleteCharAt(0);
		while (string.length()>0 && string.charAt(string.length()-1)==' ') string = string.deleteCharAt(string.length()-1);
		return string;
	}
	public static Object splitWhereStatement(StringBuilder statement) throws Exception {
		//String statement = sqlStatement.toString();
		//statement.trimToSize()
		if (statement==null||statement.length()==0) return null;
		if (indexOfString(statement, "(*)")==0) {
			statement = trim(statement.delete(0, 3));
			return new ColumnConstant(new StringType("*"));
		}
		if (indexOfString(statement, "(")==0) {
			return splitExp(statement);
		}
//		if (indexOfString(statement, "(")==0) {
//			statement = trim(statement.deleteCharAt(0));
//			return new DauNgoacMo();
//		}
//		if (indexOfString(statement, ")")==0) {
//			statement = trim(statement.deleteCharAt(0));
//			return new DauNgoacDong();
//		}
		if (indexOfString(statement, "AND")==0 && !isWordChar(statement.charAt(3))) {
			statement = trim(statement.delete(0, 3));
			return new OperatorAnd();
		}
		if (indexOfString(statement, "OR")==0 && !isWordChar(statement.charAt(2))) {
			statement = trim(statement.delete(0, 2));
			return new OperatorOr();
		}
		if (indexOfString(statement, "NOT")==0 && !isWordChar(statement.charAt(3))) {
			statement = trim(statement.delete(0, 3));
			return new OperatorNot();
		}
		if (indexOfString(statement, ">=")==0) {
			statement = trim(statement.delete(0, 2));
			return new OperatorLonHonHoacBang();
		}
		if (indexOfString(statement, "<=")==0) {
			statement = trim(statement.delete(0, 2));
			return new OperatorNhoHonHoacBang();
		}
		if (indexOfString(statement, "=")==0) {
			statement = trim(statement.deleteCharAt(0));
			return new OperatorBang();
		}
		if (indexOfString(statement, "<>")==0) {
			statement = trim(statement.delete(0, 2));
			return new OperatorKhac();
		}
		if (indexOfString(statement, ">")==0) {
			statement = trim(statement.deleteCharAt(0));
			return new OperatorLonHon();
		}
		if (indexOfString(statement, "<")==0) {
			statement = trim(statement.deleteCharAt(0));
			return new OperatorNhoHon();
		}
		if (indexOfString(statement, "+")==0) {
			statement = trim(statement.deleteCharAt(0));
			return new OperatorCong();
		}
		if (indexOfString(statement, "-")==0) {
			statement = trim(statement.deleteCharAt(0));
			return new OperatorTru();
		}
		if (indexOfString(statement, "*")==0) {
			statement = trim(statement.deleteCharAt(0));
			return new OperatorNhan();
		}
		if (indexOfString(statement, "/")==0) {
			statement = trim(statement.deleteCharAt(0));
			return new OperatorChia();
		}
		if (indexOfString(statement, "LIKE")==0 && !isWordChar(statement.charAt(4))) {
			statement = trim(statement.delete(0, 4));
			return new OperatorLike();
		}
		if (indexOfString(statement, "IN")==0 && !isWordChar(statement.charAt(2))) {
			statement = trim(statement.delete(0, 2));
			return new OperatorIn();
		}
		if (indexOfString(statement, "AVG")==0 && !isWordChar(statement.charAt(3))) {
			statement = trim(statement.delete(0, 3));
			return new OperatorAvg();
		}
		if (indexOfString(statement, "COUNT")==0 && !isWordChar(statement.charAt(5))) {
			statement = trim(statement.delete(0, 5));
			return new OperatorCount();
		}
		if (indexOfString(statement, "FIRST")==0 && !isWordChar(statement.charAt(5))) {
			statement = trim(statement.delete(0, 5));
			return new OperatorFirst();
		}
		if (indexOfString(statement, "LAST")==0 && !isWordChar(statement.charAt(4))) {
			statement = trim(statement.delete(0, 4));
			return new OperatorLast();
		}
		if (indexOfString(statement, "MAX")==0 && !isWordChar(statement.charAt(3))) {
			statement = trim(statement.delete(0, 3));
			return new OperatorMax();
		}
		if (indexOfString(statement, "MIN")==0 && !isWordChar(statement.charAt(3))) {
			statement = trim(statement.delete(0, 3));
			return new OperatorMin();
		}
		if (indexOfString(statement, "SUM")==0 && !isWordChar(statement.charAt(3))) {
			statement = trim(statement.delete(0, 3));
			return new OperatorSum();
		}
		if (indexOfString(statement, "EXISTS")==0 && !isWordChar(statement.charAt(6))) {
			statement = trim(statement.delete(0, 6));
			return new OperatorExists();
		}
		if (indexOfString(statement, "ALL")==0 && !isWordChar(statement.charAt(3))) {
			statement = trim(statement.delete(0, 3));
			return new OperatorAll();
		}
		if (indexOfString(statement, "ANY")==0 && !isWordChar(statement.charAt(3))) {
			statement = trim(statement.delete(0, 3));
			return new OperatorAny();
		}
		if (indexOfString(statement, "SELECT")==0 && !isWordChar(statement.charAt(6))) {
			//statement = trim(statement.delete(0, 3));
			Statement t = Parser.parseStatement(statement.toString());
			if (!(t instanceof Select)) throw new Exception("error on subquery!");
			statement.delete(0, statement.length());
			return t;
		}
		if (indexOfString(statement, "DISTINCT")==0 && !isWordChar(statement.charAt(8))) {
			statement = trim(statement.delete(0, 8));
			int i = 0;
			while (isWordChar(statement.charAt(i))) i++;
			if (i<=0) throw new Exception("split false!");
			String col = statement.substring(0, i).trim();
			statement = trim(statement.delete(0, i));
			ColumnConstant colConst = new ColumnConstant(new StringType(col));
			colConst.setDistinct();
			return colConst;
		}		
		
		//toan hang
		if (indexOfString(statement, "'")==0) {
			int i = indexOfString(statement.substring(1), "'");
			if (i<0) throw new Exception("split false!");
			i++; // bu vao phan da tru ra
			String tmp = statement.substring(1, i);
			statement = trim(statement.delete(0, i + 1));
			return new StringConstant(new StringType(tmp));
		}
		int i = 0;
		//Pattern pattern = Pattern.compile("[\\w]"); 
		for (; i<statement.length(); ) {
			if (!isWordChar(statement.charAt(i))) break;
			else ++i;
		}
		if (i>statement.length()) throw new Exception("split false!");
		String tmp = statement.substring(0, i);
		statement = trim(statement.delete(0, i));
		
		try {
			int val = Integer.parseInt(tmp);
			return new IntConstant(new IntType(val));
		} catch (NumberFormatException e) {
			return new ColumnConstant(new StringType(tmp));
		}		
				
		//throw new Exception("split false!");		
	}
//	private static String splitStringInStatement(String str) {
//		int oldLength = -1;
//		while (str.indexOf('\'')>=0 && oldLength!=str.length()) {
//			int i = str.indexOf('\'');
//			int j = str.substring(i + 1).indexOf('\'') + i;
//			str = str.substring(0, i + 1) + str.substring(j + 1);
//			oldLength = str.length();
//		}
//		return str;
//	}
//	private static int findStringNotInString(String str, String find) {
//		
//	}
	private static Exp splitExp(StringBuilder statement) throws Exception {
		//StringBuilder sql = new StringBuilder(splitStringInStatement(statement.toString()).trim());
		if (statement.charAt(0)!='(') return ExpressionTree.createWhere(statement.toString());
		//lay ve ct chinh
		int count = 0;
		boolean inString = false;
		for (int j = 0; j < statement.length(); j++) {
			if (statement.charAt(j)=='\'') inString = !inString;
			if (!inString && statement.charAt(j)=='(') ++count;
			if (!inString && statement.charAt(j)==')') --count;
			if (count==0) {
				String sub = statement.substring(1, j).trim();
				statement = trim(statement.delete(0, j + 1));
				//check neu la tap hop
				if (isSetOf(sub)) {
					return new SetConstant(sub);
				}
				return ExpressionTree.createExp(sub);
			}
		}
		throw new Exception("sql syntax error!");
	}
	private static boolean isSetOf(String statement) {
		StringBuilder sql = new StringBuilder(statement.trim());
		//bo cac dau () cap con
		int count = 0;
		for (int i = 0; i < sql.length(); i++) {
			if (sql.charAt(i)=='(') {
				count = 0;
				for (int j = i; j < sql.length(); j++) {
					if (sql.charAt(j)=='(') ++count;
					if (sql.charAt(j)==')') --count;
					if (count==0) {
						sql.delete(i + 1, j);
						break;
					}
				}
			}
		}
		return indexOfString(sql, ",")>0;
	}
	public static Object splitWhereStatementIN(StringBuilder statement) throws Exception {
		if (statement==null||statement.length()==0) throw new Exception("split false!");
		int iCount = 1;
		if (indexOfString(statement, "(")==0) {
			for (int i = 1; i < statement.length(); i++) {
				if (statement.charAt(i)=='(') iCount++;
				if (statement.charAt(i)==')') iCount--;
				if (iCount==0) {
					String subIn = statement.substring(1, i).trim();
					statement = trim(statement.delete(0, i + 1));
					return new SetConstant(subIn);
				}
			}
		}
		throw new Exception("split false!");
	}
	public static boolean isWordChar(char ch) {
		return (ch>='0' && ch<='9')||(ch>='A' && ch<='Z')||(ch>='a' && ch<='z')||(ch=='_')||(ch=='.');
	}
	public static boolean isKeyword(String key) {
		return false;
	}
}
