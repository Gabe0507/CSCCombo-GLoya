package ShapesDriver;
public class ShapesDriver {

	public static void main(String[] args) {
		
//		Circle circle1 = new Circle();
		Circle circle2 = new Circle(5, "Blue");
//		Circle circle3 = new Circle(5,10,"Blue");
		
//		System.out.println(circle1);
		System.out.println(circle2.getRadius() + " " + circle2.getColor() + " " + circle2.getCircumference());
//		System.out.println(circle3);
	
		circle2.setColor("Purple");
		System.out.println(circle2.getColor());
	
		System.out.println(circle2);
	}
}
