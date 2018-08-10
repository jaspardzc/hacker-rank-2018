package main.amazon;

/**
 * Suppose there are total 5 steps (n), user can make 1/2/3 (k) step each time, 
 * calculate how many options (m) does user have to finsih all steps
 * 
 * - Output the result by m%(10^9+7)
 * 
 * - n <= 0, m = f(n) = 0
 * - n = 1, m = f(n) = 1
 * - n = 2, m = f(n) = 2
 * - n = 3, m = f(n) = 4
 * - n >= 4, m = f(n-3) + f(n-2) + f(n-1)
 *
 * 
 * @author kevinzeng
 */
public class RecursionStairs {

    static int stepPerms(int n) {
    	if (n < 0) {
    		return 0;
    	}
    	int[] arr = new int[36];
    	arr[0] = 0;
    	arr[1] = 1;
    	arr[2] = 2;
    	arr[3] = 4;
    	if (n < 4) {
    		return arr[n];
    	} else if (arr[n] != 0){
    		return arr[n];
    	} else {
    		return stepPerms(n-3) + stepPerms(n-2) + stepPerms(n-1);
    	}
    }
}
