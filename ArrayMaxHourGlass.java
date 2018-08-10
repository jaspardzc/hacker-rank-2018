package main;

/**
 * HackerRank
 * - Interview Preparation Kit
 * - 2D Array - DS
 * @author kevinzeng
 *
 */
public class ArrayMaxHourGlass {

    static int hourglassSum(int[][] arr) {
    	int result = Integer.MIN_VALUE;
        int matrixRow = arr.length;
        int matrixCol = 0;
        for (int i = 0; i < matrixRow; i++) {
        	matrixCol++;
        }
        if (matrixCol >= 3 && matrixRow >= 3) {
        	for (int j = 0; j <= matrixRow-3; j++) {
        		for (int k = 0; k <= arr[j].length-3; k++) {
        			int rowSize = arr[j].length < arr[j+1].length ? arr[j].length : arr[j+1].length;
        			rowSize = rowSize <  arr[j+2].length ? rowSize : arr[j+2].length;
        			if (k+2 < rowSize && j < arr.length) {
            			int newResult = arr[j][k] 
            					+ arr[j][k+1] 
            					+ arr[j][k+2] 
            					+ arr[j+1][k+1] 
            					+ arr[j+2][k] 
            					+ arr[j+2][k+1] 
            					+ arr[j+2][k+2];
            			result = result > newResult ? result : newResult;	
        			}
        		}
        	}
        }
        return result;
    }
}
