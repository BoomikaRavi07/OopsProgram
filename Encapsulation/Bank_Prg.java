package Encapsulation;

import java.util.Scanner;

class Bank{
    private String Account_Number;
    private float Balance;
  public String getAccount_number() {
	  return Account_Number;
  }
  public float balance() {
	  return Balance;
  }
  public void setAccount_Number(String newValue) {
	    Account_Number=newValue;
	}
  public void setBalance(float newValue) {
	    Balance=newValue;
	}
}
public class Bank_Prg {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		Bank obj = new Bank();
		String Account_Number=s.next();
		obj.setAccount_Number(Account_Number);
		float Balance =s.nextFloat();
		obj.setBalance(Balance);
		System.out.println("Account_Number "+obj.getAccount_number());
		System.out.println("Balance "+obj.balance());
	}

}
