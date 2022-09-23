package javaPractices;
	//overloading  -- same methodName , Same class , different Signature
	// overriding  - same methodName , different class , same signature
class Language{
	
	public void displayInfo() {
		System.out.println("Common progamming language");
		
	}
}
class Java extends Language{
	
	@Override
	public void displayInfo() {
		System.out.println("Java Language");
		super.displayInfo();
	}
}
public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Java java = new Java ();
		java.displayInfo();
	}

}
