package main;

import java.util.Arrays;
import java.util.Collections;

/**
 * HackerRank
 * - Interview Preparation Kit
 * - Arrays: Sortng Asc/Desc
 * @author kevinzeng
 *
 */
public class ArraySorting {
	
	static int[] sortingArrayDesc(int[] arr) {
		Integer[] arrObj = Arrays.stream(arr).boxed().toArray(Integer[]::new);
		Arrays.sort(arrObj, Collections.reverseOrder());
		arr = Arrays.stream(arrObj).mapToInt(Integer::intValue).toArray();
		return arr;
	}
	
	static int[] sortingArrayAsc(int[] arr) {
		Arrays.sort(arr);
		return arr;
	}
}
