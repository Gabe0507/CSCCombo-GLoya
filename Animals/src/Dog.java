
public class Dog extends Animal{
	private boolean drool;
	public Dog(double length, double heigth, boolean drool) {
		super(length, heigth);
		this.drool = drool;
	}
	
	public String makeNoise() {
		return "Woof!";
	}
	@Override
	public String toString() {
		return "Dog";
	}

	

}
