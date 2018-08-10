package main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * National Bank has a simple policy for warning clients about possible fraudulent account activity. 
 * If the amount spent by a client on a particular day is greater than or equal to  the client's median spending 
 * for a trailing number of days, they send the client a notification about potential fraud. 
 * The bank doesn't send the client any notifications until they have at least that trailing number of prior days' transaction data.
 * Given the number of trailing days  and a client's total daily expenditures for a period of  days, 
 * find and print the number of times the client will receive a notification over all  days.
 * @author kevinzeng
 *
 */
public class FraudulentActivityNotifications {
	
    private static final Scanner scanner = new Scanner(System.in);
	
	// assume both are not null
    static int activityNotifications(int[] expenditure, int d) {
    	int result = 0;
    	if (d >= expenditure.length) {
    		return 0;
    	}
    	if (d == 0) {
    		return expenditure.length;
    	}
    	int index = 0;
    	while (d+index <= expenditure.length) {
        	int[] trail = new int[d];
        	for (int i = 0; i < d; i++) {
        		trail[i] = expenditure[i+index];
        	}
        	// sort trail, find median number
        	int median = findMedian(trail);
        	
        	if (d+index <= expenditure.length-1) {
        		if (expenditure[d+index] >= 2*median) {
        			result++;
        		}
        	}
        	index++;    		
    	}

    	return result;
    }
    
    static int findMedian(int[] arr) {
    	Arrays.sort(arr);
    	if (arr.length%2 == 0) {
    		return (arr[arr.length/2] + arr[arr.length/2+1])/2;
    	} else {
    		return arr[(arr.length-1)/2];
    	}
    }
    
    public static void main(String[] args) throws IOException {

        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] expenditure = new int[n];

        String[] expenditureItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int expenditureItem = Integer.parseInt(expenditureItems[i]);
            expenditure[i] = expenditureItem;
        }

        int result = activityNotifications(expenditure, d);
        System.out.println(result);
        
        scanner.close();
    }
}
