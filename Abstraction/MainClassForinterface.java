package Abstraction;
interface Inter1{
	public void fun1();
}
	interface Inter2 extends Inter1{
		public void fun2();
	}
	class InterImple implements Inter1,Inter2{
		public void fun1() {
			System.out.println("Interface 1");
		}
		public void fun2() {
			System.out.println("Interface 2");
		}
	}
public class MainClassForinterface {

	public static void main(String[] args) {
		InterImple obj = new InterImple();
		Inter2 obj2=obj;
		obj2.fun1();
		obj2.fun2();

	}

}
