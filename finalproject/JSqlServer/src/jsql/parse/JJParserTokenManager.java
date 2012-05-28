package jsql.parse;

public class JJParserTokenManager implements JJParserConstants {
	public java.io.PrintStream debugStream = System.out;

	public void setDebugStream(java.io.PrintStream ds) {
		debugStream = ds;
	}

	private final int jjStopStringLiteralDfa_0(int pos, long active0,
			long active1) {
		switch (pos) {
		case 0:
			if ((active1 & 0x4000000000L) != 0L)
				return 0;
			if ((active1 & 0x10020000000L) != 0L)
				return 47;
			if ((active1 & 0x80000000000L) != 0L)
				return 3;
			if ((active0 & 0xffffffffffffffe0L) != 0L
					|| (active1 & 0xfffL) != 0L) {
				jjmatchedKind = 82;
				return 48;
			}
			return -1;
		case 1:
			if ((active0 & 0x1a003f00004300L) != 0L)
				return 48;
			if ((active0 & 0xffe5ffc0ffffbce0L) != 0L
					|| (active1 & 0xfffL) != 0L) {
				if (jjmatchedPos != 1) {
					jjmatchedKind = 82;
					jjmatchedPos = 1;
				}
				return 48;
			}
			return -1;
		case 2:
			if ((active0 & 0xebf5d8deefffb800L) != 0L
					|| (active1 & 0xffeL) != 0L) {
				if (jjmatchedPos != 2) {
					jjmatchedKind = 82;
					jjmatchedPos = 2;
				}
				return 48;
			}
			if ((active0 & 0x14002700100006e0L) != 0L || (active1 & 0x1L) != 0L)
				return 48;
			return -1;
		case 3:
			if ((active0 & 0x1c488d024508000L) != 0L
					|| (active1 & 0x600L) != 0L)
				return 48;
			if ((active0 & 0xea31540ecbaf3800L) != 0L
					|| (active1 & 0x9feL) != 0L) {
				jjmatchedKind = 82;
				jjmatchedPos = 3;
				return 48;
			}
			return -1;
		case 4:
			if ((active0 & 0xa030040048080000L) != 0L
					|| (active1 & 0x90aL) != 0L)
				return 48;
			if ((active0 & 0x4a01500e83a73800L) != 0L
					|| (active1 & 0xf4L) != 0L) {
				jjmatchedKind = 82;
				jjmatchedPos = 4;
				return 48;
			}
			return -1;
		case 5:
			if ((active0 & 0x4200100c01853800L) != 0L
					|| (active1 & 0xc4L) != 0L) {
				jjmatchedKind = 82;
				jjmatchedPos = 5;
				return 48;
			}
			if ((active0 & 0x801400282220000L) != 0L || (active1 & 0x30L) != 0L)
				return 48;
			return -1;
		case 6:
			if ((active0 & 0x1000L) != 0L) {
				if (jjmatchedPos != 6) {
					jjmatchedKind = 82;
					jjmatchedPos = 6;
				}
				return 11;
			}
			if ((active0 & 0x100400052800L) != 0L || (active1 & 0xc0L) != 0L)
				return 48;
			if ((active0 & 0x4200000801800000L) != 0L || (active1 & 0x4L) != 0L) {
				if (jjmatchedPos != 6) {
					jjmatchedKind = 82;
					jjmatchedPos = 6;
				}
				return 48;
			}
			return -1;
		case 7:
			if ((active0 & 0x4200000000800000L) != 0L)
				return 48;
			if ((active0 & 0x1000L) != 0L) {
				jjmatchedKind = 82;
				jjmatchedPos = 7;
				return 11;
			}
			if ((active1 & 0x40L) != 0L)
				return 11;
			if ((active0 & 0x801000000L) != 0L || (active1 & 0x4L) != 0L) {
				jjmatchedKind = 82;
				jjmatchedPos = 7;
				return 48;
			}
			return -1;
		case 8:
			if ((active1 & 0x4L) != 0L) {
				jjmatchedKind = 82;
				jjmatchedPos = 8;
				return 48;
			}
			if ((active0 & 0x801000000L) != 0L)
				return 48;
			if ((active0 & 0x1000L) != 0L) {
				jjmatchedKind = 82;
				jjmatchedPos = 8;
				return 11;
			}
			return -1;
		case 9:
			if ((active1 & 0x4L) != 0L) {
				jjmatchedKind = 82;
				jjmatchedPos = 9;
				return 48;
			}
			if ((active0 & 0x1000L) != 0L) {
				jjmatchedKind = 82;
				jjmatchedPos = 9;
				return 11;
			}
			return -1;
		case 10:
			if ((active1 & 0x4L) != 0L)
				return 48;
			if ((active0 & 0x1000L) != 0L) {
				jjmatchedKind = 82;
				jjmatchedPos = 10;
				return 11;
			}
			return -1;
		case 11:
			if ((active0 & 0x1000L) != 0L) {
				jjmatchedKind = 82;
				jjmatchedPos = 11;
				return 11;
			}
			return -1;
		case 12:
			if ((active0 & 0x1000L) != 0L) {
				jjmatchedKind = 82;
				jjmatchedPos = 12;
				return 11;
			}
			return -1;
		default:
			return -1;
		}
	}

