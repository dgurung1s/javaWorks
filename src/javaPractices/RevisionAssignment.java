package javaPractices;

public class RevisionAssignment {
	public static void Calculator (int x , int y) {
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		System.out.println(x % y);
	}
	public static void CalculatorA() {  //function without parameter and without return type
		System.out.println(10 + 10);
	}
	public static void Addition (int x, int y) {    // function with parameter and without return type
		System.out.println(x+y);
	}
	
		public static int AdditionB(int x ,int y) {   //// function with parameter and with return type
			return x + y ;
		}
		
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String
			String fullName = "dona gurung";
			System.out.println(fullName);
		
			String a = fullName.toUpperCase();
			System.out.println(a);
		
			String a1 = " - from Nepal.";
			String combined = a.concat(a1);
			System.out.println(combined);
		
			//Method Chaining
			int a2 = fullName.toLowerCase().toUpperCase().length();
			System.out.println(a2);
		
			//comparison relational Operator
			// < , > , <= , >= , == , !=
				// entity < entity ----- boolean
			System.out.println(5 < 6); //T
			System.out.println(7 != 5); // T
			System.out.println(7 > 2); // T
			System.out.println(8 >= 3); // T
			System.out.println(10 <= 5); // F
			System.out.println(2 == 9); // F
		
		
			//Logical Operator
			// AND, OR , NOT
			
			// AND operation
			// True && True ===>  True 
			// True && False ==>  False
			// False && True ==>  False
			// False && False ==> False
				System.out.println(2 == 2 && 4 < 3 ); //F
			
				// OR operator
				// True && True ===>  True 
			// True && False ==>  True
			// False && True ==>  True
			// False && False ==> False
				System.out.println(5 == 5 || 1 > 5);  //T
			
			// NOT 
			// True -- False
			// False-- True 
				System.out.println(!(9 < 6)); //T
			
			// Conditional statements 
			// this is used when input has multiple outcomes -->
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
			
				//Nesting
			//if total > 50  =======$20 shipping
			//if total <= 100 ======$10 shipping
			//if total >= 200 =======$Free shipping
			
			int total = 150;
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
			
			//Ternary Operator-The conditional (ternary) operator is the only JavaScript operator that takes three operands: a condition followed by a question mark (?), then an expression to execute if the condition is truthy followed by a colon (:), and finally the expression to execute if the condition is falsy.
			//This operator is frequently used as an alternative to an if...else statement.
			int b1 = 20;
			int b2 = 50;
			if (b1 < b2) {
				System.out.println("b1 is Smaller than b2");
					}
			else {
				System.out.println("b2 is Greater than b1");
					}
					
			String minValue = (b1 < b2)?"b1 is small":"b2 is small";
				System.out.println(minValue);
				int max = (b1 < b2)?b1:b2;
				System.out.println(max);
				
			//Switch Case-using break Statement
				
			int month = 3;
			switch (month) {
			case 1:
				System.out.println("January");
				break;
			case 2:
				System.out.println("February");
				break;
			case 3:
				System.out.println("March");
				break;
			case 4:
				System.out.println("April");
				break;
				}
				
			//Switch case-using multiple cases w/ break
				
			String city = "los angeles";
			switch (city) {
			case "dexter":
			case "jackson":
				System.out.println("Missouri");
				break;
			case "jackson height":
			case "manhatton":
				System.out.println("New York");
				break;
			case "los angeles":
			case "san diego":
				System.out.println("California");
				break;
			default:
				System.out.println("Invalid City Name");
				}
				
			//Loops
			//for loops (initialization; condition check; increment/decrement){
			       //statement
	                  //}
			for (int x = 0 ; x <= 5 ; x = x + 1) {
				System.out.println(x);
			}
			
			//break statement with for-loop
			for (int x = 3 ; x < 20; x = x+3) {  //6 //9 12
				System.out.println(x);  // 3 6 9 12
				if (x == 12){
				break;	
			}
				
			}
			
			for(int x = 2 ; x <= 10; x = x+2) { //4 8 10
				if (x == 6) {
					continue;
				} 
				System.out.println(x);    //2 4 8 10
			}
			
			//while
			//initialization;
			//while (condition) {
				//statement
				//increment/decrement
			//   }
		
			int c = 10; 
			  while(c < 25) { 
			   System.out.println("hello"); 
			   c ++;  
			  } 
			  
			while (c >= 1) {
				System.out.println(c);
				if (c ==3) {
					break;
				}
				c--;
			}
			
			System.out.println("while with continue");
			while(c >= 1) {
				if(c == 3) {
					c --;
					continue;
				}
				System.out.println(c);
			c --;
				}
			
			//Functions
			Calculator(5, 6);
			
			CalculatorA();
			
			Addition (6,8);
			
			int d = AdditionB (20,20);
			System.out.println(d);
			System.out.println(d + 20);
		
		
	}

}
