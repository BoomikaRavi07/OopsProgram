class Bank{ // single bank inheritance
	int account_no=1305;
	String name="Ravi";
	float amount=3000;
}
public class Bank_inheritance extends Bank{
	
	void deposite(int amount) {
		this.amount+=amount;//refering the class varialbe
	}
    void withdraw(int amount) {
    	this.amount-=amount;
    }
	public static void main(String[] args) {
		Bank_inheritance si= new Bank_inheritance();
		si.deposite(1000);
        System.out.println("Account Number: "+si.account_no);
        System.out.println("Name: "+si.name);
        System.out.println("Amount: "+si.amount);
	}

}
