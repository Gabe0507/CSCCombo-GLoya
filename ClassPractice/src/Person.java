
public class Person {
	private String FName;
	private String LName;
	private int age;
	private int heightInches;
	private int inches;
	
	public Person(String fName, String lName, int age, int heightInches) {
		super();
		FName = fName;
		LName = lName;
		this.age = age;
		this.heightInches = heightInches;
	}
	public String getFName() {
		return FName;
	}
	public void setFName(String fName) {
		FName = fName;
	}
	public String getLName() {
		return LName;
	}
	public void setLName(String lName) {
		LName = lName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getHeightInches() {
		return heightInches;
	}
	
	public void setHeightInches(int heightInches) {
		this.heightInches = heightInches;
	}
	@Override
	public String toString() {
		return "Person first name = " + FName + ", last name = " + LName + ", age = " + age + ", height in inches=" + heightInches + "";
	}
	

}
