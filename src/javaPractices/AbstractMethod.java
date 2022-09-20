package javaPractices;
	//abstract method- will not have body
	//a simple class can have abstract as well as normal method
	//make class abstract if there is one abstract method
abstract class Plants{
	abstract void breathin();  //abstract method
	
	public void breathout() {
		System.out.println("Give us Oxygen");
	}
	
	
}
class Sunflower extends Plants{
	
	public void breathin() {
		System.out.println("Breath in Carbon dioxide");
	}
}
public class AbstractMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sunflower s = new Sunflower();
		s.breathin();
		s.breathout();
	}

}
