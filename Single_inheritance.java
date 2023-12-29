class Person{
	String name;
	int age;
	void getPerInfo(String Name,int ag) {
		name=Name;
		age=ag;
	}
	void putPerInfo() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}
}
class Student extends Person{
	int total;
	char grade;
	void getStudInfo(String nam,int ag,int tot,char gr) {
		getPerInfo(nam,ag);
		total=tot;
		grade=gr;
		
	}
	void putStudInfo() {
		putPerInfo();
		System.out.println("Total: "+total);
		System.out.println("Grade: "+grade);
	}
}
public class Single_inheritance {
	public static void main(String[] args) {
		Student s=new Student();
		s.getStudInfo("Honey",22,98,'A');
		s.putStudInfo();
	}

}
