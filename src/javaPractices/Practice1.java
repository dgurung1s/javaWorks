package javaPractices;

class Test{
	int appId;
	String appName;
	Test(int id, String name){
		this.appId = id;
		this.appName = name;
	}
}

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test socialMedia1 = new Test(001, "Facebook");
		Test socialMedia2 = new Test(005, "Instagram");
		
		System.out.println(socialMedia1.appId + " is an ID for the "+ socialMedia1.appName);
	}

}
