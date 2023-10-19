
public class SWheel {
	private int radius;
	private String material;
	
	public SWheel(int radius, String material) {
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
		return "The steering wheels radius is: " + radius 
				+ ", the material is: " + material;
	}
	
}
