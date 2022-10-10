package javaPractices;
class Database {
	private static String dbName = "Oracle";
	private static Database dbobject;
	
	//Constructor
	private Database() {
		
	}
	public static Database getInstance() {
		if(dbobject == null) {
			dbobject = new Database();
		}
		return dbobject;
		
	}
	public void getConnection() {
		System.out.println("Connecting to Data base");
		System.out.println(this.dbName);
	}
}
public class SingletonPatternpractice {
// In OOP, a singleton class is a class that can have only one object (an instance of the class) at a time.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Database a = Database.getInstance();
		a.getConnection();
		
		Database a1 = Database.getInstance();
		a1.getInstance();
		
	}

}
