import java.util.ArrayList;
import java.util.List;

public class TestSchoolRecords {

	public static void main(String[] args) {
		List<Person>persons = new ArrayList<>(); 
	
		Person person1 = new Students("Paul", "2012 South Ave", "970-412-9691", "Paulmail@mail.com", "Freshman");
		persons.add(person1);
		Person person2 = new Students("Greg", "2013 North Ave", "970-895-1234", "Gregmail@mail.com", "Sophomore");
		persons.add(person2);
		Person person3 = new Faculty("Dan", "2014 west Ave", "970-875-9887", "Danmail@mail.com", "Bp123", 10.0, "10/23/20", "Monday - Friday", " Junior");
		persons.add(person3);
		Person person4 = new Faculty("Steven", "2015 Tree Ave", "970-234-0987", "Stevenmail@mail.com", "Bp321", 12.0, "9/02/23", "Monday - Wensday", " Senior");
		persons.add(person4);
		Person person5 = new Staff("Kai", "2016 Apple Ave", "970-768-1232", "Kaimail@mail.com", "Bp198", 1200.0, "9/20/19", "Teacher");
		persons.add(person5);
		Person person6 = new Staff("Bob", "2017 Leaf Ave", "970-345-6753", "Bobmail@mail.com", "Bp457", 4600.0, "9/12/06", "Teacher");
		persons.add(person6);	
		
		//	printPerson(person1);
		//	printPerson(persons.get(2));
			printPersons(persons);
	}
	private static void printPersons(List<Person> persons) {
		for (Person person : persons ) {
			printPerson(person);
		}
	}

	public static void printPerson(Person person) {
		System.out.println(person.toString());
	}
}
