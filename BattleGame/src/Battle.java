import java.util.Random;

public class Battle {
	static Random random = new Random();
	public static void main(String[] args) {
		
//		System.out.println(fighter);
		Character fighter = new Character("fighter", 100, 8, 0.7);
		fighter.setWepon("Cool axe", 5);
		
		Character monster = new Character("paul the monster", 110, 10, 0.3);
		monster.setWepon("claws", 8);
		
		Wepon arrow = new RangedWepon("Arrow", 3, 20);
		System.out.println(arrow);
		
		
		while (!monster.isDead() && !fighter.isDead()) {
			int turn = random.nextInt(1, 3);
			if (turn == 1) {
				double damage = fighter.doDamage();
				monster.receiveDamage(damage);
				System.out.println("Fighter did " + damage + " damage to the monster");
			}
			else {
				double damage = monster.doDamage();
				fighter.receiveDamage(damage);
				System.out.println("monster did " + damage + " damage to the Fighter");

			}	
		}
		if (fighter.isDead()) {
			System.out.println("Paul the monster won");
		}else {
			System.out.println("The fighter won");
		}
	}

}
