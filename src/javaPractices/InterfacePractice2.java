package javaPractices;

 interface MathFormula{
	void getArea(int length , int breadth);
	
}
class Rectangle implements MathFormula{

	@Override
	public void getArea(int length, int breadth) {
		// TODO Auto-generated method stub
		System.out.println("The area of Rectangle is "+ (length * breadth));
	}
	
}

class Square implements MathFormula{

	@Override
	public void getArea(int length, int breadth) {
		// TODO Auto-generated method stub
		System.out.println("The area of Square is "+ (2 * length * breadth));
	}
	
}


