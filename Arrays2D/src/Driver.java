import java.util.Iterator;

public class Driver {

	public static void main(String[] args) {
//		int [][] manArr = {
//				{0, 1, 2, 3},
//				{4, 5, 6},
//				{7, 8, 9, 10}
//		};
//			
//		 char [][] arr = new char [3][4];
//		char letter = 'a';
//		for (int row = 0; row < arr.length; row ++) {
//			for (int col = 0; col < arr[row].length; col ++) {
//				arr[row][col] = letter;
//				letter ++;
//			}
//		}
//		for (int row = 0; row < arr.length; row ++) {
//			for (int col = 0; col < arr[row].length; col ++) {
//				System.out.print(arr[row][col] + " "); 
//			}
//			System.out.println(); 
//			
//		}
		int[][]table;
//		TimesTable[][] table2 = new TimesTable[10][10];
		
//		System.out.println(TimesTable.createTimeTable(5, 5));
		table = TimesTable.createTimeTable(5, 7);
		System.out.println(TimesTable.printTimesTable(table));
		//		 System.out.println(table2);
		 
		
	}

}
