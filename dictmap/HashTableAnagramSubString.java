package main.dictmap;

import java.util.Hashtable;

/**
 * Two strings are anagrams of each other if the letters of one string can be rearranged to form the other string. 
 * Given a string, find the number of pairs of substrings of the string which are anagrams of each other.
 * 
 * Option 1/2: (With HashMap/CounterArray)
 * - Iterate the String with 2 Loops
 * - For each element
 * 	- use element as key
 * 		=> if key not found in map && key-reverse not found in map, insert it into map, set value to 0
 * 		=> if key found in map, increment value by 1
 * 		=> if key-reverse found in map, increment value by 1
 * 		=> if both key and key-reverse found in map, increment value by 2
 * 	- set element = element + element->next, repeat the previous step
 * 	- repeat the previous step until element.length == string.length
 * - Add up map valueSet number, this is the number of pairs of substrings of the string which are anagrams
 * 
 * @author kevinzeng
 */
public class HashTableAnagramSubString {

    static int sherlockAndAnagrams(String s) {
    	int result = 0;
    	Hashtable<String, Integer> table = new Hashtable<String, Integer>();
    	if (s == null) {
    		return 0;
    	}
    	if (s.length() < 2) {
    		return 0;
    	}
    	for (char c : s.toCharArray()) {
    		
    	}
    	
    	
    	
    	
    	
    	return result;
    }
}
