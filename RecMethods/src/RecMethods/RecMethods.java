package RecMethods;

public class RecMethods {

	public static void main(String[] args) {

		int width = 3;
		int length = 5;
		
		int area = length*width;
		int perimeter + (2*width + 2*length);
		
		
		System.out.println("Before method call");
		
		getArea(width, length);
		
		System.out.println("your area is: " +  area);
		System.out.println("After method call");
		
		int perimeter = getPerimeter(width, length);
		System.out.println("your perimeter is: " + perimeter);
	}

		private static int getPerimeter(int width, int length) {
			int p = (l*2) + (2 * w);
			return p;
	}

		public static int getArea(int width, int length) {
			int area = length*width;
			return area;
			
		}
}

