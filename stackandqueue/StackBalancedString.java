package main.stackandqueue;

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

/**
 * Check if a string is a balanced string, print YES or NO
 * 
 * - Option 1: ArrayCounter
 * - Option 2: HashMap
 * - Option 3: Stack
 * 
 * @author kevinzeng
 */
public class StackBalancedString {
	
	// {[(])}
	// {{)[](}}
    static String isBalanced(String s) {
    	String result = "";
    	if (s == null) {
    		return "NO";
    	}
    	if (s.length()%2 != 0) {
    		return "NO";
    	}
    	Stack<String> stack = new Stack<String>();
    	for (char c : s.toCharArray()) {
    		String top;
    		if (!stack.isEmpty()) {
    			top = stack.peek();
    			if (isElementPaired(top, String.valueOf(c))) {
    				stack.pop();
    			} else {
    				stack.push(String.valueOf(c));
    			}
    		} else {
    			stack.push(String.valueOf(c));
    		}
    	}
    	if (stack.isEmpty()) {
    		result = "YES";
    	} else {
    		result = "NO";
    	}
    	return result;
    }
    
    static boolean isElementPaired(String top, String next) {
    	return (top.equals("(") && next.equals(")")) ||
    			(top.equals("[") && next.equals("]")) ||
    			(top.equals("{") && next.equals("}"));
    }
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String s = scanner.nextLine();

            String result = isBalanced(s);

            System.out.println(result);
        }


        scanner.close();
    }
}
