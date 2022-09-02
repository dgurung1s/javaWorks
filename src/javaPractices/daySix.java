package javaPractices;

public class daySix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Loop-// for loop
			   //while loop
			   //do while loop
		
		//break statement with for-loop
		System.out.println("for loop with break statement");
		
		for(int b=3 ; b<=30; b+=3) {
			if(b==18){
				break;   //this will break but will not print 18 and after
			}
			System.out.println(b);
			
		}
			System.out.println("break after print");
		
		for(int b=3 ; b<=30; b+=3) {
			System.out.println(b);
			if(b==18){
				break;   //this will break at 18 and also print 18/ But already happened.
			}
			
		}
		
		//continue statement with for-loop
			System.out.println("continue statement");
		
		for(int c=5 ; c>1 ; c--) {
			if(c==2) {
				continue;    //this will skip number 2 when printed
			}
			System.out.println(c);				
	}
		
		//while loop -//initialization
					  //while (condition){
					  //statement one
					  //statement two
					  //increment/decrement
					  //}
		
		int k = 10; 
		  while(k < 25) { 
		   System.out.println("hello"); 
		   k ++;  
		  } 
		  
		  //reverse table
		  
		  int j=70;
		  while (j>=7) {
			  System.out.println(j);
			  j= j-7;
		  }
		  
		 //while loop with break statement
		  
		  int j1=0;
		  while (j1<5) {  //0 1 2 3
			  if(j1==3) {  
				  break;
			  }
			  System.out.println(j1); //0 1 2
			  j1++; //1 2 3
		  }
		  
		  //while with continue 
		  
		  int j3=15;      //initialization
		  while (j3>1) {   // 15 14 13 12 11 10 9 8 //stop/ending condition
			  if(j3==9) {     //this will be infinity if there is no another condition after this so added j3--
				  j3--;
				  continue;		  
			  }
			  System.out.println(j3);  //15 14 13 12 11 10 8 //decrement or increment
			  j3--;  //15 14 13 12 11 10 8
		  }
		  
		  //Practice 1
		  
		  int datacount = 1;
		  while(datacount <=6) {  //1 2 3 4 5 6
			  if(datacount %2 ==2)
			  {
				  System.out.println("first set");
			  }
			  else if(datacount %3==0) {
				  System.out.println("second set");
			  }
			  else {
				  System.out.println("third set"); //third set third set second set third set third set second set
			  }
			  datacount++; //1 2 3 4 5
		  }
		  
		  //Practice 2 converting from for loop to while loop 
		  //Int m=5,
		  //for(int n=10; n >=1; n--)
		  //{
		  	//System.out.println(m*n);
		  //}
  
		  int m = 5, n = 10;
		  while(n >= 1) {
			  System.out.println(m*n);
			  n--;
		  }
		  
		  //Practice 3
		  
		  int i = 1, n1 = 6, f = 1;
		  while (i <= n1) {     //1,6 2,6 3,6 4,6 5,6 6,6 7,6 
			  f = f*i;       //1 2 6 24 120 720
			  i++;    //2 3 4 5 6 7
			  System.out.println(f); //1 2 6 24 120 720
		  }
		  
		 
		  
		 
}
}
