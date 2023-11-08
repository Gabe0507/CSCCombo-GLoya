
public class Student {
// Data members
	String FName;
	String LName;
	int SNumber;
	Double grade;
// Constructor 	
	public Student(String fName, String lName, int sNumber, Double grade) {
	
		FName = fName;
		LName = lName;
		SNumber = sNumber;
		this.grade = grade;
		
		
	}
// Getters
	public String getFName() {
		return FName;
	}

	public String getLName() {
		return LName;
	}

	public int getSNumber() {
		return SNumber;
	}

	public Double getGrade() {
		return grade;
	}

// Setters
	public void setSNumber(int sNumber) {
		SNumber = sNumber;
	}

	public void setGrade(Double grade) {
		this.grade = grade;
	}
// Class methods
	public boolean passedClass() {
		return grade > 69; 	
	}
	
	@Override
	public String toString() {
		return "First name: " + FName + ", Last name: " + LName + ", SNumber: " + SNumber + ", grade: " + grade;
	}
	

}
