package ShapesDriver;

public class Circle {
	// Data members
	double circumference;
	int radius;
	String color;
	
	public Circle() {
		
	}
	
	public Circle(int radius, String color) {
		this.radius = radius;
		this.color = color;
		this.circumference = (radius * 2 * 3.14);
		
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getCircumference() {
		return circumference;
	}

	@Override
	public String toString() {
		return "Circle [circumference=" + circumference + ", radius=" + radius + ", color=" + color + "]";
	}

	
	
	
	
}
