package javaPractices;

class BloomingFlower {
	String name;  //Field
	
	public void bloom() {    //method
		System.out.println("Flower blooms in summer");
	}
}

class Rose extends BloomingFlower{
	
	//method
	public void display() {
		System.out.println(name + " is red.");
	}
}

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rose chinaRose = new Rose();
		chinaRose.name = "China Rose";
		chinaRose.bloom();
		chinaRose.display();
		
		System.out.println("break");
		
		BloomingFlower lily = new BloomingFlower();
		lily.name = "Summer lily";
		lily.bloom();
		System.out.println(lily.name);
		
	}

}
