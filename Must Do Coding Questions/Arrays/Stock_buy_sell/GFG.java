/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG 
{
	public static void main (String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    int T = sc.nextInt();
	    
	    while(T-- > 0)
	    {
	        int n = sc.nextInt();
	        int[] arr = new int[n+1];
	        
	        for(int i=0;i<n;i++)
	            arr[i] = sc.nextInt();
	            
	        arr[n]=-1;
	        
	        //to stote the start indices
	        ArrayList<Integer> start = new ArrayList<>();
	        
	        //to store the stop indices
	        ArrayList<Integer> stop = new ArrayList<>();
	           
	        /*
	        iterate the stocks array
	        maintain two pointers one for start and other is for stop
	        whenver the present stock is greater than next stock
	        add the indices start and stop to list.
	        */
	        for(int j=0, i=0;j<n;j++)
	        {
	            if(arr[j] > arr[j+1])
	            {
	                if(i != j)
	                {
	                    start.add(i);
	                    stop.add(j);
	                }
	                
	                i=j+1;
	            }
	        }
	        
	        if(start.size()==0)
	            System.out.print("No Profit");
	        
	        for(int i=0;i<start.size();i++)
	        {
	            System.out.print("(" + start.get(i) + " " + stop.get(i) + ") ");
	        }
	        
	        System.out.println();
	    }
	}
}