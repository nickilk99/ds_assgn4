package app;

import model.Car;
import model.CarStack;

public class Run {

	public static void main(String[] args) {

		Car car1 = new Car("Honda", "Civic");
		Car car2 = new Car("Toyota", "Corolla");
		Car car3 = new Car("Mazda", "3");
		Car car4 = new Car("Acura", "RSX");
		Car car5 = new Car("Hyundai", "Elantra");
		
		CarStack<Car> cars = new CarStack<Car>();
		cars.push(car1);
		cars.push(car2);
		cars.push(car3);
		cars.push(car4);
		cars.push(car5);
		
		cars.ticketService();

		

	}

}
