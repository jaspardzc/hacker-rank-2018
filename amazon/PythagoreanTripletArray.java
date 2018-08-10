package main.amazon;

import java.util.Arrays;

/**
 * Q1: Given an array of integers, write a function that returns true if there is a triplet (a, b, c) that satisfies a2 + b2 = c2.
 * 
 * Q2: Find a pair of integer, of which the sum is equal to k, return true if found
 * 
 * Option 1: 3 Loops to check one by one
 * Option 2: n + nlogn + n*n
 * 	- Do sqaure of all array elements => O(n)
 *  - Do Sorting
 *  - Keep Lagest Element fixed, find other two elements from startIndex and endIndex-1, minimizing the variance
 *    Repeat and Keep 2nd Largest Element Fixed, find other two elements from startIndex and endIndex-1, minimizing the variance
 *  
 * @author kevinzeng
 */
public class PythagoreanTripletArray {

	public boolean isPythagoreanTriplet(int[] arr) {
		if (arr == null) {
			return false;
		}
		if (arr.length < 3) {
			return false;
		}
		int m = arr.length;
		for (int i = 0; i < m; i++) {
			arr[i] = arr[i] * arr[i];
		}
		Arrays.sort(arr);
		for (int i = m-1; i >= 2; i--) {
			int left = 0;
			int right = i-1;
			while (left < right) {
				if (arr[left] + arr[right] == arr[i]) {
					return true;
				}
				if (arr[left] + arr[right] < arr[i]) {
					left++;
				} else {
					right--;
				}
			}
		}
		return false;
	} 
	
	public boolean isPairSumFound(int[] arr, int k) {
		if (arr == null) {
			return false;
		}
		if (arr.length < 2) {
			return false;
		}
		if (arr.length == 2) {
			return arr[0] + arr[1] == k;
		}
		Arrays.sort(arr);
		int m = arr.length;
		for (int i = m-1; i >= 2; i--) {
			int left = 0;
			int right = i-1;
			while (left < right) {
				if (arr[left] + arr[right] == arr[i]) {
					return true;
				}
				if (arr[left] + arr[right] < arr[i]) {
					left++;
				} else {
					right--;
				}
			}
		}
		return false;
	}
}
