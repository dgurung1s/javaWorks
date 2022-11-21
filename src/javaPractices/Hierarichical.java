package javaPractices;

class Father1{
	String firstName;
	String lastName;
	
	Father1(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public void displayName(String greet) {
		System.out.println(greet + this.firstName + this.lastName);
	}
}
class Daughter extends Father1{
	String daughterFirstName;
	
	Daughter(String firstName, String lastName, String daughterFirstName){
		super(firstName,lastName);
		this.daughterFirstName = daughterFirstName;	
	}
	public void displayName(String greet) {
		System.out.println(greet +" "+ this.daughterFirstName +" "+this.firstName+" " + this.lastName);	
	}
}
class Son1 extends Father1{
	String son1FirstName;
	
	Son1(String firstName, String lastName, String son1FirstName){
		super(firstName, lastName);
		this.son1FirstName = son1FirstName;		
}
	public void displayName(String greet) {
		System.out.println(greet + " "+ this.son1FirstName +" "+ this.lastName );
	}
}	
public class Hierarichical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Daughter dona = new Daughter("Chhabi","Gurung","Dona");
		dona.displayName("Good Afternoon !");
		Son1 vai = new Son1("Chhabi", "Gurung", "Vai");
		vai.displayName("Namaste! ");
	}

}
