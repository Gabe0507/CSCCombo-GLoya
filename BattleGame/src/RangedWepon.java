
public class RangedWepon extends Wepon{
	private int range;

	public RangedWepon() {
		super();
	
	}

	public RangedWepon(String name, double power, int range) {
		super(name, power);
		this.range = range;
	}

	@Override
	public String toString() {
		return "RangedWepon range: " + range + ", weapon: " + getName() + ", Damage: " + getDamage();
	}

	
	
	
}
