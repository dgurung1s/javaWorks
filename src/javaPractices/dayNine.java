package javaPractices;

public class dayNine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//DRY do not repeat yourself
		//Functions	
		Calculator(60,30);
		
		//Function without parameter and without return type
		Addition();
		
		//Function with parameter and without return type
		AdditionA(20,60);
		
		//Function with parameter and with return type
		int v = AdditionB(30,30);
		System.out.println(v);
		System.out.println(v + 2);
		System.out.println(v - 10);
		System.out.println(v * 2.5);
		
		String w2 = AdditionC(70,70);
		System.out.println(w2);
		
		//Function without parameter and without return type
		Division();
		//Function without parameter and without return type
		DivisionA(500,50);
		//Function with parameter and with return type
		int w = DivisionB (90,10);
		System.out.println(w);
		System.out.println(w - w);
		System.out.println(w * 1.5);
		
		String w1 = DivisionC(70,60);
		System.out.println(w1);
	}

	public static void Calculator(int x, int y) {  // Put function call inside main
		System.out.println(x + y);                 //VOID Type won't return
		System.out.println(x - y);
		System.out.println(x / y);
		System.out.println(x % y);   
	}
	
	//Function without parameter and without return type
	
	public static void Addition() {
		System.out.println(15 + 25);
	}
	
	//Function with parameter and without return type
	
	public static void AdditionA(int x,int y) {      //set parameter and put call value above
		System.out.println(x + y);
	}
	
	//Function with parameter and with return type
	
	public static int AdditionB(int x,int y) {
		return x + y; 
    }
	
	public static String AdditionC(int x, int y) {
		System.out.println(x + y);
		return "Addition Successful";
	}
	
	//Function without parameter and without return type
	public static void Division() {
	    	System.out.println(25 / 5); 
	}
	  
	//Function with parameter and without return type
	public static void DivisionA(int x,int y) {
		System.out.println(x / y);
	}
	
	//Function with parameter and with return type
	public static int DivisionB(int x, int y) {
		return x / y;
	}
	
	//String return function
	
	public static String DivisionC(int x, int y) {
		System.out.println(x / y);
		return "Division";
	}
	
	
	
		
	
	
}




		
	