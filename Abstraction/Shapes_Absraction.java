package Abstraction;

abstract class Shape{
	abstract void draw();
}
class Rectangle extends Shape{
	void draw() {
		System.out.println("Drawing Rectangle");
	}
}
class Circle extends Shape{
	void draw() {
		System.out.println("Drawing Circle");
	}
}
 class Shapes_Absraction {

	public static void main(String[] args) {
	 Shape s=new Circle();
	 Shape r = new Rectangle();
     s.draw();
     r.draw();
	}

}
