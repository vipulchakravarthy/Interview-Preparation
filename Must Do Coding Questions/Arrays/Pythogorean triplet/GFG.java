
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    public static void res(int[] arr){
        for(int i = arr.length-1; i>= 0; i--) {
            int l = 0;
            int r = i-1;
            while(l < r) {
                if(arr[l] + arr[r] == arr[i]) {
                    System.out.println("Yes");
                    return;
                }
                if (arr[l] + arr[r] < arr[i]) 
                   l++; 
                else
                   r--;
            }
        }
        System.out.println("No");
    }
	public static void main (String[] args) {
		//code
	   Scanner scan = new Scanner(System.in);
	   int test = scan.nextInt();
	   for(int i = 0; i < test; i++) {
	       int size = scan.nextInt();
	       int[] arr = new int[size];
	       for(int j = 0; j < size; j++){
	           arr[j] = scan.nextInt();
	           arr[j] = arr[j] * arr[j];
	       }
	       Arrays.sort(arr);
	       res(arr);
	   }
	}
}
