package javaPractices;

class Bankaccount {    
	int accountNumber;   //these are properties of class-Bankaccount
	String accountName;
	int balance;
	String phonenumber;
	String address;
	
	//Constructor (Initializer)
	Bankaccount (int accNumb, String accName, int bal){
		this.accountNumber = accNumb;
		this.accountName = accName;
		this.balance = bal;
		this.address = "US";  //Can be assigned like this but its will be default for all object created
	}
	//Method of bank
	public void deposit(int x) {
		this.balance += x;
		System.out.println("Deposit successfull. Your new balance is "+ this.balance+ ".");
	}
	public void withdraw (int x) {
		this.balance -= x;
		System.out.println("Amount withdrawn " + x + " Your new balance is "+ this.balance + ".");
	}
}

public class PracticeConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bankaccount pravinAcc = new Bankaccount (23244, "Pravin", 1000);
		pravinAcc.phonenumber = "5735552627";
		
		System.out.println(pravinAcc.accountNumber + " " + pravinAcc.accountName + " " + pravinAcc.balance);
		System.out.println(pravinAcc.address);
		
		pravinAcc.deposit(2000);
		//System.out.println(pravinAcc.balance);
		
		pravinAcc.withdraw(1000);
		 
		//Practice2
		Bankaccount donaAcc = new Bankaccount(23425, "Dona", 2000);
		System.out.println(donaAcc.accountNumber + " "+ donaAcc.accountName + " " + donaAcc.balance);
		
		donaAcc.deposit(500);
		
		donaAcc.withdraw(1000);
		System.out.println(donaAcc.phonenumber); //Since there is not default phn# then it will print null 
		
		
	}

}
