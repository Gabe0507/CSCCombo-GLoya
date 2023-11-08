
public class TestingCenter {
	public static final int EASY = 1;
	public static final int MEDIUM = 2;
	public static final int HARD = 3;
// **** Class methods
	public static void takeTest(int level, Student students) {
		if (level == 1) {
			students.setGrade(students.getGrade() + 10);
		}
		else if (level == 2) {
			students.setGrade(students.getGrade() + 5);
		}
		else if (level == 3) {
			students.setGrade(students.getGrade() - 10);
		}
		else {
			System.out.println("Not a vaild difficulty number");
		}
		}
}
