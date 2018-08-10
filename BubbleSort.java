package main;

/**
 * Print how many swaps are required for sorting
 * Print First Element of sorted array
 * Print Last Element of sorted array
 * 
 * @author kevinzeng
 */
public class BubbleSort {

    static void countSwaps(int[] a) {
    	int swaps = 0;
    	if (a == null || a.length <=1) {
    		System.out.println(swaps);
    	} else {
    		for (int i = 0; i < a.length; i++) {
    			for (int j = 0; j < a.length-1; j++) {
    				if (a[j] > a[j+1]) {
    					int temp = a[j];
    					a[j] = a[j+1];
    					a[j+1] = temp;
    					swaps++;
    				}
    			}
    		}
    		System.out.println(swaps);
    		System.out.println(a[0]);
    		System.out.println(a[a.length-1]);
    	}
    }
    
}
