
public class Person {
	private String FName;
	private String LName;
	private int age;
	private int heightInches;
	private int inches;
	private Car newCar;
	// Constructor 
	public Person(String fName, String lName, int age, int heightInches) {
		FName = fName;
		LName = lName;
		this.age = age;
		this.heightInches = heightInches;
		newCar = new Car();
	}
	// Getters
	public Car getCar() {
		return newCar;
	}

	public String getFName() {
		return FName;
	}
	
	public String getLName() {
		return LName;
	}
	
	public int getAge() {
		return age;
	}

	public int getHeightInches() {
		return heightInches;
	}
	// setter
	public void setNewCar(Car newCar) {
		this.newCar = newCar;
	}
	public void setFName(String fName) {
		FName = fName;
	}
	
	public void setHeightInches(int heightInches) {
		this.heightInches = heightInches;
	}
	
	public void setLName(String lName) {
		LName = lName;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Person first name = " + FName + ", last name = " + LName + ", age = " + age + ", height in inches =" + heightInches + "";
	}
	

}
