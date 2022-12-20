package javaPractices;

import java.util.List;

public class RevisionSwapnilClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Dona";
		System.out.println(name.substring(2));
		System.out.println(name.substring(0, 3));
		
		//Reverse String by CHARACTERS
		String reverseWork = "Welcome to java world";
		String rev1 = "";
		for (int a = reverseWork.length() - 1; a >= 0; a--) {
			// System.out.println(a);
			rev1 = rev1 + reverseWork.charAt(a);
		}
		System.out.println(rev1);

		// Reverse String by WORDS- "Welcome to java language"
		String reverseHW = "Welcome to java language";
		String splitWords = "";
		String[] words = reverseHW.split(" ");
		for (int j = words.length-1; j>=0; j--) {
			//splitWords += words[j] + " ";
			System.out.print(words[j] + " ");  //it will reverse like this or by doing line 23 and 26.
		}
		System.out.println(splitWords);
		
		//Access element at list
		List<Integer> values = List.of(5, 3, 4, 7, 6, 2, 9, 6);
        int item = 6;
 
        int index = values.get(3);
        System.out.println(index);
        
        //Capitalize only first character of String
        // Welcome to java language
        String prac = "Welcome to java language";
        String converted = "";
        String[] splitprac = prac.split(" ");
        for (int i = 0; i < splitprac.length; i++) {
        	converted += splitprac[i].substring(0, 1).toUpperCase();
        	converted += splitprac[i].substring(1);
        	converted +=" ";
        }
        System.out.println(converted);
        
        // Palindrome "nitin"
        String originalname = "radar";
        String reverse = "";
        for(int a = originalname.length()-1; a >= 0; a--) {
        	 reverse = reverse + originalname.charAt(a);
        }
        System.out.println(reverse);
        if (originalname.equals(reverse)){
        	System.out.println("It is Palindrome.");
        }
        else {
        	System.out.println("It is not Palindrome.");
        }
        //count vowels
        String str = "Welcome to java lAnguage";
        String lowerStr = str.toLowerCase();
        int countA = 0;
        int countE = 0;
        int countI = 0;
        int countO = 0;
        int countU = 0;
        for (int i = 0; i < lowerStr.length(); i++) {
        	if(lowerStr.charAt(i) == 'a') {
        		countA = countA + 1;
        	}
        	if(lowerStr.charAt(i)== 'e') {
        		countE = countE + 1;
        	}
        	if(lowerStr.charAt(i)== 'i') {
        		countI = countI + 1;
        	}
        	if(lowerStr.charAt(i)== 'o') {
        		countO = countO + 1;
        	}
        	if(lowerStr.charAt(i)== 'u') {
        		countU = countU + 1;
        	}
        }
       
        System.out.println("a = "+ countA);
        System.out.println("e = "+ countE);
        System.out.println("i = "+ countI);
        System.out.println("o = "+ countO);
        System.out.println("u = "+ countU);
	}
}
//To delete all the cookies 
//driver.manage().deleteAllCookies();
//class C{
//public class PrivateA {

//int a=10;
//String s="swapnil";
//
//private PrivateA()
//{
//	System.out.println(a+" "+s);
//}
//
//public static void main(String[] args) 
//{
//	// TODO Auto-generated method stub
//	
//	PrivateA ref = new PrivateA();
//}
//class A {
//	int a;
//	String b;
//	
//	A(int x, String y)
//	{
//		a=x;
//		b=y;
//	
//	}
//	
//	void display()
//	{
//		System.out.println(a+" "+b);
//	}
//}
//
//class ParameterizedA
//{
//	public static void main(String args[])
//	{
//		A ref = new A(10,"swapnil");
//		ref.display();
//	}
//	
//}
//
//
//
//
//}
//class B {
//int a=10;
//String b="sdf";
//boolean c=true;

//B()
//	{}
//B()
//{
//	
//	System.out.println(a+" "+b+ " "+c);
	
//}
// void display()
//{
//	 
//	 
//	System.out.println(a+" "+b+ " "+c);
//	//System.out.println(this);
//}
//}
//class DefaultA
//{
//public static void main(String args[])
//{
//
//	B abc = new B();
////	System.out.println(abc);
////	abc.display();
//	
////	B ref = new B();
////	System.out.println(ref);
//
//}
//
//}

//int a;
//String b;
//C(int x,String y)
//{
//	a=x;
//	b=y;
//	System.out.println(a+""+b);
//	System.out.println("it is from paramerterized constructor");
//}
//C(C ref)
//{
//	a=ref.a;
//	b=ref.b;
//	System.out.println(a+""+b);
//
//public class CopyA {
//
//public static void main(String args[])
//{
//	C ref = new C(10,"swapnil");
//		
//	C ref2 = new C(ref);
//}
//
//
//}

