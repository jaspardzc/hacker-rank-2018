package main.amazon;

import java.util.Arrays;

/**
 * Given an array, print the Next Greater Element (NGE) for every element. 
 * The Next greater Element for an element x is the first greater element on the right side of x in array. 
 * Elements for which no greater element exist, consider next greater element as -1.
 * 
 * Option 1: 2 Loops
 * Option 2: Using Stack
 * 
 * @author kevinzeng
 */
public class NextGreaterElementArray {
	
	// assuming arr is not null
	public static void printNGEInArray(int[] arr) {
		if (arr.length > 0) {
			if (arr.length > 1) {
				for (int i = 0; i < arr.length; i++) {
					int right = arr.length-1;
					int left = i+1;
					while (left <= right) {
						if (arr[i] > arr[right]) {
							System.out.println(-1);
						}
						if (arr[i] < arr[left]) {
							System.out.println(arr[left]);
							break;
						}
						left++;
					}
				}
			} else {
				System.out.println(-1);
			}
		} 
	}
	
	static class Stack {
		
	}
	
	public static void printNGEWithStack() {
		
	}

}