	private final int jjStartNfa_0(int pos, long active0, long active1) {
		return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0, active1),
				pos + 1);
	}

	private final int jjStopAtPos(int pos, int kind) {
		jjmatchedKind = kind;
		jjmatchedPos = pos;
		return pos + 1;
	}

	private final int jjStartNfaWithStates_0(int pos, int kind, int state) {
		jjmatchedKind = kind;
		jjmatchedPos = pos;
		try {
			curChar = input_stream.readChar();
		} catch (java.io.IOException e) {
			return pos + 1;
		}
		return jjMoveNfa_0(state, pos + 1);
	}

	private final int jjMoveStringLiteralDfa0_0() {
		switch (curChar) {
		case 33:
			return jjMoveStringLiteralDfa1_0(0x0L, 0x40000000L);
		case 35:
			return jjStopAtPos(0, 95);
		case 40:
			return jjStopAtPos(0, 88);
		case 41:
			return jjStopAtPos(0, 90);
		case 42:
			jjmatchedKind = 103;
			return jjMoveStringLiteralDfa1_0(0x0L, 0x100000000000L);
		case 43:
			return jjStopAtPos(0, 101);
		case 44:
			return jjStopAtPos(0, 89);
		case 45:
			return jjStartNfaWithStates_0(0, 102, 0);
		case 46:
			jjmatchedKind = 93;
			return jjMoveStringLiteralDfa1_0(0x0L, 0x10000000000L);
		case 47:
			return jjStartNfaWithStates_0(0, 107, 3);
		case 59:
			return jjStopAtPos(0, 91);
		case 60:
			jjmatchedKind = 99;
			return jjMoveStringLiteralDfa1_0(0x0L, 0x1100000000L);
		case 61:
			return jjStopAtPos(0, 92);
		case 62:
			jjmatchedKind = 97;
			return jjMoveStringLiteralDfa1_0(0x0L, 0x400000000L);
		case 63:
			return jjStopAtPos(0, 105);
		case 65:
		case 97:
			return jjMoveStringLiteralDfa1_0(0x7e0L, 0x0L);
		case 66:
		case 98:
			return jjMoveStringLiteralDfa1_0(0x7800L, 0x0L);
		case 67:
		case 99:
			return jjMoveStringLiteralDfa1_0(0xf8000L, 0x0L);
		case 68:
		case 100:
			return jjMoveStringLiteralDfa1_0(0xf00000L, 0x0L);
		case 69:
		case 101:
			return jjMoveStringLiteralDfa1_0(0x7000000L, 0x0L);
		case 70:
		case 102:
			return jjMoveStringLiteralDfa1_0(0x38000000L, 0x0L);
		case 71:
		case 103:
			return jjMoveStringLiteralDfa1_0(0x40000000L, 0x0L);
		case 72:
		case 104:
			return jjMoveStringLiteralDfa1_0(0x80000000L, 0x0L);
		case 73:
		case 105:
			return jjMoveStringLiteralDfa1_0(0x3f00000000L, 0x0L);
		case 76:
		case 108:
			return jjMoveStringLiteralDfa1_0(0xc000000000L, 0x0L);
		case 77:
		case 109:
			return jjMoveStringLiteralDfa1_0(0xf0000000000L, 0x0L);
		case 78:
		case 110:
			return jjMoveStringLiteralDfa1_0(0x1f00000000000L, 0x0L);
		case 79:
		case 111:
			return jjMoveStringLiteralDfa1_0(0x1e000000000000L, 0x0L);
		case 80:
		case 112:
			return jjMoveStringLiteralDfa1_0(0x20000000000000L, 0x0L);
		case 81:
		case 113:
			return jjMoveStringLiteralDfa1_0(0x40000000000000L, 0x0L);
		case 82:
		case 114:
			return jjMoveStringLiteralDfa1_0(0x780000000000000L, 0x0L);
		case 83:
		case 115:
			return jjMoveStringLiteralDfa1_0(0xf800000000000000L, 0x1L);
		case 84:
		case 116:
			return jjMoveStringLiteralDfa1_0(0x0L, 0x6L);
		case 85:
		case 117:
			return jjMoveStringLiteralDfa1_0(0x0L, 0x18L);
		case 86:
		case 118:
			return jjMoveStringLiteralDfa1_0(0x0L, 0xe0L);
		case 87:
		case 119:
			return jjMoveStringLiteralDfa1_0(0x0L, 0xf00L);
		case 124:
			return jjMoveStringLiteralDfa1_0(0x0L, 0x40000000000L);
		default:
			return jjMoveNfa_0(2, 0);
		}
	}

	private final int jjMoveStringLiteralDfa1_0(long active0, long active1) {
		try {
			curChar = input_stream.readChar();
		} catch (java.io.IOException e) {
			jjStopStringLiteralDfa_0(0, active0, active1);
			return 1;
		}
		switch (curChar) {
		case 42:
			if ((active1 & 0x10000000000L) != 0L)
				return jjStopAtPos(1, 104);
			else if ((active1 & 0x100000000000L) != 0L)
				return jjStopAtPos(1, 108);
			break;
		case 61:
			if ((active1 & 0x40000000L) != 0L)
				return jjStopAtPos(1, 94);
			else if ((active1 & 0x400000000L) != 0L)
				return jjStopAtPos(1, 98);
			else if ((active1 & 0x1000000000L) != 0L)
				return jjStopAtPos(1, 100);
			break;
		case 62:
			if ((active1 & 0x100000000L) != 0L)
				return jjStopAtPos(1, 96);
			break;
		case 65:
		case 97:
			return jjMoveStringLiteralDfa2_0(active0, 0x110080100000L, active1,
					0xe2L);
		case 69:
		case 101:
			return jjMoveStringLiteralDfa2_0(active0, 0x1980000000600800L,
					active1, 0L);
		case 70:
		case 102:
			if ((active0 & 0x2000000000000L) != 0L)
				return jjStartNfaWithStates_0(1, 49, 48);
			break;
		case 72:
		case 104:
			return jjMoveStringLiteralDfa2_0(active0, 0x2000000000008000L,
					active1, 0x100L);
		case 73:
		case 105:
			return jjMoveStringLiteralDfa2_0(active0, 0x64000801000L, active1,
					0x200L);
		case 76:
		case 108:
			return jjMoveStringLiteralDfa2_0(active0, 0x8000020L, active1, 0L);
		case 77:
		case 109:
			return jjMoveStringLiteralDfa2_0(active0, 0x4000000000000000L,
					active1, 0L);
		case 78:
		case 110:
			if ((active0 & 0x100000000L) != 0L) {
				jjmatchedKind = 32;
				jjmatchedPos = 1;
			}
			return jjMoveStringLiteralDfa2_0(active0, 0x4001e000000c0L,
					active1, 0x8L);
		case 79:
		case 111:
			return jjMoveStringLiteralDfa2_0(active0, 0x6006880100f2000L,
					active1, 0x400L);
		case 80:
		case 112:
			return jjMoveStringLiteralDfa2_0(active0, 0L, active1, 0x10L);
		case 82:
		case 114:
			if ((active0 & 0x8000000000000L) != 0L) {
				jjmatchedKind = 51;
				jjmatchedPos = 1;
			}
			return jjMoveStringLiteralDfa2_0(active0, 0x30000060000000L,
					active1, 0x804L);
		case 83:
		case 115:
			if ((active0 & 0x100L) != 0L) {
				jjmatchedKind = 8;
				jjmatchedPos = 1;
			} else if ((active0 & 0x2000000000L) != 0L)
				return jjStartNfaWithStates_0(1, 37, 48);
			return jjMoveStringLiteralDfa2_0(active0, 0x200L, active1, 0L);
		case 84:
		case 116:
			return jjMoveStringLiteralDfa2_0(active0, 0x8000000000000000L,
					active1, 0L);
		case 85:
		case 117:
			return jjMoveStringLiteralDfa2_0(active0, 0x41800000000000L,
					active1, 0x1L);
		case 86:
		case 118:
			return jjMoveStringLiteralDfa2_0(active0, 0x400L, active1, 0L);
		case 88:
		case 120:
			return jjMoveStringLiteralDfa2_0(active0, 0x7000000L, active1, 0L);
		case 89:
		case 121:
			if ((active0 & 0x4000L) != 0L)
				return jjStartNfaWithStates_0(1, 14, 48);
			break;
		case 124:
			if ((active1 & 0x40000000000L) != 0L)
				return jjStopAtPos(1, 106);
			break;
		default:
			break;
		}
		return jjStartNfa_0(0, active0, active1);
	}

	private final int jjMoveStringLiteralDfa2_0(long old0, long active0,
			long old1, long active1) {
		if (((active0 &= old0) | (active1 &= old1)) == 0L)
			return jjStartNfa_0(0, old0, old1);
		try {
			curChar = input_stream.readChar();
		} catch (java.io.IOException e) {
			jjStopStringLiteralDfa_0(1, active0, active1);
			return 2;
		}
		switch (curChar) {
		case 65:
		case 97:
			return jjMoveStringLiteralDfa3_0(active0, 0xe180000000008000L,
					active1, 0x4L);
		case 66:
		case 98:
			return jjMoveStringLiteralDfa3_0(active0, 0L, active1, 0x2L);
		case 67:
		case 99:
			if ((active0 & 0x200L) != 0L)
				return jjStartNfaWithStates_0(2, 9, 48);
			return jjMoveStringLiteralDfa3_0(active0, 0x8001000000L, active1,
					0L);
		case 68:
		case 100:
			if ((active0 & 0x40L) != 0L)
				return jjStartNfaWithStates_0(2, 6, 48);
			return jjMoveStringLiteralDfa3_0(active0, 0x10080000000000L,
					active1, 0x10L);
		case 69:
		case 101:
			return jjMoveStringLiteralDfa3_0(active0, 0L, active1, 0x100L);
		case 71:
		case 103:
			if ((active0 & 0x400L) != 0L)
				return jjStartNfaWithStates_0(2, 10, 48);
			break;
		case 73:
		case 105:
			return jjMoveStringLiteralDfa3_0(active0, 0x60000006000000L,
					active1, 0x808L);
		case 75:
		case 107:
			return jjMoveStringLiteralDfa3_0(active0, 0x4000000000L, active1,
					0L);
		case 76:
		case 108:
			if ((active0 & 0x20L) != 0L)
				return jjStartNfaWithStates_0(2, 5, 48);
			return jjMoveStringLiteralDfa3_0(active0, 0xa04800000200000L,
					active1, 0x20L);
		case 77:
		case 109:
			if ((active1 & 0x1L) != 0L)
				return jjStartNfaWithStates_0(2, 64, 48);
			return jjMoveStringLiteralDfa3_0(active0, 0x1000000030000L,
					active1, 0L);
		case 78:
		case 110:
			if ((active0 & 0x20000000000L) != 0L) {
				jjmatchedKind = 41;
				jjmatchedPos = 2;
			}
			return jjMoveStringLiteralDfa3_0(active0, 0x40000041000L, active1,
					0L);
		case 79:
		case 111:
			return jjMoveStringLiteralDfa3_0(active0, 0x68002000L, active1, 0L);
		case 82:
		case 114:
			if ((active0 & 0x10000000L) != 0L)
				return jjStartNfaWithStates_0(2, 28, 48);
			return jjMoveStringLiteralDfa3_0(active0, 0L, active1, 0x4c0L);
		case 83:
		case 115:
			return jjMoveStringLiteralDfa3_0(active0, 0x200c00000L, active1, 0L);
		case 84:
		case 116:
			if ((active0 & 0x200000000000L) != 0L)
				return jjStartNfaWithStates_0(2, 45, 48);
			else if ((active0 & 0x1000000000000000L) != 0L)
				return jjStartNfaWithStates_0(2, 60, 48);
			return jjMoveStringLiteralDfa3_0(active0, 0x101c00100800L, active1,
					0x200L);
		case 85:
		case 117:
			return jjMoveStringLiteralDfa3_0(active0, 0x80000L, active1, 0L);
		case 86:
		case 118:
			return jjMoveStringLiteralDfa3_0(active0, 0x80000000L, active1, 0L);
		case 87:
		case 119:
			if ((active0 & 0x400000000000000L) != 0L)
				return jjStartNfaWithStates_0(2, 58, 48);
			return jjMoveStringLiteralDfa3_0(active0, 0x400000000000L, active1,
					0L);
		case 88:
		case 120:
			if ((active0 & 0x10000000000L) != 0L)
				return jjStartNfaWithStates_0(2, 40, 48);
			break;
		case 89:
		case 121:
			if ((active0 & 0x80L) != 0L)
				return jjStartNfaWithStates_0(2, 7, 48);
			break;
		default:
			break;
		}
		return jjStartNfa_0(1, active0, active1);
	}

	private final int jjMoveStringLiteralDfa3_0(long old0, long active0,
			long old1, long active1) {
		if (((active0 &= old0) | (active1 &= old1)) == 0L)
			return jjStartNfa_0(1, old0, old1);
		try {
			curChar = input_stream.readChar();
		} catch (java.io.IOException e) {
			jjStopStringLiteralDfa_0(2, active0, active1);
			return 3;
		}
		switch (curChar) {
		case 65:
		case 97:
			return jjMoveStringLiteralDfa4_0(active0, 0x400008001000L, active1,
					0x10L);
		case 66:
		case 98:
			return jjMoveStringLiteralDfa4_0(active0, 0x1000000000000L,
					active1, 0L);
		case 67:
		case 99:
			if ((active0 & 0x400000L) != 0L)
				return jjStartNfaWithStates_0(3, 22, 48);
			return jjMoveStringLiteralDfa4_0(active0, 0L, active1, 0xc0L);
		case 68:
		case 100:
			if ((active0 & 0x80000000000000L) != 0L)
				return jjStartNfaWithStates_0(3, 55, 48);
			break;
		case 69:
		case 101:
			if ((active0 & 0x100000L) != 0L)
				return jjStartNfaWithStates_0(3, 20, 48);
			else if ((active0 & 0x4000000000L) != 0L)
				return jjStartNfaWithStates_0(3, 38, 48);
			else if ((active0 & 0x80000000000L) != 0L)
				return jjStartNfaWithStates_0(3, 43, 48);
			return jjMoveStringLiteralDfa4_0(active0, 0x810000e00200000L,
					active1, 0L);
		case 72:
		case 104:
			if ((active1 & 0x200L) != 0L)
				return jjStartNfaWithStates_0(3, 73, 48);
			break;
		case 73:
		case 105:
			return jjMoveStringLiteralDfa4_0(active0, 0x80000000L, active1, 0L);
		case 75:
		case 107:
			if ((active0 & 0x8000000000L) != 0L)
				return jjStartNfaWithStates_0(3, 39, 48);
			else if ((active1 & 0x400L) != 0L)
				return jjStartNfaWithStates_0(3, 74, 48);
			break;
		case 76:
		case 108:
			if ((active0 & 0x800000000000L) != 0L)
				return jjStartNfaWithStates_0(3, 47, 48);
			else if ((active0 & 0x100000000000000L) != 0L)
				return jjStartNfaWithStates_0(3, 56, 48);
			return jjMoveStringLiteralDfa4_0(active0, 0x4200000001002000L,
					active1, 0x2L);
		case 77:
		case 109:
			if ((active0 & 0x20000000L) != 0L)
				return jjStartNfaWithStates_0(3, 29, 48);
			return jjMoveStringLiteralDfa4_0(active0, 0x30000L, active1, 0L);
		case 78:
		case 110:
			return jjMoveStringLiteralDfa4_0(active0, 0xc0000L, active1, 0x4L);
		case 79:
		case 111:
			if ((active0 & 0x1000000000L) != 0L)
				return jjStartNfaWithStates_0(3, 36, 48);
			return jjMoveStringLiteralDfa4_0(active0, 0x20000000000000L,
					active1, 0x8L);
		case 82:
		case 114:
			if ((active0 & 0x8000L) != 0L)
				return jjStartNfaWithStates_0(3, 15, 48);
			return jjMoveStringLiteralDfa4_0(active0, 0xa000000000000000L,
					active1, 0x100L);
		case 83:
		case 115:
			return jjMoveStringLiteralDfa4_0(active0, 0x2000000L, active1, 0L);
		case 84:
		case 116:
			if ((active0 & 0x4000000L) != 0L)
				return jjStartNfaWithStates_0(3, 26, 48);
			else if ((active0 & 0x40000000000000L) != 0L)
				return jjStartNfaWithStates_0(3, 54, 48);
			return jjMoveStringLiteralDfa4_0(active0, 0x800000L, active1,
					0x800L);
		case 85:
		case 117:
			return jjMoveStringLiteralDfa4_0(active0, 0x140040000000L, active1,
					0x20L);
		case 87:
		case 119:
			return jjMoveStringLiteralDfa4_0(active0, 0x800L, active1, 0L);
		case 89:
		case 121:
			if ((active0 & 0x4000000000000L) != 0L)
				return jjStartNfaWithStates_0(3, 50, 48);
			break;
		default:
			break;
		}
		return jjStartNfa_0(2, active0, active1);
	}

	private final int jjMoveStringLiteralDfa4_0(long old0, long active0,
			long old1, long active1) {
		if (((active0 &= old0) | (active1 &= old1)) == 0L)
			return jjStartNfa_0(2, old0, old1);
		try {
			curChar = input_stream.readChar();
		} catch (java.io.IOException e) {
			jjStopStringLiteralDfa_0(3, active0, active1);
			return 4;
		}
		switch (curChar) {
		case 66:
		case 98:
			return jjMoveStringLiteralDfa5_0(active0, 0x200000000000000L,
					active1, 0L);
		case 67:
		case 99:
			return jjMoveStringLiteralDfa5_0(active0, 0x800000000000000L,
					active1, 0L);
		case 69:
		case 101:
			if ((active0 & 0x2000000000000000L) != 0L)
				return jjStartNfaWithStates_0(4, 61, 48);
			else if ((active1 & 0x2L) != 0L)
				return jjStartNfaWithStates_0(4, 65, 48);
			else if ((active1 & 0x100L) != 0L)
				return jjStartNfaWithStates_0(4, 72, 48);
			else if ((active1 & 0x800L) != 0L)
				return jjStartNfaWithStates_0(4, 75, 48);
			return jjMoveStringLiteralDfa5_0(active0, 0x1000000052800L,
					active1, 0x20L);
		case 71:
		case 103:
			return jjMoveStringLiteralDfa5_0(active0, 0x400000000L, active1, 0L);
		case 72:
		case 104:
			return jjMoveStringLiteralDfa5_0(active0, 0L, active1, 0xc0L);
		case 73:
		case 105:
			return jjMoveStringLiteralDfa5_0(active0, 0x400000820000L, active1,
					0L);
		case 76:
		case 108:
			return jjMoveStringLiteralDfa5_0(active0, 0x4000000000000000L,
					active1, 0L);
		case 78:
		case 110:
			if ((active1 & 0x8L) != 0L)
				return jjStartNfaWithStates_0(4, 67, 48);
			return jjMoveStringLiteralDfa5_0(active0, 0x80000000L, active1, 0L);
		case 80:
		case 112:
			if ((active0 & 0x40000000L) != 0L)
				return jjStartNfaWithStates_0(4, 30, 48);
			break;
		case 82:
		case 114:
			if ((active0 & 0x10000000000000L) != 0L)
				return jjStartNfaWithStates_0(4, 52, 48);
			else if ((active0 & 0x20000000000000L) != 0L)
				return jjStartNfaWithStates_0(4, 53, 48);
			return jjMoveStringLiteralDfa5_0(active0, 0x100a00001000L, active1,
					0L);
		case 83:
		case 115:
			if ((active0 & 0x40000000000L) != 0L)
				return jjStartNfaWithStates_0(4, 42, 48);
			return jjMoveStringLiteralDfa5_0(active0, 0L, active1, 0x4L);
		case 84:
		case 116:
			if ((active0 & 0x80000L) != 0L)
				return jjStartNfaWithStates_0(4, 19, 48);
			else if ((active0 & 0x8000000L) != 0L)
				return jjStartNfaWithStates_0(4, 27, 48);
			else if ((active0 & 0x8000000000000000L) != 0L)
				return jjStartNfaWithStates_0(4, 63, 48);
			return jjMoveStringLiteralDfa5_0(active0, 0x2200000L, active1,
					0x10L);
		case 85:
		case 117:
			return jjMoveStringLiteralDfa5_0(active0, 0x1000000L, active1, 0L);
		default:
			break;
		}
		return jjStartNfa_0(3, active0, active1);
	}

	private final int jjMoveStringLiteralDfa5_0(long old0, long active0,
			long old1, long active1) {
		if (((active0 &= old0) | (active1 &= old1)) == 0L)
			return jjStartNfa_0(3, old0, old1);
		try {
			curChar = input_stream.readChar();
		} catch (java.io.IOException e) {
			jjStopStringLiteralDfa_0(4, active0, active1);
			return 5;
		}
		switch (curChar) {
		case 65:
		case 97:
			return jjMoveStringLiteralDfa6_0(active0, 0x200100000002000L,
					active1, 0xc4L);
		case 67:
		case 99:
			return jjMoveStringLiteralDfa6_0(active0, 0x40000L, active1, 0L);
		case 69:
		case 101:
			if ((active0 & 0x200000L) != 0L)
				return jjStartNfaWithStates_0(5, 21, 48);
			else if ((active1 & 0x10L) != 0L)
				return jjStartNfaWithStates_0(5, 68, 48);
			return jjMoveStringLiteralDfa6_0(active0, 0x400000800L, active1, 0L);
		case 71:
		case 103:
			if ((active0 & 0x80000000L) != 0L)
				return jjStartNfaWithStates_0(5, 31, 48);
			break;
		case 73:
		case 105:
			return jjMoveStringLiteralDfa6_0(active0, 0x4000000000000000L,
					active1, 0L);
		case 78:
		case 110:
			return jjMoveStringLiteralDfa6_0(active0, 0x810000L, active1, 0L);
		case 82:
		case 114:
			if ((active0 & 0x1000000000000L) != 0L)
				return jjStartNfaWithStates_0(5, 48, 48);
			break;
		case 83:
		case 115:
			if ((active0 & 0x2000000L) != 0L)
				return jjStartNfaWithStates_0(5, 25, 48);
			else if ((active1 & 0x20L) != 0L)
				return jjStartNfaWithStates_0(5, 69, 48);
			return jjMoveStringLiteralDfa6_0(active0, 0x801000000L, active1, 0L);
		case 84:
		case 116:
			if ((active0 & 0x20000L) != 0L)
				return jjStartNfaWithStates_0(5, 17, 48);
			else if ((active0 & 0x200000000L) != 0L)
				return jjStartNfaWithStates_0(5, 33, 48);
			else if ((active0 & 0x400000000000L) != 0L)
				return jjStartNfaWithStates_0(5, 46, 48);
			else if ((active0 & 0x800000000000000L) != 0L)
				return jjStartNfaWithStates_0(5, 59, 48);
			break;
		case 89:
		case 121:
			return jjMoveStringLiteralDfa6_0(active0, 0x1000L, active1, 0L);
		default:
			break;
		}
		return jjStartNfa_0(4, active0, active1);
	}

	private final int jjMoveStringLiteralDfa6_0(long old0, long active0,
			long old1, long active1) {
		if (((active0 &= old0) | (active1 &= old1)) == 0L)
			return jjStartNfa_0(4, old0, old1);
		try {
			curChar = input_stream.readChar();
		} catch (java.io.IOException e) {
			jjStopStringLiteralDfa_0(5, active0, active1);
			return 6;
		}
		switch (curChar) {
		case 95:
			return jjMoveStringLiteralDfa7_0(active0, 0x1000L, active1, 0L);
		case 67:
		case 99:
			return jjMoveStringLiteralDfa7_0(active0, 0x200000000800000L,
					active1, 0x4L);
		case 69:
		case 101:
			return jjMoveStringLiteralDfa7_0(active0, 0x800000000L, active1, 0L);
		case 73:
		case 105:
			return jjMoveStringLiteralDfa7_0(active0, 0x1000000L, active1, 0L);
		case 76:
		case 108:
			if ((active0 & 0x100000000000L) != 0L)
				return jjStartNfaWithStates_0(6, 44, 48);
			break;
		case 78:
		case 110:
			if ((active0 & 0x800L) != 0L)
				return jjStartNfaWithStates_0(6, 11, 48);
			else if ((active0 & 0x2000L) != 0L)
				return jjStartNfaWithStates_0(6, 13, 48);
			return jjMoveStringLiteralDfa7_0(active0, 0x4000000000000000L,
					active1, 0L);
		case 82:
		case 114:
			if ((active0 & 0x400000000L) != 0L)
				return jjStartNfaWithStates_0(6, 34, 48);
			else if ((active1 & 0x80L) != 0L) {
				jjmatchedKind = 71;
				jjmatchedPos = 6;
			}
			return jjMoveStringLiteralDfa7_0(active0, 0L, active1, 0x40L);
		case 84:
		case 116:
			if ((active0 & 0x10000L) != 0L)
				return jjStartNfaWithStates_0(6, 16, 48);
			else if ((active0 & 0x40000L) != 0L)
				return jjStartNfaWithStates_0(6, 18, 48);
			break;
		default:
			break;
		}
		return jjStartNfa_0(5, active0, active1);
	}

	private final int jjMoveStringLiteralDfa7_0(long old0, long active0,
			long old1, long active1) {
		if (((active0 &= old0) | (active1 &= old1)) == 0L)
			return jjStartNfa_0(5, old0, old1);
		try {
			curChar = input_stream.readChar();
		} catch (java.io.IOException e) {
			jjStopStringLiteralDfa_0(6, active0, active1);
			return 7;
		}
		switch (curChar) {
		case 50:
			if ((active1 & 0x40L) != 0L)
				return jjStartNfaWithStates_0(7, 70, 11);
			break;
		case 67:
		case 99:
			return jjMoveStringLiteralDfa8_0(active0, 0x800000000L, active1, 0L);
		case 73:
		case 105:
			return jjMoveStringLiteralDfa8_0(active0, 0x1000L, active1, 0L);
		case 75:
		case 107:
			if ((active0 & 0x200000000000000L) != 0L)
				return jjStartNfaWithStates_0(7, 57, 48);
			break;
		case 84:
		case 116:
			if ((active0 & 0x800000L) != 0L)
				return jjStartNfaWithStates_0(7, 23, 48);
			else if ((active0 & 0x4000000000000000L) != 0L)
				return jjStartNfaWithStates_0(7, 62, 48);
			return jjMoveStringLiteralDfa8_0(active0, 0L, active1, 0x4L);
		case 86:
		case 118:
			return jjMoveStringLiteralDfa8_0(active0, 0x1000000L, active1, 0L);
		default:
			break;
		}
		return jjStartNfa_0(6, active0, active1);
	}

	private final int jjMoveStringLiteralDfa8_0(long old0, long active0,
			long old1, long active1) {
		if (((active0 &= old0) | (active1 &= old1)) == 0L)
			return jjStartNfa_0(6, old0, old1);
		try {
			curChar = input_stream.readChar();
		} catch (java.io.IOException e) {
			jjStopStringLiteralDfa_0(7, active0, active1);
			return 8;
		}
		switch (curChar) {
		case 69:
		case 101:
			if ((active0 & 0x1000000L) != 0L)
				return jjStartNfaWithStates_0(8, 24, 48);
			break;
		case 73:
		case 105:
			return jjMoveStringLiteralDfa9_0(active0, 0L, active1, 0x4L);
		case 78:
		case 110:
			return jjMoveStringLiteralDfa9_0(active0, 0x1000L, active1, 0L);
		case 84:
		case 116:
			if ((active0 & 0x800000000L) != 0L)
				return jjStartNfaWithStates_0(8, 35, 48);
			break;
		default:
			break;
		}
		return jjStartNfa_0(7, active0, active1);
	}

	private final int jjMoveStringLiteralDfa9_0(long old0, long active0,
			long old1, long active1) {
		if (((active0 &= old0) | (active1 &= old1)) == 0L)
			return jjStartNfa_0(7, old0, old1);
		try {
			curChar = input_stream.readChar();
		} catch (java.io.IOException e) {
			jjStopStringLiteralDfa_0(8, active0, active1);
			return 9;
		}
		switch (curChar) {
		case 79:
		case 111:
			return jjMoveStringLiteralDfa10_0(active0, 0L, active1, 0x4L);
		case 84:
		case 116:
			return jjMoveStringLiteralDfa10_0(active0, 0x1000L, active1, 0L);
		default:
			break;
		}
		return jjStartNfa_0(8, active0, active1);
	}

	private final int jjMoveStringLiteralDfa10_0(long old0, long active0,
			long old1, long active1) {
		if (((active0 &= old0) | (active1 &= old1)) == 0L)
			return jjStartNfa_0(8, old0, old1);
		try {
			curChar = input_stream.readChar();
		} catch (java.io.IOException e) {
			jjStopStringLiteralDfa_0(9, active0, active1);
			return 10;
		}
		switch (curChar) {
		case 69:
		case 101:
			return jjMoveStringLiteralDfa11_0(active0, 0x1000L, active1, 0L);
		case 78:
		case 110:
			if ((active1 & 0x4L) != 0L)
				return jjStartNfaWithStates_0(10, 66, 48);
			break;
		default:
			break;
		}
		return jjStartNfa_0(9, active0, active1);
	}

	private final int jjMoveStringLiteralDfa11_0(long old0, long active0,
			long old1, long active1) {
		if (((active0 &= old0) | (active1 &= old1)) == 0L)
			return jjStartNfa_0(9, old0, old1);
		try {
			curChar = input_stream.readChar();
		} catch (java.io.IOException e) {
			jjStopStringLiteralDfa_0(10, active0, 0L);
			return 11;
		}
		switch (curChar) {
		case 71:
		case 103:
			return jjMoveStringLiteralDfa12_0(active0, 0x1000L);
		default:
			break;
		}
		return jjStartNfa_0(10, active0, 0L);
	}

	private final int jjMoveStringLiteralDfa12_0(long old0, long active0) {
		if (((active0 &= old0)) == 0L)
			return jjStartNfa_0(10, old0, 0L);
		try {
			curChar = input_stream.readChar();
		} catch (java.io.IOException e) {
			jjStopStringLiteralDfa_0(11, active0, 0L);
			return 12;
		}
		switch (curChar) {
		case 69:
		case 101:
			return jjMoveStringLiteralDfa13_0(active0, 0x1000L);
		default:
			break;
		}
		return jjStartNfa_0(11, active0, 0L);
	}

	private final int jjMoveStringLiteralDfa13_0(long old0, long active0) {
		if (((active0 &= old0)) == 0L)
			return jjStartNfa_0(11, old0, 0L);
		try {
			curChar = input_stream.readChar();
		} catch (java.io.IOException e) {
			jjStopStringLiteralDfa_0(12, active0, 0L);
			return 13;
		}
		switch (curChar) {
		case 82:
		case 114:
			if ((active0 & 0x1000L) != 0L)
				return jjStartNfaWithStates_0(13, 12, 11);
			break;
		default:
			break;
		}
		return jjStartNfa_0(12, active0, 0L);
	}

	private final void jjCheckNAdd(int state) {
		if (jjrounds[state] != jjround) {
			jjstateSet[jjnewStateCnt++] = state;
			jjrounds[state] = jjround;
		}
	}

	private final void jjAddStates(int start, int end) {
		do {
			jjstateSet[jjnewStateCnt++] = jjnextStates[start];
		} while (start++ != end);
	}

	private final void jjCheckNAddTwoStates(int state1, int state2) {
		jjCheckNAdd(state1);
		jjCheckNAdd(state2);
	}

	private final void jjCheckNAddStates(int start, int end) {
		do {
			jjCheckNAdd(jjnextStates[start]);
		} while (start++ != end);
	}

	private final void jjCheckNAddStates(int start) {
		jjCheckNAdd(jjnextStates[start]);
		jjCheckNAdd(jjnextStates[start + 1]);
	}

	static final long[] jjbitVec0 = { 0x0L, 0x0L, 0xffffffffffffffffL,
			0xffffffffffffffffL };

	private final int jjMoveNfa_0(int startState, int curPos) {
		int[] nextStates;
		int startsAt = 0;
		jjnewStateCnt = 47;
		int i = 1;
		jjstateSet[0] = startState;
		int j, kind = 0x7fffffff;
		for (;;) {
			if (++jjround == 0x7fffffff)
				ReInitRounds();
			if (curChar < 64) {
				long l = 1L << curChar;
				MatchLoop: do {
					switch (jjstateSet[--i]) {
					case 2:
						if ((0x3ff000000000000L & l) != 0L) {
							if (kind > 76)
								kind = 76;
							jjCheckNAddStates(0, 6);
						} else if (curChar == 46)
							jjCheckNAddTwoStates(27, 37);
						else if (curChar == 34)
							jjCheckNAddTwoStates(24, 25);
						else if (curChar == 39)
							jjCheckNAddTwoStates(19, 20);
						else if (curChar == 58)
							jjstateSet[jjnewStateCnt++] = 13;
						else if (curChar == 47)
							jjstateSet[jjnewStateCnt++] = 3;
						else if (curChar == 45)
							jjstateSet[jjnewStateCnt++] = 0;
						break;
					case 48:
					case 11:
						if ((0x3ff001000000000L & l) == 0L)
							break;
						if (kind > 82)
							kind = 82;
						jjCheckNAdd(11);
						break;
					case 47:
						if ((0x3ff000000000000L & l) != 0L) {
							if (kind > 76)
								kind = 76;
							jjCheckNAdd(37);
						}
						if ((0x3ff000000000000L & l) != 0L) {
							if (kind > 76)
								kind = 76;
							jjCheckNAddTwoStates(27, 28);
						}
						break;
					case 0:
						if (curChar != 45)
							break;
						if (kind > 80)
							kind = 80;
						jjCheckNAdd(1);
						break;
					case 1:
						if ((0xffffffffffffdbffL & l) == 0L)
							break;
						if (kind > 80)
							kind = 80;
						jjCheckNAdd(1);
						break;
					case 3:
						if (curChar == 42)
							jjCheckNAddTwoStates(4, 5);
						break;
					case 4:
						if ((0xfffffbffffffffffL & l) != 0L)
							jjCheckNAddTwoStates(4, 5);
						break;
					case 5:
						if (curChar == 42)
							jjCheckNAddStates(7, 9);
						break;
					case 6:
						if ((0xffff7bffffffffffL & l) != 0L)
							jjCheckNAddTwoStates(7, 5);
						break;
					case 7:
						if ((0xfffffbffffffffffL & l) != 0L)
							jjCheckNAddTwoStates(7, 5);
						break;
					case 8:
						if (curChar == 47 && kind > 81)
							kind = 81;
						break;
					case 9:
						if (curChar == 47)
							jjstateSet[jjnewStateCnt++] = 3;
						break;
					case 12:
						if (curChar == 58)
							jjstateSet[jjnewStateCnt++] = 13;
						break;
					case 14:
						if ((0x3ff001000000000L & l) == 0L)
							break;
						if (kind > 85)
							kind = 85;
						jjAddStates(10, 11);
						break;
					case 15:
						if (curChar == 46)
							jjstateSet[jjnewStateCnt++] = 16;
						break;
					case 17:
						if ((0x3ff001000000000L & l) == 0L)
							break;
						if (kind > 85)
							kind = 85;
						jjstateSet[jjnewStateCnt++] = 17;
						break;
					case 18:
						if (curChar == 39)
							jjCheckNAddTwoStates(19, 20);
						break;
					case 19:
						if ((0xffffff7fffffffffL & l) != 0L)
							jjCheckNAddTwoStates(19, 20);
						break;
					case 20:
						if (curChar != 39)
							break;
						if (kind > 86)
							kind = 86;
						jjstateSet[jjnewStateCnt++] = 21;
						break;
					case 21:
						if (curChar == 39)
							jjCheckNAddTwoStates(22, 20);
						break;
					case 22:
						if ((0xffffff7fffffffffL & l) != 0L)
							jjCheckNAddTwoStates(22, 20);
						break;
					case 23:
						if (curChar == 34)
							jjCheckNAddTwoStates(24, 25);
						break;
					case 24:
						if ((0xfffffffbffffdbffL & l) != 0L)
							jjCheckNAddTwoStates(24, 25);
						break;
					case 25:
						if (curChar == 34 && kind > 87)
							kind = 87;
						break;
					case 26:
						if (curChar == 46)
							jjCheckNAddTwoStates(27, 37);
						break;
					case 27:
						if ((0x3ff000000000000L & l) == 0L)
							break;
						if (kind > 76)
							kind = 76;
						jjCheckNAddTwoStates(27, 28);
						break;
					case 29:
						if ((0x280000000000L & l) != 0L)
							jjAddStates(12, 13);
						break;
					case 30:
						if (curChar == 46)
							jjCheckNAdd(31);
						break;
					case 31:
						if ((0x3ff000000000000L & l) == 0L)
							break;
						if (kind > 76)
							kind = 76;
						jjCheckNAdd(31);
						break;
					case 32:
						if ((0x3ff000000000000L & l) == 0L)
							break;
						if (kind > 76)
							kind = 76;
						jjCheckNAddStates(14, 16);
						break;
					case 33:
						if ((0x3ff000000000000L & l) == 0L)
							break;
						if (kind > 76)
							kind = 76;
						jjCheckNAdd(33);
						break;
					case 34:
						if ((0x3ff000000000000L & l) == 0L)
							break;
						if (kind > 76)
							kind = 76;
						jjCheckNAddTwoStates(34, 35);
						break;
					case 35:
						if (curChar == 46)
							jjCheckNAdd(36);
						break;
					case 36:
						if ((0x3ff000000000000L & l) == 0L)
							break;
						if (kind > 76)
							kind = 76;
						jjCheckNAdd(36);
						break;
					case 37:
						if ((0x3ff000000000000L & l) == 0L)
							break;
						if (kind > 76)
							kind = 76;
						jjCheckNAdd(37);
						break;
					case 38:
						if ((0x3ff000000000000L & l) == 0L)
							break;
						if (kind > 76)
							kind = 76;
						jjCheckNAddStates(0, 6);
						break;
					case 39:
						if ((0x3ff000000000000L & l) == 0L)
							break;
						if (kind > 76)
							kind = 76;
						jjCheckNAddTwoStates(39, 28);
						break;
					case 40:
						if ((0x3ff000000000000L & l) == 0L)
							break;
						if (kind > 76)
							kind = 76;
						jjCheckNAddStates(17, 19);
						break;
					case 41:
						if (curChar == 46)
							jjCheckNAdd(42);
						break;
					case 42:
						if ((0x3ff000000000000L & l) == 0L)
							break;
						if (kind > 76)
							kind = 76;
						jjCheckNAddTwoStates(42, 28);
						break;
					case 43:
						if ((0x3ff000000000000L & l) == 0L)
							break;
						if (kind > 76)
							kind = 76;
						jjCheckNAddTwoStates(43, 44);
						break;
					case 44:
						if (curChar == 46)
							jjCheckNAdd(45);
						break;
					case 45:
						if ((0x3ff000000000000L & l) == 0L)
							break;
						if (kind > 76)
							kind = 76;
						jjCheckNAdd(45);
						break;
					case 46:
						if ((0x3ff000000000000L & l) == 0L)
							break;
						if (kind > 76)
							kind = 76;
						jjCheckNAdd(46);
						break;
					default:
						break;
					}
				} while (i != startsAt);
			} else if (curChar < 128) {
				long l = 1L << (curChar & 077);
				MatchLoop: do {
					switch (jjstateSet[--i]) {
					case 2:
					case 10:
						if ((0x7fffffe07fffffeL & l) == 0L)
							break;
						if (kind > 82)
							kind = 82;
						jjCheckNAddTwoStates(10, 11);
						break;
					case 48:
						if ((0x7fffffe87fffffeL & l) != 0L) {
							if (kind > 82)
								kind = 82;
							jjCheckNAdd(11);
						}
						if ((0x7fffffe07fffffeL & l) != 0L) {
							if (kind > 82)
								kind = 82;
							jjCheckNAddTwoStates(10, 11);
						}
						break;
					case 1:
						if (kind > 80)
							kind = 80;
						jjstateSet[jjnewStateCnt++] = 1;
						break;
					case 4:
						jjCheckNAddTwoStates(4, 5);
						break;
					case 6:
					case 7:
						jjCheckNAddTwoStates(7, 5);
						break;
					case 11:
						if ((0x7fffffe87fffffeL & l) == 0L)
							break;
						if (kind > 82)
							kind = 82;
						jjCheckNAdd(11);
						break;
					case 13:
						if ((0x7fffffe07fffffeL & l) == 0L)
							break;
						if (kind > 85)
							kind = 85;
						jjCheckNAddStates(20, 22);
						break;
					case 14:
						if ((0x7fffffe87fffffeL & l) == 0L)
							break;
						if (kind > 85)
							kind = 85;
						jjCheckNAddTwoStates(14, 15);
						break;
					case 16:
						if ((0x7fffffe07fffffeL & l) == 0L)
							break;
						if (kind > 85)
							kind = 85;
						jjCheckNAddTwoStates(16, 17);
						break;
					case 17:
						if ((0x7fffffe87fffffeL & l) == 0L)
							break;
						if (kind > 85)
							kind = 85;
						jjCheckNAdd(17);
						break;
					case 19:
						jjCheckNAddTwoStates(19, 20);
						break;
					case 22:
						jjCheckNAddTwoStates(22, 20);
						break;
					case 24:
						jjAddStates(23, 24);
						break;
					case 28:
						if ((0x2000000020L & l) != 0L)
							jjAddStates(25, 27);
						break;
					default:
						break;
					}
				} while (i != startsAt);
			} else {
				int i2 = (curChar & 0xff) >> 6;
				long l2 = 1L << (curChar & 077);
				MatchLoop: do {
					switch (jjstateSet[--i]) {
					case 1:
						if ((jjbitVec0[i2] & l2) == 0L)
							break;
						if (kind > 80)
							kind = 80;
						jjstateSet[jjnewStateCnt++] = 1;
						break;
					case 4:
						if ((jjbitVec0[i2] & l2) != 0L)
							jjCheckNAddTwoStates(4, 5);
						break;
					case 6:
					case 7:
						if ((jjbitVec0[i2] & l2) != 0L)
							jjCheckNAddTwoStates(7, 5);
						break;
					case 19:
						if ((jjbitVec0[i2] & l2) != 0L)
							jjCheckNAddTwoStates(19, 20);
						break;
					case 22:
						if ((jjbitVec0[i2] & l2) != 0L)
							jjCheckNAddTwoStates(22, 20);
						break;
					case 24:
						if ((jjbitVec0[i2] & l2) != 0L)
							jjAddStates(23, 24);
						break;
					default:
						break;
					}
				} while (i != startsAt);
			}
			if (kind != 0x7fffffff) {
				jjmatchedKind = kind;
				jjmatchedPos = curPos;
				kind = 0x7fffffff;
			}
			++curPos;
			if ((i = jjnewStateCnt) == (startsAt = 47 - (jjnewStateCnt = startsAt)))
				return curPos;
			try {
				curChar = input_stream.readChar();
			} catch (java.io.IOException e) {
				return curPos;
			}
		}
	}

	static final int[] jjnextStates = { 39, 40, 41, 28, 43, 44, 46, 5, 6, 8,
			14, 15, 30, 32, 33, 34, 35, 40, 41, 28, 13, 14, 15, 24, 25, 29, 30,
			32, };
	public static final String[] jjstrLiteralImages = { "", null, null, null,
			null, null, null, null, null, null, null, null, null, null, null,
			null, null, null, null, null, null, null, null, null, null, null,
			null, null, null, null, null, null, null, null, null, null, null,
			null, null, null, null, null, null, null, null, null, null, null,
			null, null, null, null, null, null, null, null, null, null, null,
			null, null, null, null, null, null, null, null, null, null, null,
			null, null, null, null, null, null, null, null, null, null, null,
			null, null, null, null, null, null, null, "\50", "\54", "\51",
			"\73", "\75", "\56", "\41\75", "\43", "\74\76", "\76", "\76\75",
			"\74", "\74\75", "\53", "\55", "\52", "\56\52", "\77", "\174\174",
			"\57", "\52\52", };
	public static final String[] lexStateNames = { "DEFAULT", };
	static final long[] jjtoToken = { 0xffffffffffffffe1L, 0x1fffffe41fffL, };
	static final long[] jjtoSkip = { 0x1eL, 0x30000L, };
	static final long[] jjtoSpecial = { 0x0L, 0x30000L, };
	protected SimpleCharStream input_stream;
	private final int[] jjrounds = new int[47];
	private final int[] jjstateSet = new int[94];
	protected char curChar;

	public JJParserTokenManager(SimpleCharStream stream) {
		if (SimpleCharStream.staticFlag)
			throw new Error(
					"ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
		input_stream = stream;
	}

	public JJParserTokenManager(SimpleCharStream stream, int lexState) {
		this(stream);
		SwitchTo(lexState);
	}

	public void ReInit(SimpleCharStream stream) {
		jjmatchedPos = jjnewStateCnt = 0;
		curLexState = defaultLexState;
		input_stream = stream;
		ReInitRounds();
	}

	private final void ReInitRounds() {
		int i;
		jjround = 0x80000001;
		for (i = 47; i-- > 0;)
			jjrounds[i] = 0x80000000;
	}

	public void ReInit(SimpleCharStream stream, int lexState) {
		ReInit(stream);
		SwitchTo(lexState);
	}

	public void SwitchTo(int lexState) {
		if (lexState >= 1 || lexState < 0)
			throw new TokenMgrError("Error: Ignoring invalid lexical state : "
					+ lexState + ". State unchanged.",
					TokenMgrError.INVALID_LEXICAL_STATE);
		else
			curLexState = lexState;
	}

	protected Token jjFillToken() {
		Token t = Token.newToken(jjmatchedKind);
		t.kind = jjmatchedKind;
		String im = jjstrLiteralImages[jjmatchedKind];
		t.image = (im == null) ? input_stream.GetImage() : im;
		t.beginLine = input_stream.getBeginLine();
		t.beginColumn = input_stream.getBeginColumn();
		t.endLine = input_stream.getEndLine();
		t.endColumn = input_stream.getEndColumn();
		return t;
	}

	int curLexState = 0;
	int defaultLexState = 0;
	int jjnewStateCnt;
	int jjround;
	int jjmatchedPos;
	int jjmatchedKind;

	public Token getNextToken() {
		int kind;
		Token specialToken = null;
		Token matchedToken;
		int curPos = 0;

		EOFLoop: for (;;) {
			try {
				curChar = input_stream.BeginToken();
			} catch (java.io.IOException e) {
				jjmatchedKind = 0;
				matchedToken = jjFillToken();
				matchedToken.specialToken = specialToken;
				return matchedToken;
			}

			try {
				input_stream.backup(0);
				while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
					curChar = input_stream.BeginToken();
			} catch (java.io.IOException e1) {
				continue EOFLoop;
			}
			jjmatchedKind = 0x7fffffff;
			jjmatchedPos = 0;
			curPos = jjMoveStringLiteralDfa0_0();
			if (jjmatchedKind != 0x7fffffff) {
				if (jjmatchedPos + 1 < curPos)
					input_stream.backup(curPos - jjmatchedPos - 1);
				if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L) {
					matchedToken = jjFillToken();
					matchedToken.specialToken = specialToken;
					return matchedToken;
				} else {
					if ((jjtoSpecial[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L) {
						matchedToken = jjFillToken();
						if (specialToken == null)
							specialToken = matchedToken;
						else {
							matchedToken.specialToken = specialToken;
							specialToken = (specialToken.next = matchedToken);
						}
					}
					continue EOFLoop;
				}
			}
			int error_line = input_stream.getEndLine();
			int error_column = input_stream.getEndColumn();
			String error_after = null;
			boolean EOFSeen = false;
			try {
				input_stream.readChar();
				input_stream.backup(1);
			} catch (java.io.IOException e1) {
				EOFSeen = true;
				error_after = curPos <= 1 ? "" : input_stream.GetImage();
				if (curChar == '\n' || curChar == '\r') {
					error_line++;
					error_column = 0;
				} else
					error_column++;
			}
			if (!EOFSeen) {
				input_stream.backup(1);
				error_after = curPos <= 1 ? "" : input_stream.GetImage();
			}
			throw new TokenMgrError(EOFSeen, curLexState, error_line,
					error_column, error_after, curChar,
					TokenMgrError.LEXICAL_ERROR);
		}
	}

}