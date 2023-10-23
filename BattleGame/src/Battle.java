
public class Battle {

	public static void main(String[] args) {
		Character fighter = new Character("fighter", 100, 15, 0.7);
		Character monster = new Character("paul the monster", 110, 17, 0.3);
		
		System.out.println(fighter);
		fighter.setWepon("Cool axe", 10);
		
		System.out.println(fighter);
		System.out.println(monster);
		
	}

}
