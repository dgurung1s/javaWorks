package javaPractices;

public class day11String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Equal  
		String first = "java";
		String second = "manual";
		boolean result = first.equals(second);
		System.out.println(result);
		
		String flower = "rose";
		String flower1 = "rose";
		boolean result1 = flower.equals(flower1);
		System.out.println(result1);
		
		//contains
		String jkl = "We have two classes.";
		boolean result2 = jkl.contains("two");
		System.out.println(result2);
		
		//substring()  
		
		String state = "California";
		
		//0 1 2 3 4 5 6 7 8 9
		//c a l i f o r n i a
		
		String result3 = state.substring(4);
		System.out.println(result3);       //fornia
		 
		//This will print startIndex, End Index(will not be printed)
		String result4 = state.substring(3,8);
		System.out.println(result4);     //iforn
		
		String result5 = state.substring(6,10);
		System.out.println(result5);
		
		//join()
		String line1 = "Sunflower";
		String Line2 = "bloom";
		String Line3 = "in summer";
		
		String result6 = String.join("-",line1,Line2,Line3);
		System.out.println(result6);
		
		String result7 = String.join(" ",line1,Line2,Line3);
		System.out.println(result7);
		
		String name = "zorba";
		String email = String.join("@",name,"gmail.com");
		System.out.println(email);
		
		//replace() 
		//can also replace character -example2
		String str = "Zorba conduct java classes";
		String str1 = str.replace("java", "python");
		System.out.println(str1);
		
		String str2 = str.replace("a", "e");
		System.out.println(str2);
		
		//replaceAll()
		
		String str3 = "Test cases can be +ive and -ive. Test cases tells how to test";
		String str4 = str3.replaceAll("Test cases","Test document");
		System.out.println(str4);
		
		//replaceFirst()
		
		String str5 = "Test cases can be +ive and -ive. Test cases tells how to test";
		String str6 = str5.replaceFirst("Test cases", "Test document");
		System.out.println(str6);
		
		//charAt()  character
		
		String str7 = "Nepal";
		//0 1 2 3 4
		//n e p a l 
		char result8 = str7.charAt(3);
		System.out.println(result8);   //a
		
		//indexOf()
		
		int location = str5.indexOf("T");   
		System.out.println(location); //0
		
		int location1 = str5.indexOf("T",1);   // that value 1 means start finding character T after index 1
		System.out.println(location1);  //33  it will start looking from index 1 
		
		int location2 = str5.indexOf("t", 4);
		System.out.println(location2);   //36
		
		int location3 = str5.indexOf("dd");
		System.out.println(location3);     //this will give -ive value becasue "dd" is not in that str.
		
		//trim()   //will remove all spaces and give exact  number
		String str8 = "Nepal";
		System.out.println(str8.length());  //5
		
		String str9 = " Nepal   ";	
		System.out.println(str9.length());
		
		String str10 = str9.trim();
		System.out.println(str10.length());   //5
		
		//split()
		
		String str11 = "The laws - of - success - is hard - work";
		String[] result9 = str11.split("-"); //
		//System.out.println(result9[0]);  //The laws 
		//System.out.println(result9[1]);  // of 
		//System.out.println(result9[2]);  //success
		//system.out.println(result9[3]);  //is hard
		//system.out.println(result9[4]);  //work
		
		
		
		System.out.println(result9.length);
		for (int x =0; x < result9.length; x++ ) {
			System.out.println(result9[x].trim().toUpperCase());
		}
		
		String str12 = "I like-to visit-many places-as i can";
		String[] result10 = str12.split("-");
		System.out.println(result10[0]);
		System.out.println(result10[1]);
		System.out.println(result10[2]);
		System.out.println(result10[3]);
		
		System.out.println(result10.length);
		
		//Reverses the word  
		String str22 = "cape girardeau"; 
		String rev2 = ""; 
	   
	
		for(int i = 0 ; i < 4;i++) {
			rev2 = str22.charAt(i) + rev2 ; 
		} 
		System.out.println(rev2); 
	   
		String str23 = "cape girardeau"; 
		String rev3 = ""; 
	 
		for(int i = str23.length()-1 ; i >=0 ; i--) { 
	   
			rev3 = rev3 + str23.charAt(i); 
	   
		} 
	   
		System.out.println(rev3); 
	  
		//Count character option 1
	   
		String str24 = "hello world!"; 
		int counter = 0; 
		for(int i = 0 ; i < str24.length();i++) { 
		   char a1 = str24.charAt(i); 
		   if(a1 == 'l') { 
		    counter = counter + 1; 
		   } 
	  } 
	   
	  System.out.println(counter); 
		
		int w = 10;
		while (w>=1) {
			System.out.println(w);
			w--;
		}
		
		//Program 1 Print every Character
		
		String fruit = "pineapple";
		for(int i = 0; i < fruit.length(); i++) {
			System.out.print(i);  //0 1 1 2 4 5 6 7 8 
			System.out.print(fruit.charAt(i)); //pineapple
		}
		
		//Program 2 Print the same string in reverse
		String rev = "";
		for (int i = 0; i < fruit.length(); i++) {
			rev = fruit.charAt(i)+rev;
			System.out.println(rev);
		}
		
		String rev1 = "";
		for(int i = fruit.length()-1; i >= 0; i--) {
			System.out.println(i);  //8 7 6 5 4 3 2 1 0
			rev1 = rev1 + fruit.charAt(i);
			System.out.println(rev1);
		}
		
		//Program 3 Counter character option 2
		int counter1 = 0;
		for (int a = 0; a <fruit.length(); a++) {
			if(fruit.charAt(a)=='p'){
				counter1 = counter1 + 1;    //3	
		}
		}
		System.out.println(counter1);
		
		
		//Program 4 Counter- example counting vowels
		int counter3 = 0;
		for (int i = 0 ; i<fruit.length(); i++) {
		if(fruit.charAt(i)=='a'||fruit.charAt(i)=='e'||fruit.charAt(i)=='i'||fruit.charAt(i)=='o'||fruit.charAt(i)=='u') {
			counter3 = counter3 + 1;
		}
		
		}
		System.out.println(counter3);  //4
		
		
		//Program 5 Print every element of array
		String []flowers = {"marigold","dahlia","hydrangea"};
		for(String element:flowers) {
			System.out.println(element);
		}
		int[] numbers = {20,24,30};
		int sum = 0;
		for(int a:numbers) {
			sum=a;//20 
			
		}
		System.out.println(sum);
}

}
