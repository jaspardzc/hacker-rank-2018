package main.string;

import java.io.IOException;
import java.util.Scanner;

/**
 * Find longest common child string of two different string
 * - A string is said to be a child of a another string if it can be formed by deleting 0 or more characters from the other string.
 * 
 * @author kevinzeng
 */
public class CommonChild {

    static int commonString(String s1, String s2) {
    	
    	if (s1 == null || s2 == null) {
    		return 0;
    	}
    	if (s1.length() == 0 || s2.length() == 0) {
    		return 0;
    	}
    	
    	int s1Length = s1.length();
    	int s2Length = s2.length();
    	int[][] dp = new int[s1Length][s2Length];
    	int max = 0;
    	
    	for (int i = 0; i < s1Length; i++) {
    		for (int j = 0; j < s2Length; j++) {
    			if (s1.charAt(i) == s2.charAt(j)) {
    				if (i == 0 || j ==0) {
    					dp[i][j] = 1;
    				} else {
    					dp[i][j] = dp[i-1][j-1] + 1;
    				}
    				if (max < dp[i][j]) {
    					max = dp[i][j];
    				}
    			}
    		}
    	}
    	return max;
    }
    
    static int commonChild(String a, String b) {
    	int m = a.length();
    	int n = b.length();
    	int[][] dp = new int[m+1][n+1];
     
    	for(int i=0; i<=m; i++){
    		for(int j=0; j<=n; j++){
    			if(i==0 || j==0){
    				dp[i][j]=0;
    			}else if(a.charAt(i-1)==b.charAt(j-1)){
    				dp[i][j] = 1 + dp[i-1][j-1];
    			}else{
    				dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
    			}
    		}
    	}
     
    	return dp[m][n];
    }
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String s1 = scanner.nextLine();

        String s2 = scanner.nextLine();

        int result = commonChild(s1, s2);

        scanner.close();
    }
}
