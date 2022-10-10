package javaPractices;

class Bank{
	public static String branchName = "Commerce";
	public String fullName;
	public String accountNumber;
	
	public Bank(String fn, String accNO) {
		this.fullName = fn;
		this.accountNumber = accNO;
	}

	public static void displayBranchName() {
		System.out.println("The branch name is :"+Bank.branchName);
}
	public void displayNameandNumber() {
		System.out.println(this.fullName + this.accountNumber);
	}
}

public class RevisionStatic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Bank.branchName);
		Bank.displayBranchName();
		
		Bank BOA = new Bank("John Kings","1893");
		BOA.displayNameandNumber();
	}

}
