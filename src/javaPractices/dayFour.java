package javaPractices;

public class dayFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // ConditionStatment
		// numberOfTicket --<=5    ===== 5% off
		// numberOfTicket >5 && numberOfTicket <=10  =====10%Off
		// numberOfTicket >10 ======= 30%
		// if (condition)
		
		//program 1
		
		int a = 10;
		if(a>=10){
			System.out.println("A is 10");
		}
	
		// program 2 (check whether the number is +ive or -ive)
		
		System.out.println("if else");
		int b= -90;
		if(b>0) {
			System.out.println("Number is positive");
		}
		
		else {
			System.out.println("Number is negative");
		}
		
		//Program 3 (not recommended)
		
		if (b>0) {
		System.out.println("number is positive");
		}
		else {
			System.out.println("number is negative");
		}
		
		// Program 4 : To check the greater number
		
		int x = 10;
		int y = 20;
		
		if(x>y) {
			System.out.println("x is greater");
		}
		else {
			System.out.println("y is greater");
		}
		
		//program 5
		System.out.println("Multiple logic in if");
		int numberOfTicket = 11;
		if(numberOfTicket > 0 && numberOfTicket <= 5) {
		
			System.out.println("5 % Off");
			}
		if(numberOfTicket>5 && numberOfTicket <=10) {
			System.out.println("10 % discount");
		}
		if (numberOfTicket >10) {
			System.out.println("20 % discount");
		}
		
		//program 6 
		System.out.println("Multiple logic in if else if  else");
		numberOfTicket = -12;
		
		if(numberOfTicket >0 && numberOfTicket <=5) {
			System.out.println("5 % discount");
		}
		else if(numberOfTicket>5 && numberOfTicket <=10) {
			System.out.println("10 % discount");
		}
		else if(numberOfTicket<10) {
			System.out.println("30 % discount");
		}
		else {
			System.out.println("incorrect input");
		}
		
		//program 7
		//if total > 50  =======$20 shipping
		//if total <= 100 ======$10 shipping
		//if total >= 200 =======$Free shipping
		
		int total = 210;
		if(total > 50 && total <100) {
			System.out.println("$20 shipping");
		}
		else if(total > 100 && total <200) {
			System.out.println("$10 shipping");
		}
		else if(total >= 200) {
			System.out.println("free Shipping");
		}
		else {
			System.out.println("Didn't meet Minimum");
		}
		
		//program 8 // nesting if
		//total < $200 ==== will charge shipping of $20
		//if total > $200 ===== will check if weight <= 50lb ==will charge$30
		//if total > $200 ===== will check if weight >50lb == will charge$50
		
		int weight = 30;
		
		if (total < 200) {
			System.out.println("$20 shipping");
		}
		else {
			if(weight <= 50) {
				System.out.println("$30 shipping");
			}
			else {
					System.out.println("$50 shipping");
				
			}
		}		
					
			
		//Practice 1
		
		int day = 3;
		if(day == 1) {
			System.out.println("Sunday");
		}
		else if(day == 2) {
			System.out.println("Monday");
		}
		else if(day ==3) {
			System.out.println("Tuesday");
		}
		else if(day == 4) {
			System.out.println("Wednesday");	
		}
		else if(day == 5) {
			System.out.println("Thursday");	
		}
		else if(day == 6) {
			System.out.println("Friday");	
		}
		else if(day == 7) {
			System.out.println("Saturday");	
		}
		else {
			System.out.println("invalid");
		}
		
		
		//Practice 2
		
		String input= "E";
		if(input == "a"||input=="A") {
			System.out.println("vowel");
		}
		else if (input == "e"||input=="E") {
			System.out.println("vowel");
		}
		else if (input == "i"||input=="I") {
			System.out.println("vowel");
		}
		else if (input == "o"||input=="O") {
			System.out.println("vowel");
		}
		else if (input == "u"|| input=="U") {
			System.out.println("vowel");
		}
		else {
			System.out.println("consonant");
		}
		
		//Practice 3
		
		if(input == "a"|| input =="A"||input == "e"||input=="E"||input == "i"||input=="I"||input == "o"|| input=="O"||input == "u"||input=="U") {
			System.out.println("vowel");
		}
		else {
			System.out.println("consonant");
		}
		
		//Practice 4
		
		int numberOfTerms=4;
		System.out.println("Number is : "+numberOfTerms+" and "+" Cube of "+ numberOfTerms+" is:"+numberOfTerms*numberOfTerms*numberOfTerms);
		
		//Practice 5
		int numberInput=55;
		if(numberInput%2 == 0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
		
		  
		
	}
	
}
