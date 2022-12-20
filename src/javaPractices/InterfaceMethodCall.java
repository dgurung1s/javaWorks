package javaPractices;

public class InterfaceMethodCall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Interface Enrollment
		
		StudentInfo prithvi = new StudentInfo();
		prithvi.getFirstName("Prithvi");
		prithvi.getLastName("Chauhan");
		prithvi.getRollNumber(07);
		
		
		System.out.println(" ");
		System.out.println("Call From TWO INTERFACE implemented");
		System.out.println(" ");
		
		//Interface CreditCard and BankInfo
		CardHolder raj = new CardHolder();
		raj.getFirstName("Raj");
		raj.getLastName("Gurung");
		raj.getAccountNumber(2400568);
		raj.getSocialSecurity("254-06-4587");
		raj.getAddressLine1("405 North Sprigg St");
		raj.getCity("Cape Girardeau");
		raj.getZipcode(63701);
		
		System.out.println(" ");
		System.out.println(" ");
		
		//Interface MathFormula
		Square a = new Square();
		a.getArea(5, 5);
		
		Rectangle a1 = new Rectangle();
		a1.getArea(15, 6);
		
		
		
	}

}
