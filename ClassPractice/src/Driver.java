
public class Driver {

	public static void main(String[] args) {
	Car myCar = new Car();
	Car yourCar = new Car("Blue", 42, 22.0, 4);
	
	yourCar.setWheels(15, "Alloy");
	
	
	System.out.println(yourCar.getColor() + " " + yourCar.getMileage() + " " + yourCar.getAmtOfGas());
	System.out.println(yourCar.getAmtOfGas());
	yourCar.setColor("Green");
	yourCar.setAmtOfGas(30.0);;
	System.out.println(yourCar.getColor());
	System.out.println(yourCar.getAmtOfGas());
	
	System.out.println(yourCar);
	yourCar.drive(49);
	System.out.println(yourCar);
	
	
	}

}
