package javaPractices;

class Paint{
	int lightreflectivevalue;
	String colorName;
	
	public Paint(int lightreflectivevalue, String colorname) {
		this.lightreflectivevalue = lightreflectivevalue;
		this.colorName = colorname;
	}
	public void warm() {
		System.out.println("I am warm color");
	}
	public static void reflect() {
		System.out.println("Reflect more light");
	}
}
public class RevisionAssignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Paint red = new Paint(35, "Cottage Red");
		System.out.println(red.colorName);
		System.out.println(red.lightreflectivevalue);
		
		red.warm();
		red.reflect();
	}

}
