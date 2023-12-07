import java.util.Random;
public class Die {
	private int numSides;
	private int value ;
	private static Random rand = new Random();
	
	public Die(int numSides, int value) {
		super();
		this.numSides = numSides = 6;
		this.value = value = 1;
	}
	
	public int getNumSides() {
		return numSides;
	}

	public void setNumSides(int numSides) {
		this.numSides = numSides;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	public static void roll(int numSides) {
		
			
		}
	@Override
	public String toString() {
		return "Die [numSides=" + numSides + ", value=" + value + "]";
	}
	
	
}
