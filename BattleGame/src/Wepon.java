
public class Wepon {
	private String name;
	private int dmg;
	public Wepon() {
	}
	public Wepon(String name, int dmg) {
		super();
		this.name = name;
		this.dmg = dmg;
	}
	// Getters
	public String getName() {
		return name;
	}

	public int getDmg() {
		return dmg;
	}
	// Setters
	public void setName(String name) {
		this.name = name;
	}
	public void setDmg(int dmg) {
		this.dmg = dmg;
	}
	@Override
	public String toString() {
		return "Name of wepon " + name + "\ndmg is " + dmg;
	}
	
}
