package javaPractices;

interface Enrollment{
	void getFirstName(String name);  //these are called defining the methods
	void getLastName(String name);
	void getRollNumber(int rollnumber);
	
}
class StudentInfo implements Enrollment{

	@Override
	public void getFirstName(String name) {       //these are called interface implementation
		// TODO Auto-generated method stub
		System.out.println("First Name: "+ name);
	}

	@Override
	public void getLastName(String name) {
		// TODO Auto-generated method stub
		System.out.println("Last Name: "+ name);
	}

	@Override
	public void getRollNumber(int rollnumber) {
		// TODO Auto-generated method stub
		System.out.println("Roll# "+ rollnumber);
	}
	
}

