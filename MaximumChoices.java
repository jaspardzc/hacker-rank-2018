package main;

import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Similar Questions
 * - Money to buy groceries, K dollar => maximum numbers of vegetables 
 * - Money to buy toys, K dollar => maximum numbers of toys
 * - Every merchandise is singleton
 * 	eg: prices => [1,2,3,4], K can be consisted of (1,2,4) or (3,4)
 * - input 1: number of toys, the collection should be an array of non-negative integer
 * - input 2: total budget
 * - output: maximum number of toys
 * @author kevinzeng
 *
 */
public class MaximumChoices {

    static int maximumToys(int[] prices, int k) {
    	if (k <= 0) {
    		return 0;
    	}
    	int maxToys = -1;
    	int minValue = 0;

    	Integer[] arr = Arrays.stream(prices).boxed().toArray(Integer[]::new);
	    Arrays.sort(arr, new Comparator<Integer>()
	    {
	        @Override
	        public int compare(Integer x, Integer y)
	        {
	            return x - y;
	        }
	    });
	    prices = Arrays.stream(arr).mapToInt(Integer::intValue).toArray();
    	for (int i = 0; i < prices.length; i++) {
    		if (minValue <= k) {
    			maxToys++;
    		}
    		minValue += prices[i];
    	}    	
    	return maxToys;
    }
    
    private static final Scanner scanner = new Scanner(System.in);
  
    public static void main(String[] args) throws IOException {
        
        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] prices = new int[n];

        String[] pricesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int pricesItem = Integer.parseInt(pricesItems[i]);
            prices[i] = pricesItem;
        }

        int result = maximumToys(prices, k);
        System.out.println(result);
        scanner.close();
    }
}
