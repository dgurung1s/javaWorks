package javaPractices;

public class PracticeConstructor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//without parameter
		Add a = new Add();
		
		//with parameter
		Mul c1 = new Mul(12,5);
		c1.Multiplication();
		
		Sub c = new Sub(30,15);
		c.Substraction();
		
		//overloaded 
		Cal d1 = new Cal();
		Cal d2 = new Cal (5);
		Cal d3 = new Cal (8,10);
		d3.Greet();
		
		
	}

}

class Add{
	int a = 20;
	int b = 10;
	// constructor with no parameter
	Add(){
		System.out.println("Addition constructor is called");
	}
	public void Addition() {
		System.out.println(this.a - this.b); //???
		
}	
	}


//Constructor with parameter
class Mul{
	int a1;
	int a2;
	Mul(int a , int b){
		this.a1 = a;
		this.a2 = b;
	
}
	public void Multiplication() {
		System.out.println(this.a1 * this.a2);
}
}

//Constructor with parameter
class Sub{
	int a1;
	int b1;

	Sub(int a , int b){
		this.a1 = a;
		this.b1 = b;
}
	public void Substraction() {
		System.out.println(this.a1 - this.b1);
	
}

}

//Overloading the constructor
class Cal{
	Cal(){
		System.out.println("Constructor without parameter called");
	}
	Cal(int a){
		System.out.println("Constructor with one parameter called");
	}
	Cal (int a , int b){
		System.out.println("Constructor with two parameter called");
	}
	public void Greet() {
		System.out.println("Hi");
	}
	
	
}
