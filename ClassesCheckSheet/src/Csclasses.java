import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Csclasses {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		////// Creates ArrayList called courseList ////// 
		List<Course> courseList = new ArrayList<>();	
		////// Gathers info and save to ArrayList //////
		Course course;
		System.out.println("Enter a 1 for a in person class." + "\n" + "Enter a 2 for a full remote class." + "\n"
				+ "Enter a 3 for real time remote");
		int num = input.nextInt();
		System.out.println("Enter the course number");
		String courseNum = input.next();
		System.out.println("Enter the number of students");
		int numStudents = input.nextInt();
		System.out.println("Enter max number students");
		int maxStudents = input.nextInt();
		System.out.println("Enter credits");
		int credits = input.nextInt();
		if (num == 1) {
			System.out.println("Enter room number");
			String roomNum = input.next();
			course = new InPersonCourse(courseNum, numStudents, maxStudents, credits, roomNum);
		} else if (num == 2) {
			System.out.println("Enter email");
			String email = input.next();
			course = new FullRemoteCourse(courseNum, numStudents, maxStudents, credits, email);
		} else {
			System.out.println("Enter Zoom information ");
			int zoominfo = input.nextInt();
			course = new RealTimeRemoteCourse(courseNum, numStudents, maxStudents, credits, zoominfo);
		}
		courseList.add(course);

		////// Passes array list to printCourseToString method //////	
		for (int i = 0; i < courseList.size(); i++) {
			printCourseToString(courseList.get(i));	
		}
	////// Passes array list to printCourse method //////
		//for ( int i = 0; i < courseList.size(); i++) {
	//		printCourse(course);
	//	}
		}
	/////// Printing details with toString() //////
	public static void printCourseToString(Course course) {
		System.out.println(course.toString() + "\n");
		}
	/////// Printing details without calling toString() //////
	public static void printCourse(Course course) {
		 System.out.println("Course number = " + course.getCourseNum());
		 System.out.println("Number of students in the class = " + course.getNumStudents());
		 System.out.println("Max number of students = " + course.getMaxStudents());
		 System.out.println("Credits = " + course.getCredits());
		 if (course instanceof InPersonCourse) {
			 System.out.println(((InPersonCourse) course).getRoomNum());
			 System.out.println();
		 }
		 if (course instanceof FullRemoteCourse) {
			 System.out.println(((FullRemoteCourse) course).getEmail());
			 System.out.println();
		 }
		 if (course instanceof RealTimeRemoteCourse) {
			 System.out.println(((RealTimeRemoteCourse) course).getZoomInfo());
		 }
	}
	}
