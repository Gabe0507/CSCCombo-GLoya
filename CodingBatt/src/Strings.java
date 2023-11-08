
public class Strings {
	public static void main(String[] args) {

		String str = "catdog";
		System.out.println(catDog(str));
	}

	public static boolean catDog(String str) {
		int cats = 0;
		int dogs = 0;
		for (int i = 0; i < str.length() -2; i++) {
			String word = str.substring(i, i + 3);
			if (word.equals("cat"))  {
				cats ++;
			}
			if (word.equals("dog")) {
				dogs ++; 
			}
		if (dogs == cats && dogs != 0) {
			return true;
		}
		}
		return false;
		
		}
}

// **** countCode ****
//	String str = "coAcodeBcoleccoreDD";
//	System.out.println(countCode(str));
//}	
//public static int countCode(String str) {
//	  int count = 0;
//	  String co = "co";
//	  String e = "e";
//	  if (str.length() < 4)
//	    return 0;
//	  for (int i = 0; i < str.length() - 3; i++) {
//	    if (co.compareTo(str.substring(i,i+2)) == 0 && e.compareTo(str.substring(i+3, i+4)) == 0)
//	      count++;
//	  }
//	  return count;
//	}
//**** countCode End **** 	

// **** catDog ****
//	String str = "hello";
//
//	System.out.println(catDog(str));
//
//}
//
//public static boolean catDog(String str) {
//	int cat = 0;
//	int dog = 0;
//	for (int i = 0; i < str.length() - 2; i++) {
//		String word = str.substring(i, i + 3);
//		if (word.compareTo("cat") == 0) {
//			cat++;
//		} else if (word.compareTo("dog") == 0) {
//			dog++;
//		} else {
//
//		}
//
//	}
//	if (cat == dog) {
//		return true;
//	} else {
//		return false;
//	}
//}
// **** catDog End ****	

// **** left2 ****
//	String str = "Hello";
//	System.out.println(left2(str));
//}
//public static String left2(String str) {
//	  return str.substring(2, str.length()) + str.substring(0,2);
//	}
//**** left2 end ****		

// **** comboString ****
//	String a = "Hello";
//	String b = "Hi";
//	System.out.println(comboString(a, b));
//}
//public static String comboString(String a, String b) {
//	  if (a.length() < b.length()){
//	    return a + b + a;
//	  }
//	  else{
//	    return b + a + b;
//	  }
//	}
//**** coomboString end ****	

// **** firstTwo ****
//	String str = "Hello";
//	System.out.println(firstTwo(str));
//	
//}
//public static String firstTwo(String str) {
//	if (str.length() < 2){
//	  return str;
//	}else{
//	  return str.substring(0,2);
//	}
//	}
//**** firstTwo end ****		

// **** ExtraEnd **** 
//		String str = "Hello";
//		System.out.println(extraEnd(str));
//	}
//
//	private static String extraEnd(String str) {
//		return str.substring(str.length()-2, str.length()) + str.substring(str.length()-2, str.length()) + str.substring(str.length()-2, str.length());
//	}
//}
// **** ExtraEnd End **** 	

//**** makeOutWord ****

//		String out = "<<>>";
//		String word = "Yay";
//		System.out.println(makeOutWord(out, word));
//		
//	}
//
//	private static String makeOutWord(String out, String word) {
//		return out.substring(0,2) + word + out.substring(2,4);
//	}
//**** makeOutWord end ****

// **** makeTags ****
//		String tag = "i";
//		String word = "Yay";
//		System.out.println(makeTags(tag, word));	
//}
//
//	private static String makeTags(String tag, String word) {
//		return "<" + tag + ">" + word + "</" + tag + ">";
//	}
// **** MakeTags end ****	
