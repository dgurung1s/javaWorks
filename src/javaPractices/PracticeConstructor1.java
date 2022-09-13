package javaPractices;
class Boy {
	int height;
	int weight;
	String name;
	String eyecolor;
	
	Boy (int height, int weight, String name, String eyecolor){
		this.height = height;
		this.weight = weight;
		this.name = name;
		this.eyecolor = eyecolor;
	}
	
	public static void walk() {
		System.out.println("I can walk.");
	}


	
}
public class PracticeConstructor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boy saifinfo = new Boy (6, 55, "Saif", "brown");
		saifinfo.walk();
		
		
		
	}

}
