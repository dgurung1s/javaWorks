package javaPractices;

class Area{
	//fields to calculate area
	int length;
	int breadth;
	
	//Constructor to initialize values
	Area(int length, int breadth){
		this.length = length;
		this.breadth = breadth;
	}
	
	public void getArea() {
		int area = this.length * this.breadth;
		System.out.println(area);
	}
}
public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area a = new Area (5,10);
		a.getArea();
	}

}
