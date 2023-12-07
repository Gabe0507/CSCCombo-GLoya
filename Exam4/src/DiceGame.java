import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DiceGame {

	public static void main(String[] args) {
		List<Player>players = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		
		
		Player person1 = new Player(null, null); 
		
		System.out.println("Enter how many side or on the dice");
		input.nextInt();
		System.out.println("Enter how many players");
		input.nextInt();
		System.out.println("Enter name for each player");
		input.next();
	}

}
