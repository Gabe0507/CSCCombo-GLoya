import java.util.Scanner;

public class StudentDriver {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
// ***** create array called Student *****
		Student[] students = new Student[3];
// ***** for loop that takes input and creates student object that is then stored into the students array *****		
//		for (int i = 0; i < students.length; i++ ) {
//			System.out.println("Enter first name ");
//			String fName = input.nextLine();
//
//			System.out.println("Enter last name ");
//			String lName = input.nextLine();
//
//			System.out.println("Enter Snumber ");
//			int sNumber = input.nextInt();
//			input.nextLine();
//
//			System.out.println("Enter grade ");
//			double grade = input.nextDouble();
//			input.nextLine();
//			
//			Student student = new Student(fName, lName, sNumber, grade);	
//			students[i] = student;
//		}
// ******* Hard coded students *****		
			Student student1 = new Student("g", "l", 12, 65.0);
			Student student2 = new Student("b", "b", 13, 70.0);
			Student student3 = new Student("p", "p", 14, 55.0);
			students[0] = student1;
			students[1] = student2;
			students[2] = student3;
			
// ***** For loop that passes students to testing center *****
			for (int i = 0; i < students.length; i++) {
				TestingCenter.takeTest(TestingCenter.EASY, students[i]);
			}
// ****** for loop that passes if the student passed the class or not *****
			for ( int i = 0; i < students.length; i++) {
				if (students[i].passedClass()) {
					System.out.println(students[i] + ". This student passed the class");
				} else {
					System.out.println(students[i] + ". This student didnt pass the class");
				}
				
			}

// ***** for loop that prints students array ******

		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i].toString());
		}
		
	}
}
