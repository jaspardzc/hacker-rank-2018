package main;

/**
 * HackerRank
 * - Interview Preparation Kit
 * - Arrays: Left Rotation
 * @author kevinzeng
 *
 */
public class ArrayLeftRotation {
	
    static int[] rotLeft(int[] a, int d) {
    	if (d >= 1 && a.length > 1) {
    		int cnt = 0;
    		while(cnt < d) {
    			int temp = a[0];
				for (int i = 0; i < a.length-1; i++) {
					a[i] = a[i+1];
				}
				a[a.length-1] = temp;
    			cnt++;
    		}
    	}
    	return a;
    }
}
