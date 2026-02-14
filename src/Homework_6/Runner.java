package Homework_6;

public class Runner {
	    public static void main(String[] args) {

	        Car c_1 = new Car("BMW");

	        c_1.drive();

	        System.out.println("Car name: " + c_1.name);

	        Bus b_1 = new Bus("Hundai");

	        b_1.stop();

	        System.out.println("Bus name: " + b_1.name);

	        Plane p_1 = new Plane("Qutar");

	        p_1.fly();

	        System.out.println("Plane name: " + p_1.name);
	    }
}
