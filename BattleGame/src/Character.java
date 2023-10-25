
public class Character {
	private String name;
	private int hp;
	private int strength;
	private double speed;
	private Wepon wepon;
	public Character() {
	}
	public Character(String name, int hp, int strength, double speed) {
		this.name = name;
		this.hp = hp;
		this.strength = strength;
		this.speed = speed;
	}
	// Getters
	public String getName() {
		return name;
	}
	
	public int getHp() {
		return hp;
	}
	
	public int getStrength() {
		return strength;
	}
	
	public double getSpeed() {
		return speed;
	}
	
	public Wepon getWepon() {
		return wepon;
	}
	// Setters
	public void setName(String name) {
		this.name = name;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void setWepon(String name, int power) {
		this.wepon = new Wepon(name, power);
	}
	
	public double doDamage() {
		double dmg = speed * strength * wepon.getDamage();
		return dmg;
	}
	public void receiveDamage(double damage) {
		hp -= damage;
	}
	public boolean isDead() {
		return hp <= 0;
	}
	
	@Override
	public String toString() {
		return "Name is " + name 
				+ "\nhp is " + hp 
				+ "\nstrength is " + strength 
				+ "\nspeed is " + speed + "\n" 
				+ wepon + "\n";
	}
	
	
}
