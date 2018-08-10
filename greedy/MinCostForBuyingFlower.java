package main.greedy;

import java.util.Arrays;

/**
 * Use minimum money to buy all the flowers based on certain business rule 
 * index++ for buyers for user who have already bought flower
 * 
 * - Buying most flowers first, then the cheap one, until all flowers are bought
 * 
 * @author kevinzeng
 */
public class MinCostForBuyingFlower {

    static int getMinimumCost(int k, int[] c) {
    	if (c == null) {
    		return 0;
    	}
    	int m = c.length;
    	if (m == 0 || k == 0) {
    		return 0;
    	}
    	int sum = 0;
    	Arrays.sort(c);    	
    	if (m <= k) {
    		for (int i = 0; i < m; i++) {
    			sum += c[i];
    		}
    		return sum;
    	}
    	for (int j = m-1; j >= 0; j--) {
    		sum += (((m-1-j)/k)+1)*c[j];
    	}
    	return sum;
    }
}
