package javaPractices;
	//overloading  -- same methodName , Same class , different Signature or parameters
	// overriding  - same methodName , different class , same signature or parameters
	
class Pattern{
	public void display(){
		for(int i = 0; i < 10 ; i++) {
			System.out.println("*");
		}
	}
	public void display (char symbol) {
		System.out.println("");
		for(int i = 0; i < 10; i++) {
			System.out.print(symbol);
		}
	}
}
public class OverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern p1 = new Pattern ();
		p1.display();
		p1.display('$');
	}

}
