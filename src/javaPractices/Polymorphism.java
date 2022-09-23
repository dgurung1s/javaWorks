package javaPractices;

class Calculator{
	//Method A
	public int Addition (int a , int b) {
		return a + b;
	}
	//Method B
	public int Addition (int a, int b, int c) {
		return a+b+c;
}
	//Method C
	public int Addition (int a, int b, int c, int d) {
		return a+b+c+d;
	}
}
public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator a = new Calculator();
		int d = a.Addition(6, 6);
		System.out.println(d);
		int d1 = a.Addition(12, 12, 24);
		System.out.println(d1);
		int d2 = a.Addition(4, 24, 24, 16);
		System.out.println(d2);
	}

}
