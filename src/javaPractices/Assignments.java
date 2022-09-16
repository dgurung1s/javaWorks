package javaPractices;

class Animal{    //class with constructor
	String name;
	String food;
	
	Animal(String name, String food ){
		this.name = name;
		this.food = food;
	}
	//Override example
	public void displayName() {
		System.out.println(this.name);
	}
}

class Buffalo extends Animal{
	Buffalo(String name, String food){
		super(name, food);
		
	}
	@Override
	public void displayName() {
		System.out.println("This is override");
	}
}

class Cow extends Animal{
	Cow (String name, String food){
		super(name, food);
	}
}

//Overloading Example
class OverloadingEg{
	
	public void display() {
		System.out.println("Hello");
	}
	public void display(String name) {
		System.out.println(name);
	}
	
}

public class Assignments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a program to find greatest between two numbers
		
		int a = 10;
		int a1 = 5;
		if (a > a1) {
			
			System.out.println(a+ " is greater");
		}
		else {
			System.out.println(a1 +" is greater");
		}
		
		// Write any 5 methods of string
		
		String name = "Sunflower";
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.concat(" is yellow"));
		System.out.println(name.charAt(4));
		System.out.println(name.length());
		
		//
		String[] cities = {"Kathmandu","Pokhara","Butwal"};
		for (int i = 0; i < cities.length; i++) {
			System.out.println(cities[i]);
		}
		
		//
		
		//
		Animal buffalo = new Animal("Buffalo", "Grass");
		
		
		//
		
		int x = 10;
		
		while (x >=1) {
			System.out.println(x);
			x = x-1;
		}
		
		for (int y = 10; y >= 1; y--) {
			System.out.println(y);
		}
	}

}
