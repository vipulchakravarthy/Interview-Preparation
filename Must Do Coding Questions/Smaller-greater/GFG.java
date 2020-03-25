
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    public static int check(int[] arr, int n){
        
        boolean[] min = new boolean[n];
        boolean[] max = new boolean[n];
        int minV = Integer.MIN_VALUE;
        int maxV = Integer.MAX_VALUE;
        
        for(int i = 0; i < n; i++){
            if(arr[i] >= minV){
                min[i] = true;
                minV = arr[i];
            }
            
            if(arr[n-1-i] <= maxV){
                max[n-1-i] = true;
                maxV = arr[n-1-i];
            }
        }
        
        for(int i =1; i < n-1;i++){
            if(min[i] && max[i]) {
                return arr[i];
            }
        }
        return -1;
     
    }
	public static void main (String[] args) {
		//code
		Scanner scan = new Scanner(System.in);
		int test = scan.nextInt();
		for(int i = 0; i < test;i++){
		    int size = scan.nextInt();
		    int[] arr = new int[size];
		    for(int j = 0; j < size; j++){
		        arr[j] = scan.nextInt();
		    }
		    System.out.println(check(arr, size));
		}
	}
}
