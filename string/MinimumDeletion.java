package main.string;

/**
 * You are given a string containing characters A and B only. 
 * Your task is to change it into a string such that there are no matching adjacent characters. 
 * To do this, you are allowed to delete zero or more characters in the string.
 * @author kevinzeng
 *
 */
public class MinimumDeletion {

    static int alternatingCharacters(String s) {
    	if (s == null) {
    		return 0;
    	}
    	if (s.length() == 0 || s.length() == 1) {
    		return 0;
    	}
    	int result = 0;
    	char[] array = s.toCharArray();
    	for (int i = 0; i < array.length-1; i++) {
    		if (array[i] == array[i+1]) {
    			result++;
    		}
    	}
    	return result;
    }
}
