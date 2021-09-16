package collectionFrameWork;

import java.util.ArrayList;
import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		
		int size = 25;
		int j = 0;
		
		int a[] = new int[25];
		
        ArrayList<Integer> list = new ArrayList<Integer>(size);
        for(int i = 1; i <= size; i++) {
            list.add(i);
        }

        Random rand = new Random();
        while(list.size() > 0) {
            int index = rand.nextInt(list.size());
            a[j++] = list.remove(index);
        }
        
        for(int i = 0; i<25; i++) {
        	System.out.print(a[i] + " ");
        }

	}

}
