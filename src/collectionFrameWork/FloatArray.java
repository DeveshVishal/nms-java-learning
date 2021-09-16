package collectionFrameWork;

import java.util.Scanner;

public class FloatArray {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		float[] valueA = { 10.2f , 14.3f , 16.5f , 
				           18.4f , 22.3f , 36.8f , 
				           45.5f , 60.8f , 85.5f , 94.8f
	        			  } ;
		
		System.out.println("Enter Number to Search"); 
		
		float key = in.nextFloat();
		int i = 0;
		for(i = 0; i<valueA.length; i++) {
			if(valueA[i] == key) {
				System.out.println(valueA[i]);
				i = -1;
				break;
			}
		}
		
		if(i != -1) {
			System.out.println(key + " na");
		}
		
		System.out.println("Enter a Number");
		
		key = in.nextFloat();
		
		String s = String.valueOf(key);
		
		float n = Float.valueOf(s);
		
		char ans = 0;
		
		for(int j = s.length()-1; j>=0; j--) {
			if(s.charAt(j-1) == '.') {
				ans = s.charAt(j);
				break;
			}
		}
		
		if(ans < '5') {
			n -= 1;
			System.out.println((int)Math.floor(n));
		}
		else {
			System.out.println((int)Math.ceil(n));
		}

	}

}
