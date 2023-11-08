
public class Farm {

	public static void main(String[] args) {
		Cat felix = new Cat(1.5,1.0, "Orange");
		Animal paul = new Dog(3, 2, true);
		Animal muppet = new Animal(1, 3);
		Animal greg = new Horse(6, 4, 40);
		
		System.out.println(felix);
		
		System.out.println(muppet);
		
		System.out.println(paul);
		System.out.println(paul.makeNoise());
		
		System.out.println(greg);
		System.out.println(greg.makeNoise());
	}

}
