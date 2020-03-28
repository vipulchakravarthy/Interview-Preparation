
import java.util.*;
import java.lang.*;
import java.io.*;

class Solution {
    public static int check(int[] arr){
        int count = 0;
        for(int i = arr.length-1; i >= 2; i--){
            int l = 0;
            int r = arr.length-1;
            while(l < r){
                if(arr[l]+arr[r] == arr[i]){
                    count++;
                    l++;
                }else if(arr[l]+arr[r] < arr[i]) {
                    l++;
                }else{
                    r--;
                }
            }
        }
        return count;
    }
	public static void main (String[] args) {
		//code
		Scanner scan = new Scanner(System.in);
		int test = scan.nextInt();
		for(int i = 0; i < test; i++){
		    int size = scan.nextInt();
		    int[] arr = new int[size];
		    for(int j = 0; j < size; j++){
		        arr[j] = scan.nextInt();
		    }
		    Arrays.sort(arr);
		    int res = check(arr);
		    if(res == 0){
		        System.out.println("-1");
		    }else{
		        System.out.println(res);
		    }
		}
	}
}