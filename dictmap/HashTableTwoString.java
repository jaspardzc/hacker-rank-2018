package main.dictmap;

import java.util.Hashtable;

/**
 * Given two strings, determine if they share a common substring. A substring may be as small as one character.
 * 
 * Option 1: (Without using HashTable)
 * 
 * Option 2: (Using HashTable)
 * 
 * 
 * @author kevinzeng
 */
public class HashTableTwoString {

    static String twoStrings(String s1, String s2) {
    	String status = null;
    	if (s1 == null || s2 == null) {
    		status = "NO";
    	}
    	if (s1.length() == 0 || s2.length() == 0) {
    		status = "NO";
    	}
    	Hashtable<String, Integer> table = new Hashtable<String, Integer>();
    	for (char c : s1.toCharArray()) {
    		if (table.containsKey(c+"")) {
    			int value = table.get(c+"");
    			table.put(c+"", value+1);
    		} else {
    			table.put(c+"", 1);
    		}
    	}
    	char[] arr = s2.toCharArray();
    	int m = arr.length;
    	for (char c : arr) {
    		if (!table.containsKey(c+"")) {
    			m--;
    		}
    	}
    	if (m == 0) {
    		status = "NO";
    	} else {
    		status = "YES";
    	}
    	return status;
    }
}
