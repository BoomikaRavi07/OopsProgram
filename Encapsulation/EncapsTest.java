package Encapsulation;
class EncapusulationDemo {
	private int ssn;
	private String empName;
	private int empAge;
//Gatter and Setter methods
 public int getEmpSSN() {
	 return ssn;
 }
 public String getEmpName() {
	 return empName;
 }
 public int getAge() {
	 return empAge;
 }
 public void setEmpAge(int newValue) {
	 empAge=newValue;
 }
 public void setEmpName(String newValue) {
	 empName=newValue;
 }
 public void setEmpSSN(int newValue) {
	 ssn=newValue;
 }
}
public class EncapsTest {

	public static void main(String[] args) {
		EncapusulationDemo obj=new EncapusulationDemo();
		obj.setEmpName("Mario");
		obj.setEmpAge(32);
		obj.setEmpSSN(11233);
		System.out.println("Empolyee Name: "+obj.getEmpName());
		System.out.println("Empolyee SSN: "+obj.getEmpSSN());
		System.out.println("Empolyee Age: "+obj.getAge());
	}

}
