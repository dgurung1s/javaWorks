package javaPractices;

public class dayTenString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//type
		//type-Object---property and method
		//method-action and return type
		
		//String + String ===> String
		//number + String ===> String
		//String + number ===> String
		//number + number ===> number
		
		int x = 12;
		int y = 6;
		String z = "Summer";
		
		System.out.println(x + y + z); // 12+6+Summer 
							//18Summer
		System.out.println(z + x + y); // Summer+12+6
		                          //Summer126
		System.out.println(z + z); //Summer + Summer
		                     //summer summer
		System.out.println(x + y);  //12+6  //18
		
		//Methods
		
		//length
		String city = "Missouri";
		int a = city.length();
		System.out.println(a);  //8
		
		//toUppercase()
		String flower = "Sunflower";
		String b = flower.toUpperCase();
		System.out.println(b);   //"SUNFLOWER"
		System.out.println("I like "+ b);  //I like Sunflower
        
		//toLowerCase()
		String c = flower.toLowerCase();
		System.out.println(c);
		
		//concat ===>combines multiple strings
		String country = "Nepal ";
		String k = "I miss you ";
		String combinedString = k.concat(country); //I miss you Nepal
		System.out.println(combinedString);
		
		String k2 = country.concat(k);
		System.out.println(k2);
		
		//Method Chaining
		String paintcolor = "yellow";
		System.out.println(paintcolor);
		
		String j = paintcolor.toLowerCase();
		System.out.println(j);
		
		String j1 = paintcolor.toUpperCase();
		System.out.println(j1);
		
		int j3 = paintcolor.length();
		System.out.println(j3);       //6
		
		int l = paintcolor.toUpperCase().toLowerCase().length(); //YELLOW yellow 6
		System.out.println(l);
		
		
		
		
		
	}

}
