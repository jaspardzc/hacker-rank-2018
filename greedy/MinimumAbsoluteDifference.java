package main.greedy;

import java.util.Arrays;

/**
 * Basic Solution: Two Loops
 * 
 * Efficient Solution: nLog(n)
 * 1)sort 
 * 2)consider diff between the first pair as min 
 * 3)compare all "consecutive pair min" with the one in step2 to get the least min.
 * @author kevinzeng
 */
public class MinimumAbsoluteDifference {
	
    static int minimumAbsoluteDifference(int[] arr) {
    	if (arr == null) {
    		return 0;
    	}
    	if (arr.length < 2) {
    		return 0;
    	}
    	Arrays.sort(arr);
    	int diff = Integer.MAX_VALUE;
    	
    	for (int i = 1; i < arr.length; i++) {
    		int absolute = Math.abs(arr[i] - arr[i-1]);
    		if (absolute < diff) {
    			diff = absolute;
    		}
    	}
    	return diff;
    }
    
    
}
