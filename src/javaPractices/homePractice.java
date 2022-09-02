package javaPractices;

public class homePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Convert the String to lower case
		
		String patientName = "Florida";
		
		//Display every characters of this string one by one
		for(int a = 0; a < patientName.length(); a++) {
			System.out.println(patientName.charAt(a));
		}
		
		//Display string in reverse order
		String rev = "";
		for (int a = 0; a < patientName.length(); a++) {   //0 1 
			rev = patientName.charAt(a)+rev;	    // f l o r i d a 
		}
		System.out.println(rev);	//
				
		//Define String 2
		String Name = "Soniya";
		
		//Join these strings with ","
		String combine = String.join(",",patientName,Name);
		System.out.println(combine);
		
		//Find how many characters "a" this combined string has
		int count = 0;
		for(int a = 0; a < combine.length(); a++) { 
				if (combine.charAt(a) == 'a') {
					count = count + 1;
			}
		}
		System.out.println(count);
		
		//convert this to uppercase
		System.out.println(combine.toUpperCase());
		
		//Display the total length of string
		System.out.println(combine.length());
		
		//concat with "-","Nepal"
		
		String v = combine.concat("-").concat("Nepal");
		System.out.println(v);
		
		//Split string by ","
		String [] z = v.split(",");
		System.out.println(z[0]);
		for(String item:z) {
			System.out.println(item);
		}
		
		//find index of first "p"
		System.out.println(v.indexOf('p'));
		
		//Determine the string type of final result from above from follwoing logic
		String type = "";
		if (combine.length() <= 10){
			 type = "small";
		}
		else if (combine.length() <= 20) {
			type = "medium";
		}
		else {
			type = "large";
		}
		
		//use switch 
		switch (type) {
		case "small":
			System.out.println("Your sentence is small size");
			break;
		case "medium":
			System.out.println("Your sentence is medium size");
			break;
		case "large":
			System.out.println("Your sentence is large size");
			break; 
		}
		
		//using final result, use while to display only First five charac
		int w = 0;
		while (w < 6){  //0 1 2 3 4 
			System.out.println(v.charAt(w)); //f l 0 r 8
			w ++;  //1 2 3 4
			
		}
	}

}
