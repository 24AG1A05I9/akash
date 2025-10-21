//inheritances --->child class to the parent class using the extend keyword

class Vehicle{
	public static void main(String[] args){
	void run() {
		System.out.println("vehicle is running");
	}
}
}
class Bike extends Vehicle {
	void run(){
		System.out.println("Bike is running safely");
	}
	public static void main(String[] args){
		Bike b= new Bike();
		b.run();
	}
}
