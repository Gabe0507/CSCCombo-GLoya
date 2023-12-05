
public class RealTimeRemoteCourse extends OnlineCourse {
	//////// Data members ////////
	private int zoomInfo;
	//////Constructors //////
	public RealTimeRemoteCourse() {
		super();
	}

	public RealTimeRemoteCourse(String courseNum, int numStudents, int maxStudents, int credits, int zoomInfo) {
		super(courseNum, numStudents, maxStudents, credits);
		this.zoomInfo = zoomInfo;	
	}
	////// Getters and Setters ///////
	public int getZoomInfo() {
		return zoomInfo;
	}

	public void setZoomInfo(int zoomInfo) {
		this.zoomInfo = zoomInfo;
	}
	///// FilIO /////
	public String dbString() {
		return "Course" + "," + getCourseNum() + "," + getNumStudents() + "," + getMaxStudents() + "," + getCredits() + "," + zoomInfo;
 	}
	////// toString /////////
	@Override
	public String toString() {
		return "Course courseNum = " + this.getCourseNum() 
		+ "\n" + "numStudents = " + this.getNumStudents() 
		+ "\n" +"maxStudents = " + this.getMaxStudents() 
		+ "\n" + "credits = " + this.getCredits() 
		+ "\n" + "zoomInfo =" + zoomInfo;
	}
	
	
}
