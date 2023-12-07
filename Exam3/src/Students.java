
public class Students extends Person{
	
	private String status;

	public Students(String name, String address, String phoneNumber, String email, String status) {
		super(name, address, phoneNumber, email);
		this.status = status;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return super.toString() + "Students [status=" + status + "]";
	}
	
}
