package main.amazon;

import java.util.Arrays;

/**
 * Find K lagest/smallest elements in array
 * 
 * Q1: Write an efficient program for printing k largest elements in an array. Elements in array can be in any order.
 * 
 * Q2: Write an efficient program for printing k smallest elements in an array. Elements in array can be in any order.
 * 
 * Option 1: Bubble Sort: O(nk)
 * Option 2: Sorting and Printing nLogn
 * Option 3: Building Tree
 * Option 4: 
 * 
 * @author kevinzeng
 */
public class KElementsOfArray {
	
	// assuming input is not null
	public void printKLagestElements(int[] arr, int k) {
		if (arr.length >= k) {
			Arrays.sort(arr);
			int m = arr.length;
			for (int i = m-1; i >= (m-1-k); i--) {
				System.out.println(arr[i]);
			}
		}		
	}
	
	// assuming input is not null
	public void printKSmallestElements(int[] arr, int k) {
		if (arr.length >= k) {
			Arrays.sort(arr);
			for (int i = 0; i <= k; i++) {
				System.out.println(arr[i]);
			}
		}	
	}
	
	
}
