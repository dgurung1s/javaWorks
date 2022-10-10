package javaPractices;

public class Exceptionpractice {
	public static void dividedByZero() throws Exception{
		int age = 16;
			
		if (age < 18) {
			throw new Exception("not allowed");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			dividedByZero();
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
