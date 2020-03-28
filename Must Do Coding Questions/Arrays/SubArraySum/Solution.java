
import java.util.*;
import java.lang.*;
import java.io.*;

class Solution {
    
    public static void subArraySum(int[] arr, int sum){
        int currSum = arr[0];
        int start = 0;
        
        for(int i = 1; i <= arr.length; i++){
            
            while(currSum > sum && start < i-1){
                currSum -= arr[start];
                start++;
            }
            
            if(currSum == sum){
                System.out.println(start+1 +" "+ i);
                return;
            }
            
            if(i < arr.length){
                currSum += arr[i];
            }
        }
        System.out.println("-1");
        
    }
    
	public static void main (String[] args) {
		//code
		Scanner scan = new Scanner(System.in);
		int test = scan.nextInt();
		while(test-- > 0){
		    int[] arr = new int[scan.nextInt()];
		    int sum = scan.nextInt();
		    for(int i = 0; i < arr.length; i++){
		        arr[i] = scan.nextInt();
		    }
		    
		    subArraySum(arr,sum);
		}
	}
}