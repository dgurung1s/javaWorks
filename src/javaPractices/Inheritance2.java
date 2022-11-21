package javaPractices;

class Flower{
	String name;
	
	public static void bloom() {
		System.out.println("Blooms in summer");
	}
}
class Marigold extends Flower{
	public static void color(){
		System.out.println("Color is yellow");
	}
}

public class Inheritance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marigold a = new Marigold();
		a.name = "Chinarose";
		a.bloom();
		a.color();
		System.out.println(a.name);
		
		
				
		
	}

}
