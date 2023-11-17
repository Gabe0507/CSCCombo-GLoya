import java.util.Arrays;

public class TimesTable {
	private int[][] timesTable;

	public TimesTable() {
		timesTable = new int[10][10];
		for (int row = 0; row < timesTable.length; row++) {
			for (int col = 0; col < timesTable[row].length; col++) {
				timesTable[row][col] = (row + 1) * (col + 1);
			}
		}
	}

	public static int[][] createTimeTable(int row, int col) {
		int[][] timesTable = new int[row][col];
		for (row = 0; row < timesTable.length; row++) {
			for (col = 0; col < timesTable[row].length; col++) {
				timesTable[row][col] = (row + 1) * (col + 1);
			}
		}
		return timesTable;
	}

	public static String printTimesTable(int[][] table2) {
		String table = "";
		for (int row = 0; row < table2.length; row++) {
			for (int col = 0; col < table2[row].length; col++) {
				table += String.format("%4d", table2[row][col]);
			}
			table += "\n";
		}
		return table;
	}

	@Override
	public String toString() {
		String ret = "TimesTable\n";
		for (int row = 0; row < timesTable.length; row++) {
			for (int col = 0; col < timesTable[row].length; col++) {
				ret += String.format("%4d", timesTable[row][col]);
			}
			ret += "\n";
		}
		return ret;
	}

}
