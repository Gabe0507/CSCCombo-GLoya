
public class Arrays {

	public static void main(String[] args) {

		
	}
	
}

	// **** bigDuff ****
//	int[] nums = new int[4];
//	nums[0] = 22;
//	nums[1] = 12;
//	nums[2] = 14;
//	nums[3] = 13;
//	System.out.println(bigDiff(nums));
//}
//
//public static int bigDiff(int[] nums) {
//	int max = nums[0];
//	int min = nums[0];
//	for (int i = 0; i < nums.length; i++) {
//		max = Math.max(max, nums[i]);
//		min = Math.min(min, nums[i]);
//	}
//	return max - min;
//}
//**** bigDiff End ****	
	
// **** countEvens ****
//	int[] nums = new int[5];
//	nums[0] = 4;
//	nums[1] = 2;
//	nums[2] = 6;
//	nums[3] = 8;
//	nums[4] = 0;
//	System.out.println(countEvens(nums));
//}
//public static int countEvens(int[] nums) {
//	int count = 0; 
//	for (int i = 0; i < nums.length; i++){
//	     if (nums[i] % 2 == 0) count++;
//	  }
//	return count;
//	}
//**** countEvens End ****		

// **** makeMiddle ****
//	int[] nums = new int[4];
//	nums[0] = 1;
//	nums[1] = 2;
//	nums[2] = 3;
//	nums[3] = 4;
//	makeMiddle(nums);
//	for (int i = 0; i < nums.length; i++) {
//		System.out.println(nums[i]);
//	}
//}
//
//private static int[] makeMiddle(int[] nums) {
//	return new int[] {nums[nums.length/2 -1], nums[nums.length/2]}; 
//}
//**** makeMiddle End ****		

// **** biggerTwo ****
//	int[] a = new int[2];
//	int[] b = new int[2];
//	a[0] = 1;
//	a[1] = 3;
//
//	b[0] = 2;
//	b[1] = 2;
//	
//	
//	System.out.println(biggerTwo(a, b));
//}
//
//private static int[] biggerTwo(int[] a, int[] b) {
//	if (a[1] + a[0] < b[1] + a[0]) {
//		return b;
//	}else {
//		return a;
//	}
//} 
//**** biggerTwo End ****		

// **** start1 ****
//	int[] a = new int[3];
//	int[] b = new int[2];
//	a[0] = 1;
//	a[1] = 2;
//	a[2] = 3;
//
//	b[0] = 1;
//	b[1] = 3;
//
//	System.out.println(start1(a, b));
//
//}
//
//public static int start1(int[] a, int[] b) {
//	int count = 0;
//	for (int i = 0; i < a.length; i++) {
//		if (a[i] == 1) {
//			count++;
//		}
//	}
//	for (int j = 0; j < b.length; j++) {
//		if (b[j] == 1) {
//			count++;
//		}
//	}
//	return count;
//
//}
//**** start1 End ****	

// **** fix23 ****
//	int[] nums = new int[3];
//	nums[0] = 1;
//	nums[1] = 2;
//	nums[2] = 1;
//	fix23(nums);
//	for (int i = 0; i < nums.length; i++) {
//		System.out.println(nums[i]);
//	}
//
//}
//
//private static int[] fix23(int[] nums) {
//	if (nums[0] == 2 && nums[1] == 3) {
//		nums[1] = 0;
//	}
//	if (nums[1] == 2 && nums[2] == 3) {
//		nums[2] = 0;
//	}
//	return nums;
//}
//**** fix23 end ****	

// **** maxEnd3 ****
//	int[] nums = new int[3];
//	nums[0] = 1;
//	nums[1] = 2;
//	nums[2] = 3;
//	maxEnd3(nums);
//	for (int i = 0; i < nums.length; i++) {
//		System.out.println(nums[i]);
//	}
//	
//}
//
//public static int[] maxEnd3(int[] nums) {
//	if (nums[0] > nums[2]) {
//		for (int i = 0; i < nums.length; i++) {
//			nums[i] = nums[0]; 
//		}
//	}else {
//		for (int i = 0; i < nums.length; i++) {
//			nums[i] = nums[2]; 
//		}
//	}
//	return nums; 
//}
//**** maxEnd3 End****	

