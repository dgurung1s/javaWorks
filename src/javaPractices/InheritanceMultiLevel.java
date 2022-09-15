package javaPractices;

class GrandFather {
	String firstName;
	String lastName;
	
	GrandFather(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public void displayName() {
		System.out.println(this.firstName + " "+ this.lastName);
	}
	
}
class Father extends GrandFather{
	String fatherFirstName;
	
	//Constructor
	Father(String firstName, String lastName, String fatherFirstName){
		super(firstName, lastName);
		this.fatherFirstName = fatherFirstName;
	}
	@Override
	public void displayName() {
		System.out.println(this.fatherFirstName + " "+ this.firstName+" "+ this.lastName);
		super.displayName();
	}
	
}
class Son extends Father {
	String sonFirstName;
	
	//Constructor
	Son(String firstname, String lastName, String fatherFirstName, String sonFirstName){
		super(firstname, lastName, fatherFirstName);
		this.sonFirstName = sonFirstName;
	}
	@Override
	public void displayName() {
		System.out.println(this.sonFirstName+" "+this.fatherFirstName+" "+this.firstName+" "+this.lastName);
		super.displayName();
	}
}
public class InheritanceMultiLevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//GrandFather george = new GrandFather ("George", "Smith");
		//george.displayName();
		
		//Father charles = new Father("George", "Smith", "Charles");
		//charles.displayName();
		
		Son henry = new Son("George", "Smith","Charles", "Henry");
		henry.displayName();
	}

}
