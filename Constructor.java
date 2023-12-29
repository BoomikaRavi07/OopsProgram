import java.util.Scanner;

public class Constructor {
	
	int emp_id,salary;
	String emp_name;
	Constructor(){
		//default constructor - no parameters inside the constructor method
		emp_id = 1;
		emp_name = "Boomika";
		salary = 20000;
	}
	Constructor(int id,String name,int sal){
		emp_id = id;
		emp_name = name;
		salary = sal;
		//parameterized constructor
	}
	
	void display() {
		System.out.println("Employee Details: ");
		System.out.println("Emp_id: "+emp_id);
		System.out.println("Emp_name: "+emp_name);
		System.out.println("Employee Details: ");
		System.out.println("Salary: "+salary);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int id,salary;String name;
		System.out.print("Employee id: ");
		id = s.nextInt();
		System.out.print("Employee name: ");
		name = s.next();
		System.out.print("Salary: ");
		salary = s.nextInt();
		Constructor obj = new Constructor();
        obj.display();
        Constructor obj1=new Constructor(2,"sugan",25000);
        obj1.display();
        Constructor obj2=new Constructor(id,name,salary);
        obj2.display();
	}

}
