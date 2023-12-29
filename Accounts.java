import java.io.*;
import java.util.Scanner;
public class Accounts {
	static int Acc_id;
	static String Acc_name;
	static String address;
	static long contact;
	static int deposit_amount;
	
	static void display(int Acc_id,String Acc_name,String address,long contact,int deposit_amount) {
		 System.out.println("Account Details");
	     System.out.println("Acouunt Id: "+Acc_id);
	     System.out.println("Account Name: "+Acc_name);
	     System.out.println("Address: "+address);
	     System.out.println("Contact: "+contact);
	     System.out.println("Deposite Amount: "+deposit_amount);
	}

	public static void main(String[] args)throws IOException{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Account Id: ");
		Acc_id = s.nextInt();
		System.out.print("Enter the Account name: ");
		Acc_name = s.next();
		System.out.print("Address: ");
	    address = s.next();
	    //s.nextLine();
	    
		DataInputStream object = new DataInputStream(System.in);
		String address = object.readLine();
		System.out.print("Contact: ");
		contact = s.nextLong();
		System.out.print("Amount: ");
		deposit_amount = s.nextInt();
		display(Acc_id,Acc_name,address,contact,deposit_amount);
		s.close();
		

	}

}
