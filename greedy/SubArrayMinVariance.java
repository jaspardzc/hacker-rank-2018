package main.greedy;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * Integer arr[], integers in arr may not be unique
 * Integer k
 * create a new array arr2[] with k elements from arr[]
 * => to minimize the unfairness of subarray
 * max(subarr) - min(subarr)
 * @author kevinzeng
 */
public class SubArrayMinVariance {

    static int maxMin(int k, int[] arr) {
    	if (arr == null) {
    		return 0;
    	}
    	int m = arr.length;
    	if (m < 2 || k == 0 || k > m) {
    		return 0;
    	}
    	Arrays.sort(arr);
    	int unfairness = Integer.MAX_VALUE;
    	if (k == m) {
    		unfairness = arr[m-1] - arr[0];
    	}
    	// sliding window
    	for (int i = k-1; i < m; i++) {
    		if (unfairness > Math.abs(arr[i] - arr[i-k+1])) {
    			unfairness = Math.abs(arr[i] - arr[i-k+1]);
    		}
    	}
    	 return unfairness;
    }
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int k = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            int arrItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            arr[i] = arrItem;
        }

        int result = maxMin(k, arr);

        System.out.println(result);

        scanner.close();
    }
}
