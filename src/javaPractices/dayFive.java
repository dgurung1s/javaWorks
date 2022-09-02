package javaPractices;

public class dayFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// switchCase
		//switch Not Using Break Statement
		System.out.println("swithCase");
		String month = "two";
		
		switch(month) {
		case "one":
			System.out.println("January");
		case "two":
			System.out.println("Febraury");
		case "three":
			System.out.println("March");
		case "four":
			System.out.println("April");
		default:
			System.out.println("Incorrect");
			
			}
		
		//switchcase using Break statement
			System.out.println("switchcase using break statement");
		switch(month) {
		case "one":
			System.out.println("January");
			break;
		case "two":
			System.out.println("Febraury");
			break;
		case "three":
			System.out.println("March");
			break;
		case "four":
			System.out.println("April");
			break;
		default:
			System.out.println("Incorrect");
			
			}
		
		int monthValue = 3;
		
		switch(monthValue) {
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("Febraury");
			break;
		case 3:
			System.out.println("March");
			break;
		case 4:
			System.out.println("April");
			break;
		default:
			System.out.println("Incorrect");
			
			}
		
		//switch using multiple cases
		System.out.println("switchcase with multiple cases");
		String city = "losangeles";
		
		switch (city) {
		case "cape":
		case "jackson":
			System.out.println("Missouri");
			System.out.println("Midwest");
			break;
		case "jacksonheight":
		case "timeSquare":
			System.out.println("NewYork");
			System.out.println("EastCoast");
			break;
		case "sanfransisco":
		case "losangeles":
			System.out.println("California");
			System.out.println("WestCoast");
			break;
		default:
			System.out.println("Wrong City");
			
		
		}
	
		//loops==== For and While loop
		//For loop ---------- initialization;conditionCheck;increment/decrement
			System.out.println("Loop -for");
		for(int a=0 ; a<10; a++) {
			System.out.println(a);		
		}
		
		//Multiplication table 3
		for(int b=3 ; b<=30; b+=3) {   //3 6 9  12
			System.out.println(b + " ");   //3 6 9 12
			
		}
		//for(int c=1 (start) ; c<=20 (stop); c+=2 (step=how much to increase/decrease)
		int inputNumber = 5;
		for(int c=1 ; c<=20; c+=2) {
			System.out.println(inputNumber * c);
		}
		
		int sum = 0;
		for(int x=1; x<=10; x++) {
			sum= sum + x;
		}
		System.out.println(sum);
		
		// sum of natural numbers from 1-10
		
		int sumA = 0;
		for(int d=1 ; d <=10 ; d++) {
			sumA = sum + d;
		}
		System.out.println(sumA);
		
		//display even numbers from 1-100
		
		for(int k=2 ; k<=80 ; k+=4) {
			System.out.println(k);
		}
		
		//Practice
		int x = 3;
		int y = 2;
		if(y/x>0) 
			System.out.println("first");
			System.out.println("second");
			
		int sumC = 20;
		int sumD = 30;
		for(int n = sumC ; n<=sumD ; n+=2) {
			System.out.println(n);
		}
		
		
		
		
	}

}
