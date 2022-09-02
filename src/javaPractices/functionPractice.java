package javaPractices;

public class functionPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Practice1
		int a = 5;
		System.out.println(cube (a));
		//Practice2
		int x = 6;
		int y = 3;
		int z = 12;
		int w = method1(x,y,z);  // 6,3,12
		System.out.println("w = " + w);   // w = 6 
		
		//Practice 3
		int w2 = method2(x,y,z); //6 3 12
		System.out.println("w2 = "+ w2);  // w2 = 24
		
		//Practice4
		int a1 = 24;
		int b = 56;
		int c = sum(a1,b);   // 24,56  
		System.out.println("c = "+ c);  // c = 80
		
		//Practice5
		int a2 = 34;
		int b2 = 56;
		int c2 = 0;
		sumA(a2, b2);
		System.out.println("c2 = "+ c2);  //c2 = 0
		
		//Practice6
		int a3 = 34;
		int b3 = 56;
		int c3 = 0;
		Add (a3,b3);
		System.out.println("c3 =  " + c3);  //c3 = 0
		
		
		
	}

	
	public static int cube(int theNum) {
		return theNum * theNum * theNum;  
	}
	
	public static int method1(int y, int z, int x) {
		return (x * z) / y; //y=6, z=3 x=12 = 6
		
	}
	
	public static int method2(int x, int y, int z) {
		return (x * z)/ y;    //6*12 =72 /3  24
	}
	
	public static int sum(int a, int b) {
		System.out.println("a = "+ a + " b = "+ b);  // a = 24  b = 56
		return a+b;   //24 + 56 =80
	}
	
	public static int sumA(int a, int b) {  //34,56
		System.out.println("a = " + a + " b = "+ b); //a = 34 b = 56
		int c = 0;   
		c = a +b;    // 34+56 = 90
		System.out.println("c = " + c); //c = 90
		return c;  // 90
	}
	
	public static int Add(int k, int l) {  //k=34 l=56
		System.out.println("k =  "+ k + "l =  " + l);  //k=34 l=56
		int m = 0;     
		m = k + l;     //34+56= 90
		System.out.println("m =  " + m);  //m = 90
		return m;  	
	}
	
	
	
	
}
