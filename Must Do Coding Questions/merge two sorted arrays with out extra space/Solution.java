
import java.util.*;
import java.lang.*;
import java.io.*;

class Solution {
	public static void main (String[] args) throws IOException{
		//code
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(scan.readLine());
		for(int i = 0; i < test;i++){
		    String[] str = scan.readLine().split(" ");
		    int size1 = Integer.parseInt(str[0]);
		    int size2 = Integer.parseInt(str[1]);
		    String[] str1 = scan.readLine().split(" ");
		    String[] str2 = scan.readLine().split(" ");
		    int[] arr1 = new int[size1];
		    int[] arr2 = new int[size2];
		    for(int j = 0; j < size1;j++){
		        arr1[j] = Integer.parseInt(str1[j]);
		    }
		    for(int k = 0; k < size2; k++){
		        arr2[k] = Integer.parseInt(str2[k]);
		    }
		    int first = 0;
		    int second = 0;
		    StringBuilder sb = new StringBuilder();
		    while(first < size1 && second < size2){
    		        if(arr1[first] < arr2[second]){
    		            sb.append(arr1[first++] + " ");
    		        }
    		        else if(arr1[first] > arr2[second]){
    		           sb.append(arr2[second++] + " ");
    		        }else{
    		            sb.append(arr1[first++] + " ");
    		            sb.append(arr2[second++] + " ");
    		        }
		    }
		    if(first < size1){
		        while(first < size1){
		            sb.append(arr1[first++] + " ");
		        }
		    }
		    if(second < size2){
		        while(second < size2){
		            sb.append(arr2[second++] + " ");
		        }
		    }
		    
		    System.out.println(sb);
		}
	}
}