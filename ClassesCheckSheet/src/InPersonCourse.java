
public class InPersonCourse extends Course {
	////// Data members //////
	private String roomNum;
	////// Constructors //////
	public InPersonCourse() {
		super();
	}

	public InPersonCourse(String courseNum, int numStudents, int maxStudents, int credits, String roomNum) {
		super(courseNum, numStudents, maxStudents, credits);
		this.roomNum = roomNum;	
	}
	////// Method //////
	public String getRoomNum() {
		return roomNum;
	}
	////// Setter //////
	public void setRoomNum(String roomNum) {
		this.roomNum = roomNum;
	}
	///// FileIO /////
	public String dbString() {
		return "Course" + "," + getCourseNum() + "," + getNumStudents() + "," + getMaxStudents() + "," + getCredits() + "," + roomNum;
 	}
	/////// toString ////////
	@Override
	public String toString() {
		return "Course courseNum = " + this.getCourseNum() 
				+ "\n" + "numStudents = " + this.getNumStudents() 
				+ "\n" +"maxStudents = " + this.getMaxStudents() 
				+ "\n"+ "credits = " + this.getCredits()
				+ "\n" + "room number = " + roomNum;
	}


	
}
