package main.string;

/**
 * Palindrome String => Allow Duplicates
 * - eg: aaa
 * - eg: b
 * - eg: aba
 * 
 * 1. Find all palindromes using Manacher's Algorithm
 * Considering each character as a pivot, expand on both sides to find the length of both even and odd length palindromes 
 * centered at the pivot character under consideration and store the length in the 2 arrays (odd & even).
 * 2. Insert all found palindromes in a HashMap
 * 3. Print the distinct palindromes and total numbers
 * 
 * @author kevinzeng
 */
public class SpecialPalindrome {
	
    static long substrCount(int n, String s) {
    	if (s.length() <= 1) {
    		return s.length();
    	}
    	long count = s.length();
    	char[] array = s.toCharArray();
    	for (int i = 0; i < array.length; i++) {
    		
    	}
    }
}
