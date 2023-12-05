
public class Course {
	/////// Data members ///////
	private String courseNum;
	private int numStudents;
	private int maxStudents;
	private int credits;
	/////// Constructors /////// 
	public Course() {
		super();
	}	
	public Course(String courseNum, int numStudents, int maxStudents, int credits) {
		super();
		this.courseNum = courseNum;
		this.numStudents = numStudents;
		this.maxStudents = maxStudents;
		this.credits = credits;
	}
	/////// Getters ////////
	public String getCourseNum() {
		return courseNum;
	}
	public int getNumStudents() {
		return numStudents;
	}
	public int getMaxStudents() {
		return maxStudents;
	}
	public int getCredits() {
		return credits;
	}
	//////// Setters ////////
	public void setCourseNum(String courseNum) {
		this.courseNum = courseNum;
	}
	public void setNumStudents(int numStudents) {
		this.numStudents = numStudents;
	}
	public void setMaxStudents(int maxStudents) {
		this.maxStudents = maxStudents;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}
	///// FileIo //////
	public String dbString() {
		return "Course" + "," + courseNum + "," + numStudents + "," + maxStudents + "," + credits;
 	}
	////// toString ////////
	@Override
	public String toString() {
		return "Course courseNum = " + courseNum 
				+ "\n" + "numStudents = " + numStudents 
				+ "\n" +"maxStudents = " + maxStudents 
				+ "\n"+ "credits = " + credits;
	}
	
	
}
