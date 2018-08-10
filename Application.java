package main;

import java.util.Arrays;

public class Application {

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {
    	int swap = 0;
    	int[] result = arr.clone();
    	Arrays.sort(result);
    	int resultIndex = 1;
    	for (int i = 1; i < arr.length; i++) {
    		if (arr[i] == result[resultIndex]) {
    			resultIndex++;
    		} else {
    			swap++;
    		}
    	}
    	return swap;
    }
    
	public static void main(String[] args) {
		int[] input = new int[]{6,4,3,1,5,2};
		int result = minimumSwaps(input);
		System.out.println(result);
	}
	

}
