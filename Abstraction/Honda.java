package Abstraction;
abstract class Bike{
	abstract void run();//template
	void display() {
		System.out.println("Non-abstract-method");
	}
}
public class Honda extends Bike{
       
	void run() {
		System.out.println("running safely");
	}
	public static void main(String[] args) {
		Bike obj = new Honda();//referance
        obj.display();
        obj.run();
	}

}
