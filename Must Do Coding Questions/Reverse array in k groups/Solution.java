
import java.util.*;
import java.lang.*;
import java.io.*;

class Solution {
    
    public static void reverseArray(int[] arr, int n, int k){
        int temp = 0;
        int start, end;
        for(int i = 0; i < arr.length; i+= k) {
            start = i;
            end = Math.min(i+k-1, n-1);
            while(start < end){
                temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
    }

	public static void main(String[] args) throws IOException {
		//code
	   GFG res = new GFG();
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int test = Integer.parseInt(br.readLine()); 
	   while(test-->0){
		    String[] integersInString = br.readLine().split(" ");
            int a[] = new int[integersInString.length];
            for (int i = 0; i < integersInString.length; i++) {
               a[i] = Integer.parseInt(integersInString[i]);
            }
            int size = a[0];
            int k = a[1];
		    int[] arr = new int[size];
		    String line = br.readLine(); 
            String[] strs = line.trim().split("\\s+"); 
		    for(int i=0;i<size;i++){
		        arr[i]=Integer.parseInt(strs[i]); 
		    }
    	    reverseArray(arr,size,k);
    	    StringBuffer sb = new StringBuffer(); 
    	    for(int i=0;i<size;i++){
    	        sb.append(arr[i] + " ");
    	    }
    	    System.out.println(sb);
	 }
	 br.close();
  }
}