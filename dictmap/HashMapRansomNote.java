package main.dictmap;

import java.util.HashMap;

/**
 * Given the words in the magazine and the words in the ransom note, print Yes if he can replicate his ransom note 
 * exactly using whole words from the magazine; otherwise, print No.
 * 
 * Assumption:
 *  - both string array are not null
 * 
 * Boundary Check:
 *  - if magazine array length is less than note array length, print No
 *
 * 
 * Option 1: 
 *  - sorting two string array alphabetically ASC
 *  - iterate the note array, compare if magazine array is having the same string value at the same index 
 *  - as long as one value NOT same, print No, otherwise print Yes
 * 
 * Option 2: 
 *  - initialize a HashMap
 *  - iterate the note array, for each element, use the element value as the key
 *  	=> if key does not exist in HashMap, set value to 1
 * 		=> if key already exist in HashMap, increment the value by 1
 *  - iterate the magazine array, for each element, use th e element value as the key
 *  	=> if key does not exist in HashMap, skip 
 *  	=> if key already exist in HashMap, 
 *  		=> if value > 1, minus the value by 1
 *  		=> if value == 1, remove the (key,value) pair
 *  - check if HashMap keySet is empty 
 *  	=> if not empty, print No
 *  	=> if empty, print Yes
 *  
 * @author kevinzeng
 */
public class HashMapRansomNote {

    static void checkMagazine(String[] magazine, String[] note) {
    	if (magazine == null || note == null) {
    		System.out.println("No");
    	}
    	if (magazine.length < note.length) {
    		System.out.println("No");
    	} else {
    		HashMap<String, Integer> map = new HashMap<String, Integer>();
    		for (int i = 0; i < note.length; i++) {
    			if (map.containsKey(note[i])) {
    				int value = map.get(note[i]);
    				map.put(note[i], value+1);
    			} else {
    				map.put(note[i], 1);
    			}
    		}
    		for (int j = 0; j < magazine.length; j++) {
    			if (map.containsKey(magazine[j])) {
    				int value = map.get(magazine[j]);
    				if (value == 1) {
    					map.remove(magazine[j]);
    				} else {
    					map.put(magazine[j], value-1);
    				}
    			}
    		}
    		// check if map entrySet is empty
    		if (map.keySet().isEmpty()) {
    			System.out.println("Yes");
    		} else {
    			System.out.println("No");
    		}
    	}
    }
    
}
