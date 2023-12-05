
public class FullRemoteCourse extends OnlineCourse {
	/////// Data members ///////
	private String email;
	////// Constructors //////
	public FullRemoteCourse() {
		super();
	}

	public FullRemoteCourse(String courseNum, int numStudents, int maxStudents, int credits, String email) {
		super(courseNum, numStudents, maxStudents, credits);
		this.email = email;
	}
	/////// Method ///////
	public String getEmail() {
		return email;
	}
	/////// Setters ///////
	public void setEmail(String email) {
		this.email = email;
	}
	//// FileIo /////
	public String dbString() {
		return "Course" + "," + getCourseNum() + "," + getNumStudents() + "," + getMaxStudents() + "," + getCredits() + "," + email;
 	}
	
	/////// toString ///////
	@Override
	public String toString() {
		return "Course courseNum = " + this.getCourseNum() 
		+ "\n" + "numStudents = " + this.getNumStudents() 
		+ "\n" +"maxStudents = " + this.getMaxStudents() 
		+ "\n" + "credits = " + this.getCredits() 
		+ "\n" + "email =" + email;
	}

	
}	
