package Encapsulation;

import java.util.Scanner;

class Encapsulation{
       private String Name;
       private int Age;
       private String Country;
  public String getname() {
    return Name;
}
  public int getage() {
    return Age;
}
  public String getcountry() {
    return Country;
}
  public void setName(String newValue) {
    Name=newValue;
}
  public void setAge(int newValue) {
    Age=newValue;
}
  public void setCountry(String newValue) {
    Country=newValue;
}
} 
public class Sample_prg {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Encapsulation obj=new Encapsulation();
		String Name=s.next();
		obj.setName(Name);
		int Age=s.nextInt();
		obj.setAge(Age);
		String Country=s.next();
		obj.setCountry(Country);
		System.out.println("Name: "+obj.getname());
		System.out.println("Age: "+obj.getage());
		System.out.println("Country: "+obj.getcountry());
	}

}
