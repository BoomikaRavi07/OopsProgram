package Polymorphism;

public class Horse_Animal extends Animal{
	public void sound(){
    System.out.println("Neigh");
	}
	public static void main(String[] args) {
		Animal obj=new Horse_Animal();
		obj.sound();
	}

}
