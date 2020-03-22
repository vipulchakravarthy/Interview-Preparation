
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    public static int check(int[] arr, int sum) {
        int leftSum = 0;
        int i = 0;
        while(i <= arr.length-1) {
            sum = sum - arr[i];
            if(leftSum == sum) {
                return i+1;
            }
            leftSum += arr[i];
            i++;
        }
        return -1;
    }
	public static void main (String[] args) {
		//code
		Scanner scan = new Scanner(System.in);
		int test = scan.nextInt();
		for(int i = 0; i < test; i++) {
		    int size = scan.nextInt();
		    int[] arr = new int[size];
		    int sum = 0;
		    for(int j = 0; j < size; j++) {
		        arr[j] = scan.nextInt();
		        sum += arr[j];
		    }
		    System.out.println(check(arr, sum));
		}
	}
}