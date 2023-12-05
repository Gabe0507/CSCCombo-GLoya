
public class ExceptionHandling {

	public static void main(String[] args) {
		int[] nums;

		try {
			nums = new int[] { 1, 2, 3 };
			// int myNum = Integer.parseInt("s45");
			// System.out.println(nums[3]);
			setIndexTen(nums);
		} catch (ArrayIndexOutOfBoundsException e) {
			nums = new int[] { 1, 2, 3, 4 };
			System.out.println(nums[3]);
			System.out.println("Not in the array try again");
			e.printStackTrace();
			System.out.println(e.getMessage());
			nums = new int[12];
			setIndexTen(nums);
		} catch (NumberFormatException e) {
			System.out.println("letters are not numbers");
		} finally {
			System.out.println("Carry on");
		}
		System.out.println("Outside of the exception");
	}

	public static void setIndexTen(int[] arr) {

		if (arr.length < 11) {
			throw new ArrayIndexOutOfBoundsException("That array is not big enough for 10 locations");
		}
		arr[10] = 5;
	}
}
