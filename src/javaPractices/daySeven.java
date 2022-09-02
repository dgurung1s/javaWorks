package javaPractices;

public class daySeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// using Do while loop
		
		int a = 1;
		do {
			System.out.println(a); //it will print the statement first then only check the condition
			a += 1;   
		}while(a <= 5);
		
		// Array
		
		int[] house = new int[6];
		System.out.println(house);    // location of array in program
		System.out.println(house.length);   //gives array length
		house [0] = 10;
		house [1] = 5;
		house [2] = 4;
		house [3] = 8;
		house [4] = 3;
		house [5] = 2;
		
		System.out.println(house [0]);    //gives element of array index
		System.out.println(house[house.length-1]);  //this will always shows the element at the last index
		
		// Array with for loop
		
		int []zipcode = new int[10];
		zipcode [0] = 63701;
		zipcode [1] = 63702;
		zipcode [2] = 63703;
		zipcode [3] = 63704;
		zipcode [4] = 63705;
		zipcode [5] = 63706;
		zipcode [6] = 63707;
		zipcode [7] = 63708;
		zipcode [8] = 63709;
		zipcode [9] = 63700;
		
		for(int x = 0; x < 10; x++) {
			System.out.println(zipcode[x]);
		}
		
		// Array with for loop- string
		
		String[] city = 
					{"kathmandu", "pokhara", "butwal", "biratnagar", "chitwan", "bharatpur"};
		for(int y = 0; y<city.length; y = y+1) {
			System.out.println(city[y]);	
		}
		
		//Array-print all the elements of array using while loop
		
		int k = 0;
		while(k < city.length) {
			System.out.println(city[k]);
			k = k+1;
		}
		
		//print the elements in reverse using loop
		System.out.println("Reverse-for Loop");
		
		for(int x = city.length-1; x > 0; x--) {
		System.out.println(city[x]);	 	
	}
		//print the element in reverse using while loop
		System.out.println("Reverse-while Loop");
		
		int x1 = city.length - 1;
		while(x1 >= 0) {
			System.out.println(city[x1]);
			x1--;
		}
		
		//Practice 1
		
		int x2 = 1, i = 2;
		do {
			x2 *= i; //2 6 24 120
		}                     
		while (++i <= 5);     //3 4 5 6 
		System.out.println(x2);  //120 
		
		//Practice 2
		
		for(int i1 = 3; i1 <= 4; i1++)
		{
			for(int j = 2; j<i1; j++){   //3 4 3 4
				System.out.println("*");   
			}
			System.out.println("Simply");  
		}                                   // * simply ** simply
		
		
		// Practice 3- convert for loop to while loop
		// for(int n=10; n >=1; n--)
		int n = 10, m = 5;
		while(n >= 1) {   //10 9 
			System.out.println(m*n);   // 45
			n--;     //9
		}
		
		//Practice 4
		
		int i2 = 1, n1 = 6, f = 1;
		while(i2 <= n1) {   //1 2 3 4 5 6 7
			f = f*i2; // 1 2 6 24 120 720 --
			i2++;   //2 3 4 5 6 7
			System.out.println(f + " ");  
		}
		
		//Practice 5
		int x3 = 5;
		int y = 75;
		while (x3 <= y) {  // 5 
			y = y/x3;      // 15 3
			System.out.println(y); //15 3
		}
		
		
		
		
			
			
	}

}
	