// **** makeLast ****
//			int[] nums = new int[3];
//			nums[0] = 4;
//			nums[1] = 5;
//			nums[2] = 6;
//			nums = makeLast(nums);
//			for (int i = 0; i < nums.length; i++ ) {
//				System.out.print(nums[i]);
//			}
//		}
//		
//		private static int[] makeLast(int[] nums) {
//			int[] num = new int[nums.length*2];
//			num[nums.length*2 - 1] = nums[nums.length -1];
//			return num;
//		}
// **** makeLast End ****

//int[] nums = new int[3];
//nums[0] = 1;
//nums[1] = 2;
//nums[3] = 3;
//
//System.out.println(fix23(nums));
//}
//
//private static int[] fix23(int[] nums) {
//for (int i = 0; i < nums.length; i++) {
//	
//}

// **** MakeLast help **** \\

// **** Makelast end ****  \\

// **** MiddleEnd **** \\	
//	int[] a = new int[3];
//	int[] b = new int[3];
//	a[0] = 1;	
//	a[1] = 2;
//	a[2] = 3;
//
//	b[0] = 4;
//	b[1] = 5;
//	b[2] = 6;
//	
//	System.out.println(middleWay(a,b));
//	
//	}
//
//	private static int[] middleWay(int[] a, int[] b) {
//		return new int[] {a[1], b[1]};
//		// help only shows mem location //
//		
//	}
// **** MiddleWay end **** \\

// **** Sum2 **** \\
//	int[] nums = new int[4];
//
//	nums[0] = 1;
//	nums[1] = 1;
//	nums[2] = 1;
//	nums[3] = 1;
//
//	System.out.println(sum2(nums));
//}
//
//private static int sum2(int[] nums) {
//	if (nums.length == 1) {
//		return nums[0];
//	} else if (nums.length == 0) {
//		return 0;
//	}
//	return nums[0] + nums[1];
//}
//**** Sum2 end **** \\ 

//	**** maxEnd3 **** \\
//	int[] nums = new int[3];
//	nums[0] = 1;
//	nums[1] = 11;
//	nums[2] = 3;
//	
//	System.out.println(maxEnd3(nums));
//}
//
//private static int[] maxEnd3(int[] nums) {
//
//} 
//**** maxEnd3 end **** \\

// **** RotateLeft3 **** \\
//	int[] nums = new int[3];
//	nums[0] = 1;
//	nums[1] = 2;
//	nums[2] = 3;
//	
//	System.out.println(rotateLeft3(nums));
//}
//
//private static int[] rotateLeft3(int[] nums) {
//	return new int[] {nums[1], nums[2], nums[0]};
//}
//**** RotateLeft3 end **** \\	

// **** Sums3 **** \\
//			int[] nums = new int[3];
//			nums[0] = 1;
//			nums[1] = 2;
//			nums[2] = 3;
//			
//			System.out.println(sums3(nums));
//			
//	}
//
//		private static int sums3(int[] nums) {
//			return nums[0] + nums[1] + nums[2];
//		}
// **** Sums3 end **** \\

// ***** CommonEnd coding bat ***** \\
//			int[] a = new int[3];
//			int[] b = new int[3];
//			a[0] = 1;
//			a[1] = 2;
//			a[2] = 3;
//
//			b[0] = 7;
//			b[1] = 3;
//			b[2] = 3;
//			System.out.println(commonEnd(a, b));
//
//		}
//
//		private static boolean commonEnd(int[] a, int[] b) {
//			if (a[0] == b[0]) {
//				return true;
//			}
//			if (a[a.length -1] == b[b.length - 1]) {
//				return true;
//			}
//			return false;
//		}
// ***** CommonEnd end ***** \\