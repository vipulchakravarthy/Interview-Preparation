
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static int check(int[] arr){
        int n = arr.length;
        int[] leftM = new int[n];
        int[] rightM = new int[n];
        int water = 0;
        leftM[0] = arr[0];
        for(int i = 1; i <n;i++){
            leftM[i] = Math.max(leftM[i-1], arr[i]);
        }
        
        rightM[n-1] = arr[n-1];
        for(int i = n-2; i>=0;i--){
            rightM[i] = Math.max(rightM[i+1], arr[i]);
        }
        
        for(int i = 0; i < n;i++){
            water += Math.min(leftM[i], rightM[i]) - arr[i];
        }
        
        return water;
    }
	public static void main (String[] args) {
		//code
		Scanner scan = new Scanner(System.in);
		int test = scan.nextInt();
		for(int i = 0; i < test;i++){
		    int size = scan.nextInt();
		    int[] arr = new int[size];
		    for(int j = 0; j < size ; j++){
		        arr[j] = scan.nextInt();
		    }
		    System.out.println(check(arr));
		}
	}
}