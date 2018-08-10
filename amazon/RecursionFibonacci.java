package main.amazon;

/**
 * n = 0, sum = 0;
 * n = 1, sum = 1;
 * n = 2, sum = 1;
 * n = 3, sum = 2;
 * n = 4, sum = 3;
 * n = 5; sum = 5
 * 
 * @author kevinzeng
 */
public class RecursionFibonacci {

    public static int fibonacci(int n) {
    	if (n == 0) {
    		return 0;
    	}
    	if (n == 1) {
    		return 1;
    	}
    	return fibonacci(n-1) + fibonacci(n-2);
    }
    
    public static void main(String[] args) {
    	System.out.println(fibonacci(6));
    }
    
}
