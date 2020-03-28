
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    public static int check(int[] arr, int students){
        //sort the array
        Arrays.sort(arr);
        int n = arr.length;
        int minValue = 1000000;
        int i = 0;
        int j = i+students-1;
        int temp = 0;
        //get the minimum value from subarray which gives minimum
        //difference between packets
        while(i < (n-students+1)){
            temp = (arr[j]-arr[i]);
            if(minValue > temp){
                minValue = temp;
            }
            j++;
            i++;
        }
        
        return minValue;
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
		    int students = scan.nextInt();
		    System.out.println(check(arr, students));
		}
	}
}