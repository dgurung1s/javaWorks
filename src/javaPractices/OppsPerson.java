package javaPractices;

class Person2 {
	
	int weight;
	int age;
	int height;
	String country = "Nepal ";
	
	// constructor
	Person2(int ag , int wi , int hi){
		this.age = ag;
		this.weight = wi;
		this.height = hi;	
	}
	
	
}
	public class OppsPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person2 raj = new Person2(12,44,6);
		System.out.println(raj.age);
		System.out.println(raj.weight);
		System.out.println(raj.height);
		
		
		Person2 sarita = new Person2(22,45,6);
		System.out.println(sarita.age);
		System.out.println(sarita.weight);
		System.out.println(sarita.height);
		
		System.out.println(sarita.country);
		System.out.println(raj.country);

	}

}