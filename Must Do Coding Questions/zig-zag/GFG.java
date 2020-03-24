
import java.util.*;
import java.lang.*;
import java.io.*;


class GFG {
    
    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    
    public static void check(int[] arr){
        for(int i = 0; i<arr.length-1;i++){
            if((i%2 == 0) && (arr[i] > arr[i+1])){
                swap(arr, i, i+1);
            }else if((i%2 != 0) && (arr[i] < arr[i+1])){
                swap(arr, i, i+1);
            }
        }
        
        for(int j = 0; j < arr.length; j++) {
            System.out.print(arr[j]+" ");
        }
    }
    
    
	public static void main (String[] args) {
		//code
		Scanner scan = new Scanner(System.in);
		int test = scan.nextInt();
		
		for(int i = 0; i < test; i++){
		    int size = scan.nextInt();
		    int[] arr = new int[size];
		    for(int j = 0; j < size;j++) {
		        arr[j] = scan.nextInt();
		    }
		    check(arr);
		    System.out.println();
		}
	}
}