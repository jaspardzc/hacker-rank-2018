package main.string;

public class MakingAnagram {
	
	// assuming both a and b are not null
    static int makeAnagram(String a, String b) {
    	if (a.length() == 0) {
    		return b.length();
    	}
    	if (b.length() == 0) {
    		return a.length();
    	}
    	int[] counter = new int[26];
    	
    	for (char c : a.toCharArray()) {
    		counter[c - 'a']++;
    	}
    	for (char c : b.toCharArray()) {
    		counter[c - 'a']--;
    	}
    	
    	int result = 0;
    	for (int i : counter) {
    		result += Math.abs(i);
    	}
    	return result;
    }

}
