
public class Player {
	String name;
	Die die;
	
	public Player(String name, Die die) {
		super();
		this.name = name;
		this.die = die;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Die getDie() {
		return die;
	}
	public void setDie(Die die) {
		this.die = die;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", die=" + die + "]";
	}
	
	
}
