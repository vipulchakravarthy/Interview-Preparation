/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner scan = new Scanner(System.in);
		int tc = scan.nextInt();
		while(tc-- > 0){
		    int n = scan.nextInt();
		    int[] arr = new int[n];
		    int[] dep = new int[n];
		    for(int i = 0; i < n ;i++){
		        arr[i] = scan.nextInt();
		    }
		    
		    for(int i = 0; i < n ;i++){
		        dep[i] = scan.nextInt();
		    }
		    
		    Arrays.sort(arr);
		    Arrays.sort(dep);
		    
		    int plat_needed = 1, res = 1;
		    
		    int i = 1;
		    int j = 0;
		    
		    while(i < n && j < n){
		        
		        if(arr[i] <= dep[j]){
		            plat_needed++;
		            i++;
		            if(plat_needed > res){
		            res = plat_needed;
		        }
		        }else{
		            plat_needed--;
		            j++;
		        }
		        
		        
 		    }
 		    System.out.println(res);
		}
	}
}