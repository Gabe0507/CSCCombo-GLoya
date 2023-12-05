import java.time.Year;
import java.util.Iterator;

public class SwitchSatatments {
	public enum Day {
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
	}

	public static void main(String[] args) {
//		for (int i = 0; i < 10; i++) {
//			switch(i) {
//			case 1:
//				System.out.println("one");
//				break;
//			case 2 :
//				System.out.println("two");
//				break;
//				default:
//					System.out.println("number");
//			}
//			if (i == 4) {
//				break;
//			}
//		}
		
//		int num = 0;
//		while (true) {
//			System.out.println("Before" + " " + num);
//			if (num == 3) {
//				num++;
//				continue;
//			}
//			if (num == 7) {
//				break;
//			}
//			System.out.println("After" + " " + num);
//			num++;
//		}
		
//		String food = "apple";
//		
//		switch (food) {
//		case "apple":
//		case "banana":
//		case "tomato":
//			System.out.println("Fruit");
//			break;
//		case "carrot":
//		case "peas":
//		case "broccoli":
//			System.out.println("Veggies");
//			break;
//		default:
//			System.out.println("nothing");
//	}	
	    Day day = Day.SATURDAY;
	    int numLetters = switch (day) {
	        case MONDAY:
	        case FRIDAY:
	        case SUNDAY:
	            System.out.println(6);
	            yield 6;
	        case TUESDAY:
	            System.out.println(7);
	            yield 7;
	        case THURSDAY:
	        case SATURDAY:
	            System.out.println(8);
	            yield 8;
	        case WEDNESDAY:
	            System.out.println(9);
	            yield 9;
	        default:
	            throw new IllegalStateException("Invalid day: " + day);
	    };
	    System.out.println(numLetters); 
	    int numLetter = 0;
	    Day days = Day.WEDNESDAY;
	    switch (day) {
	        case MONDAY, FRIDAY, SUNDAY -> numLetter = 6;
	        case TUESDAY                -> numLetter = 7;
	        case THURSDAY, SATURDAY     -> numLetter = 8;
	        case WEDNESDAY              -> numLetter = 9;
	        default -> throw new IllegalStateException("Invalid day: " + day);
	    };
	    System.out.println(numLetter);
	}

}
