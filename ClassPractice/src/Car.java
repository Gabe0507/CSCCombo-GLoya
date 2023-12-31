
public class Car {
	private String color;
	private int mileage;
	private double amtOfGas;

	private Wheel[] wheels;
	private SWheel sWheel;
	
	// Constructors
	public Car() {
		color = "White";
		mileage = 1000;
		amtOfGas = 30.0;
		int numWheels = 4;
		wheels = new Wheel[numWheels];
		sWheel = new SWheel(22, "wood");
		setWheels(22, "wood");
	}
	// Constructor 
	public Car(String myColor, int mileage, double amtOfGas, int numWheels) {
		color = myColor;
		this.mileage = mileage;
		this.amtOfGas = amtOfGas;
		wheels = new Wheel[numWheels];
		sWheel = new SWheel(22, "wood");

	}
	// Getters
	
	public String getColor() {
		return color;
	}

	public Wheel[] getWheels() {
		return wheels;
	}

	public int getMileage() {
		return mileage;
	}

	public double getAmtOfGas() {
		return amtOfGas;
	}

	// Setters
	
	
	
	public void setWheels(int radius, String material) {
		for (int i = 0; i < wheels.length; i++) {
			wheels[i] = new Wheel(radius, material);
		}
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setAmtOfGas(double amtOfGas) {
		this.amtOfGas = amtOfGas;
	}

	public void drive(int milesDrive) {
		mileage += milesDrive;
		amtOfGas -= milesDrive / 17;
	}

	@Override
	public String toString() {
		Wheel[] wls = getWheels();
		return "Car color is: " + color 
				+ ", mileage is: " + mileage 
				+ ", amtOfGas is: " + amtOfGas
				+ ", Wheel size is: " + wls[0].getRadius() 
				+ ", Wheel material is: " + wls[0].getMaterial()
				+ ", Steering wheel is made of: " + sWheel.getMaterial();
	}

}
