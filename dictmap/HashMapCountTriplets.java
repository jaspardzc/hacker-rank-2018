package main.dictmap;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;

/**
 * You are given an array and you need to find number of tripets of indices (i, j, k)
 * such that the elements at those indices are in geometric progression for a given common ratio r and (i < j < k).
 * 
 * Example: (Duplicate Numbers are considered, because indexes will always be different)
 * -	arr = [1,4,16,64]
 * -	given common ratio r => 4 
 * - 	(i, j, k) = (1, 4, 16) 	= (4^0, 4^1, 4^2)	=> (0,1,2)
 * - 	(i, j, k) = (4, 16, 64)	= (4^1, 4^2, 4^3)	=> (1,2,3)
 * 
 * @author kevinzeng
 */
public class HashMapCountTriplets {
	
	// return total numbers of set that match the requirements
	// [1, 2, 2, 4], 2 => i counter * j counter * k counter = 2
	// if ONLY Distinct Sets are considered, then no need to multiply
    static long countTriplets(List<Long> arr, long r) {
    	long result = 0;
    	if (arr == null) {
    		return 0;
    	}
    	if (arr.size() < 3 || r < 1) {
    		return 0;
    	}
    	Hashtable<Long, Long> table = new Hashtable<Long, Long>();
    	Collections.sort(arr);
    	long max = arr.get(arr.size()-1);
    	long power = 0;   	
    	for (Long element : arr) {
    		if (table.containsKey(element)) {
    			long value = table.get(element);
    			table.put(element, value+1);
    		} else {
    			table.put(element, (long)1);
    		}
    	}
    	if (r == 1) {
    		long counter = table.get((long)1);
    		result = calculateForSpecialRatio(counter, 0);
    		return result;
    	}
    	while(isNotLargerThanMaximum(max, r, power+2)) {
    		long key1 = (long)Math.pow(r, power);
    		long key2 = (long)Math.pow(r, power+1);
    		long key3 = (long)Math.pow(r, power+2);
    		if (table.containsKey(key1) &&
    				table.containsKey(key2) &&
    				table.containsKey(key3)) {
    			long counter = table.get(key1) * table.get(key2) * table.get(key3);
    			result += counter;
    		}
    		power++;
    	}
    	
    	return result;
    }
    
    static boolean isNotLargerThanMaximum(long max, long r, long power) {
    	if (Math.pow(r, power) <= max) {
    		return true;
    	} else {
    		return false;
    	}
    }
    
    static long calculateForSpecialRatio(long counter, long result) {
    	while (counter >= 1) {
    		result += (1+counter)*counter/2;
    		counter--;
    	}
    	return result;
    }
    
    public static void main(String[] args) throws IOException {
    	
    	List<Long> arr = new ArrayList<Long>();
    	arr.add((long) 1);
    	arr.add((long) 1);
    	arr.add((long) 1);
    	arr.add((long) 1);

        long ans = countTriplets(arr, 1);
        
        System.out.println(ans);
    } 
}
