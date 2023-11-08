
public class Horse extends Animal {
	private double speed;
	public Horse(double length, double heigth, double speed) {
		super(length, heigth);
		this.speed = speed;
	}
	
	public String makeNoise() {
		return "Horse sound!";
	}
	@Override
	public String toString() {
		return "Horse";
	}

}
