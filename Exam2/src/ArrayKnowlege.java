
public class ArrayKnowlege {

	public static void main(String[] args) {

//		char[] characters = new char[3];
//		characters[0] = 'x';
//		characters[1] = 'c';
//		characters[2] = 'x';
//		System.out.println(hasxx(characters));
		
		int arr[] = fromToArrya(5,10); 
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	private static int[] fromToArrya(int start, int end) {
		int[] arr = new int[end - start];
		int count = 0; 
		for (int i = start; i < end; i++ ) {
			arr[count] = i;
			count ++;
		}
		return arr;
	}

	private static boolean hasxx(char[] characters) {
		for (int i = 0; i < characters.length -1; i ++ ) {
			if ( characters[i] == 'x' && characters[i + 1] == 'x') {
				return true;
			}
	
		}
		return false;
	}	

	


}
