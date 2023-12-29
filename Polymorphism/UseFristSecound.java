package Polymorphism;
class ClassFirst{
	public void display() {
		System.out.print("lass First: display");
	}
	public void show() {
		System.out.println("Class First: show");
	}
}
class ClassSecond extends ClassFirst{
	public void display() {
		System.out.println("Class Secound: display");
	}
    public void show() {
	System.out.println("Class Secound: show");
}
}
public class UseFristSecound {

	public static void main(String[] args) {
		ClassSecond cs = new ClassSecond();
		cs.display();
		cs.show();
		}

}
