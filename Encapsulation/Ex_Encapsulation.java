package Encapsulation;
class Person{
	private String name;
	private int age;
	private String country;
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getCountry() {
		return country;
	}
	public void setname(String newValue) {
		name=newValue;
	}
	public void setage(int newValue) {
		age=newValue;
	}
	public void setcountry(String newValue) {
		country=newValue;
	}
public class Ex_Encapsulation {

	public static void main(String[] args) {
		Person obj=new Person();
		obj.setname("Mario");
		obj.setage(32);
		obj.setcountry("India");
		System.out.println("Empolyee Name: "+obj.getName());
		System.out.println("Empolyee Age: "+obj.getAge());
		System.out.println("Empolyee Country: "+obj.getCountry());

	}

}
