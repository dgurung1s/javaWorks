package javaPractices;
	
interface CreditCard{
	void getSocialSecurity(String ssn);
	void getAddressLine1(String add);
	void getCity(String city);
	void getZipcode(int zipcode);
}
interface BankInfo{
	void getFirstName(String fname);
	void getLastName(String lname);
	void getAccountNumber(int accnumber);
}

class CardHolder implements CreditCard , BankInfo{

	@Override
	public void getFirstName(String fname) {      //called interface implementation
		// TODO Auto-generated method stub
		System.out.println("First Name: "+fname);
	}

	@Override
	public void getLastName(String lname) {
		// TODO Auto-generated method stub
		System.out.println("Last Name: "+ lname);
	}

	@Override
	public void getAccountNumber(int accnumber) {
		// TODO Auto-generated method stub
		System.out.println("Account#: "+ accnumber);
	}

	@Override
	public void getSocialSecurity(String ssn) {
		// TODO Auto-generated method stub
		System.out.println("SSN#: "+ ssn);
	}

	@Override
	public void getAddressLine1(String add) {
		// TODO Auto-generated method stub
		System.out.println("Address Line1: "+ add);
	}

	@Override
	public void getCity(String city) {
		// TODO Auto-generated method stub
		System.out.println("City: "+ city);
	}

	@Override
	public void getZipcode(int zipcode) {
		// TODO Auto-generated method stub
		System.out.println("Zipcode#: "+ zipcode);
	}
	
}
