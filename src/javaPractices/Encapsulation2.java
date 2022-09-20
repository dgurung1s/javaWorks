package javaPractices;
	//Encapsulation is binding data/class with methods
class Person3 {
	
	// private field

	private int age;
	
	// getter  method
	public int getAge() {
		return age;
	}
	
	// setter method
	
	public int setAge(int a) {
		this.age = a;
		return age ;
	}
}

public class Encapsulation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person3 m = new Person3();
		int g = m.setAge(12);
		System.out.println(g);
		
		
		int h = m.getAge();
		System.out.println(h);
		
		//System.out.println(m.age);
	}

}
