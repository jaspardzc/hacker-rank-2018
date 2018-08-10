package main.string;

/**
 * Check if String is Palindrome
 * 
 * @author kevinzeng
 */
public class CheckPalindrome {
	
	
	public static boolean istPalindrome(String input){
		char[] word = input.toCharArray();
	    int start = 0;
	    int end = word.length - 1;
	    while (end > start) {
	        if (word[start] != word[end]) {
	            return false;
	        }
	        start++;
	        end--;
	    }
	    return true;
	}
	
	public static void main(String[] args) {
		boolean result = istPalindrome("ancna");
		System.out.println(result);
	}
	
}
