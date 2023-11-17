
public class Staff extends Employee {

	String title;

	public Staff(String name, String address, String phoneNumber, String email, String office, double salary, String dateHired , String title) {
		super(office, salary, dateHired);
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Staff [title=" + title + "]";
	}
	
}
