package collectionFrameWork;

import java.util.ArrayList;

public class GrowbleIntArray {

	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<>(10);
		
		for(int i = 0; i<10; i++) {
			arr.add(i+1);
		}
		
		arr.add(11);
		
		for(Integer i : arr) {
			System.out.print(i + " ");
		}


	}

}
