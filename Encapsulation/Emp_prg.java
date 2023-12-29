package Encapsulation;

import java.util.Scanner;

class Employee_details{
    private int ID;
    private String Name ;
    private double Salary ;
public int getId() {
 return ID;
}
public String getname() {
 return Name;
}
public double getsalary() {
 return Salary;
}
public void setID(int newValue) {
 ID=newValue;
}
public void setName(String newValue) {
 Name=newValue;
}
public void setSalary(double newValue) {
 Salary=newValue;
}
} 

public class Emp_prg {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.print("Employee_Details: ");
		Employee_details obj = new Employee_details();
		int ID =s.nextInt();
		obj.setID(ID);
		String Name=s.next();
		obj.setName(Name);
		Double Salary =s.nextDouble();
		obj.setSalary(Salary+2f);
		System.out.println("ID: "+obj.getId());
		System.out.println("Name: "+obj.getname());
		System.out.println("Salary: "+"$"+obj.getsalary());
	}

}
