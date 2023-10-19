
public class Driver {

	public static void main(String[] args) {
		Person per = new Person("Gabe", "L", 18, 70); 
		per.getCar().drive(50);
		
		//Car myCar = new Car();
//		Car yourCar = new Car("Blue", 42, 22.0, 4);
//
//		System.out.println(yourCar.getColor() + " " + yourCar.getMileage() + " " + yourCar.getAmtOfGas());
//		System.out.println(yourCar.getAmtOfGas());
//		yourCar.setColor("Green");
//		yourCar.setAmtOfGas(30.0);
//		System.out.println(yourCar.getColor());
//		System.out.println(yourCar.getAmtOfGas());
//		yourCar.setWheels(15, "Steel");
//		System.out.println(yourCar);
//		yourCar.drive(49);
//		System.out.println(yourCar);
		
		Person gabe = new Person("Gabe", "L", 18, 70);
		gabe.getCar().drive(60);
		System.out.println(gabe.getCar());
		
	}

}
