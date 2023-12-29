package Abstraction;
interface MyInterface{
	public void method1();
	public void method2();
}
public class Interface_Abstract implements MyInterface {
	public void method1()
	{
		System.out.println("implementation of method1");
	}
    public void method2()
    {
    	System.out.println("implementation of method2");
    }
	public static void main(String[] args) {
		MyInterface obj = new Interface_Abstract();
		obj.method1();

	}

}
