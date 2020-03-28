/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;
/*
Input:
2
5
1 2 3 -2 5
4
-1 -2 -3 -4

Output:
9
-1
*/


class Solution {
	public static void main (String[] args) throws IOException{
		//buffered for the faster performance than scanner
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        
		int test = Integer.parseInt(br.readLine());
		while(test-- > 0){
		    int size =Integer.parseInt(br.readLine());
		    int[] arr = new int[size];
		    String[] inp = br.readLine().trim().split(" ");
		    for(int j = 0; j < size; j++){
		        arr[j] = Integer.parseInt(inp[j]);
		    }
		    int currMax = arr[0];
		    int maxTillNow = arr[0];
		    
		    for(int i = 1; i < size; i++){
                currMax = Math.max(arr[i], currMax + arr[i]);
                maxTillNow = Math.max(currMax, maxTillNow);
		    }
		    
		    System.out.println(maxTillNow);
		}
		
	}
}