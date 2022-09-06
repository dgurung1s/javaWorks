package javaPractices;

public class revisionMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int a = 1; a <=99; a = a + 2){
			  System.out.println(a);
			}

			int x = 10;
			if (x % 2 == 0){
			  System.out.println(1);
			}
			 else {
			  System.out.println(0); 
			 } 

			for (int b = 3; b < 100; b = b + 3){
			  System.out.println(b);
			}

			for (int c = 5; c < 99; c = c+5){
			  System.out.println(c);
			}

			String str = "It have been a month that I am learning Java";
			System.out.println(str.length ());

			boolean result = isEqual (5,10,15); 
			boolean result2 = isEqual (10,5,25);
			System.out.println(result);
			System.out.println(result2);
			int result3 = sum (20,5,10);
			System.out.println(result3);
			sum(6,6);
			sum (10,5);
			hello();
			sum(15,5);

	}
	public static boolean isEqual (int x1, int x2, int x3){
		return (x1 + x2 == x3);
		}
		public static int sum(int c1, int c2, int c3){
		  return (c1 + c2 + c3);
		}
		public static void sum(int l, int l1){
		  System.out.println(l + l1);
		}
		public static void hello(){
		  System.out.println("hello");
		}

}
