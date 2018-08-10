package main.string;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Sherlock considers a string to be valid if all characters of the string appear the same number
 * of times. It is also valid if he can remove just 1 character at 1 index in the string, 
 * and the remaining characters will occur the same number of times. Given a string S, 
 * determine if it is valid.
 * @author kevinzeng
 *
 */
public class SherlockAndValidString {
	
	// assuming s is not null
    static String isValid(String s) {
    	if (s.length() <= 1) {
    		return "YES";
    	}
    	char[] array = s.toCharArray();
    	int[] counter = new int[256];
    	int difference = 0;
    	int baseValue = 0;
    	for (char c : array) {
    		counter[c - 'a']++;
    	}
    	for (int i = 0; i < counter.length; i++) {
    		if (counter[i] != 0 && baseValue == 0) {
    			baseValue = counter[i];
    		}
    		if (counter[i] != 0) {
    			if (counter[i] != baseValue) {
        			difference++;
        	    	if (difference > 1) {
        	    		return "NO";
        	    	}
    			}
    			if (Math.abs(baseValue-counter[i]) > 1 && baseValue != 1 && counter[i] != 1) {
    				return "NO";
    			}
    		}
    	}
    	return "YES";
    }
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        String s = scanner.nextLine();

        String result = isValid(s);
        
        System.out.print(result);

        scanner.close();
    }
    
}
