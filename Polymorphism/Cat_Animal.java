package Polymorphism;

public class Cat_Animal extends Animal{
	public void sound(){
		super.sound();//super keyword is used to call the method of parent method
	    System.out.println("Meow");
		}
    public static void main(String[] args) {
    	Animal obj=new Cat_Animal();
		obj.sound();

	}

}
