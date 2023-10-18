
public class Wheel {
	private int radius;
	private String material;
	
	public Wheel(int radius, String material) {
		this.radius = radius;
		this.material = material;
	}

	/**
	 * @return the radius
	 */
	public int getRadius() {
		return radius;
	}

	/**
	 * @return the material
	 */
	public String getMaterial() {
		return material;
	}

	@Override
	public String toString() {
		return "radius of the wheel is: " + radius + "of the wheel is: " + material + "";
	}
	
	
}
