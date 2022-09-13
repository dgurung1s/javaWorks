package javaPractices;

class Bankaccount {    
	int accountNumber;   //these are fields/properties of class-Bankaccount
	String accountName;
	int balance;
	String phonenumber;
	String address;
	int transactionCount;
	String [] transactions = new String [5];
	
	
	//Constructor (Initializer)
	Bankaccount (int accNumb, String accName, int bal){
		this.accountNumber = accNumb;
		this.accountName = accName;
		this.balance = bal;
		this.address = "US";  //Can be assigned like this but its will be default for all object that is created
		this.transactionCount = 0;
		
	}
	//Method of bank
	public void deposit(int x) {
		this.balance += x;
		this.transactionCount += 1;
		this.transactions[transactionCount-1]="Transaction# " + transactionCount + " Amount Deposited: " + x;
		System.out.println("Deposit successfull.Your new balance is $"+ this.balance+ ".");
		System.out.println("Transaction# "+ this.transactionCount);
		//System.out.println(this.transactions[transactionCount - 1]);
	}
	public void withdraw (int x) {
		this.balance -= x;
		this.transactionCount += 1;
		this.transactions[transactionCount - 1] = "Transaction# "+ transactionCount + " Amount Withdrawn: "+ x;
		System.out.println("Amount withdrawn " + x + " Your new balance is $"+ this.balance + ".");
		System.out.println("Transaction# "+ this.transactionCount);
		//System.out.println(this.transactions[transactionCount - 1]);
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
		pravinAcc.deposit(500);
		pravinAcc.withdraw(1000);  
		
		//Show all transactions
		//for (String trans:pravinAcc.transactions ) {
		//	System.out.println(trans);    //There is null printed be
		//}
		
		
		System.out.println("");
		System.out.println("Displaying all transactions");
		 for (int x = 0; x < pravinAcc.transactionCount; x++) {
			 System.out.println(pravinAcc.transactions[x]);	 
		 }
		 System.out.println("");
		//Practice2
		Bankaccount donaAcc = new Bankaccount(23425, "Dona", 2000);
		System.out.println(donaAcc.accountNumber + " "+ donaAcc.accountName + " " + donaAcc.balance);
		
		donaAcc.deposit(500);
		
		donaAcc.withdraw(1000);
		System.out.println(donaAcc.phonenumber); //Since there is not default phn# then it will print null 
		
		
	}

}
