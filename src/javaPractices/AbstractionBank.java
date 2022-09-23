package javaPractices;
abstract class WorldBank{
	abstract void loan();
	abstract void save();
}
class BOA extends WorldBank{
	
	public void loan() {
		System.out.println("I am from loan method.");
	}
	public void save() {
		System.out.println("I am from save method.");
	}
	public void boa() {
		System.out.println("BOA method");
	}
}
class UsBank extends WorldBank{
	public void loan() {
		System.out.println("I am from loan method.");
	}
	public void save() {
		System.out.println("I am from save method.");
	}
	public void usBank() {
		System.out.println("UsBank method");
	}
}

public class AbstractionBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BOA x = new BOA ();
		x.boa();
		x.loan();
		x.save();
		
		UsBank y = new UsBank();
		y.save();
		y.loan();
		y.usBank();
	}

}
