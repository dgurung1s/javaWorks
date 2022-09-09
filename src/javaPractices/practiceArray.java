package javaPractices;

public class practiceArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// dataType [] arrayName = new dataType [4]
		
		//Program1
		String [] names = new String [4];
		names[0] = "raj";
		names[1] = "nisa";
		names[2] = "pravin";
		names[3] = "preet";
		
		//Can be written like this too
		String [] names1 = {"raj","nisa","pravin","preet"};
		for (int a = 0; a < names1.length; a++) {
			System.out.println(a);
			System.out.println(names1[a]);	
		}
		//How to access the element from array
		System.out.println(names1.length-1);
		
		//Program2- Print reverse
		for (int a = names1.length-1; a > 0; a--) {
			System.out.println(names1[a]);
		}
		
		//Program3 (Array of integers)
		int [] numbers = new int [3];
		numbers [0] = 5;
		numbers [1] = 10;
		numbers [2] = 20;
		
		int [] numbers1 = {5,10,20};
		for (int a = 0; a < numbers1.length; a = a+1) { //0 1 2
			System.out.println(a); //0, 1, 2
			System.out.println(numbers1[a]); //5 10 20
		}
		
		//Program4 Using for each loop
		
		int [] years = {2018,2019,2020,2021};
		for(int yr:years) {
			System.out.println(yr);
		}
		
		String [] fruit = {"avacado","pineapple","lychhi","strawberry"};
		for (String frt:fruit) {
			System.out.println(frt);
		}
		
		//Program5 To print sum of array elements
		int [] numbers2 = {22,20,20};
		int sum = 0;
		for(int a = 0; a < numbers.length; a++) {
			sum = sum + numbers2[a];
				// 0 + 22 = 22
			    // 22 + 20 = 42
			    // 42 + 20 = 62
		}
			System.out.println(sum);	
		
		//Program6 To print average of all elements of array
		int [] numbers3 = {6,8,10,12};
		int total = 0;
		//sum of all elements/totalNumberofElement
		
		for(int i = 0; i < numbers3.length; i++) {
			total  = total + numbers3[i];
			       //0 + 6 ==>6
				   //6 + 8 ==>14
			      //14 + 10 ==> 24
			      //24 + 12 ==> 36 (total)
		}
		System.out.println(total/numbers3.length);   // 36/4 ==>9
		
		
		
		
		
	}

}
