package javaPractices;

public class dayTwelve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x = "Rose";
		System.out.println(x.toLowerCase());
		
		for(int a = 0; a < x.length(); a++) {
			System.out.println(x.charAt(a));
		}
		
		String rev = "";
		for (int a = 0; a < x.length(); a++) {
		rev = x.charAt(a) + rev;
		}
		System.out.println(rev);
		
		String x1 = "sunflower";
		
		String combine = String.join(",","rose","sunflower");
		System.out.println(combine);
		
		int count = 0;
		for (int a = 0; a < combine.length(); a++) {
			if(combine.charAt(a) == 'o') {
				count = count + 1;
				
			}
		}
		System.out.println(count);
		
		System.out.println(combine.toUpperCase());
		
		System.out.println(combine.length());
		
		String v = combine.concat("-").concat("Nepal");
		System.out.println(v);
		
		String [] result = v.split(",");
		System.out.println(result[0]);
		System.out.println(result[1]);
		System.out.println(result.length);
		
		System.out.println(v.indexOf("p"));
		
	}

}
