package jsql.parse;

import java.util.Vector;

import jsql.data.Type;
/**
 * @author tmkhanh
 *
 */
public class Insert extends Statement {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String table;
	private Vector<String> columns = new Vector<String>();
	private Vector<Type> values = new Vector<Type>();

	private Insert(String tableName) {
		table = new String(tableName);
	}
	
	public static Insert createStatement(String sqlStatement) throws Exception {
		if (!Utils.checkStringPrefix(sqlStatement, "INSERT"))
			throw new Exception("do'nt have insert");
		try {
			sqlStatement = sqlStatement.substring(6).trim();
			if (!Utils.checkStringPrefix(sqlStatement, "INTO"))
				throw new Exception("do'nt have insert");
			sqlStatement = sqlStatement.substring(4).trim();
			int iTable = sqlStatement.indexOf(' ');
			String table = sqlStatement.substring(0, iTable);
			Insert ins = new Insert(table);
			sqlStatement = sqlStatement.substring(iTable + 1).trim();
			int iValue = Utils.indexOfString(sqlStatement, "VALUES");
			if (iValue > 0) {
				// co chi ra column
				String value = sqlStatement.substring(0, iValue).trim();
				sqlStatement = sqlStatement.substring(iValue).trim();
				while (value.charAt(0) == '(') {
					if (value.charAt(value.length() - 1) != ')')
						throw new Exception("syntac error");
					value = value.substring(1, value.length() - 1).trim();
				}
				int c;
				while ((c = value.indexOf(',')) >= 0) {
					String col = value.substring(0, c).trim();
					ins.addColumn(col);
					value = value.substring(c + 1).trim();
				}
				ins.addColumn(value);
			}
			sqlStatement = sqlStatement.substring(6).trim();
			while (sqlStatement.charAt(0) == '(') {
				if (sqlStatement.charAt(sqlStatement.length() - 1) != ')')
					throw new Exception("syntac error");
				sqlStatement = sqlStatement.substring(1, sqlStatement.length() - 1)
						.trim();
			}
			int c;
			while ((c = sqlStatement.indexOf(',')) >= 0) {
				String col = sqlStatement.substring(0, c).trim();
				Type type = Type.createType(col);
				ins.addValue(type);
				sqlStatement = sqlStatement.substring(c + 1).trim();
			}
			Type type = Type.createType(sqlStatement);
			ins.addValue(type);
			if (ins.columns.size() > 0 && ins.values.size() != ins.columns.size())
				throw new Exception("syntac error");
			return ins;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public String getTable() {
		return table;
	}

	public Vector<String> getColumns() {
		return columns;
	}

	public void setColumns(Vector<String> c) {
		columns = c;
	}

	public void addColumn(String c) {
		columns.add(c);
	}

	public void setValues(Vector<Type> e) {
		values = e;
	}
	
	public void addValue(Type t) {
		values.add(t);
	}

	public Vector<Type> getValues() {
		return values;
	}
}
