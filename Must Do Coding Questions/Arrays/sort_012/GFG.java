
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while(test-->0)
		{
		    int n = sc.nextInt();
		    int a[] = new int[3];
		    for(int i=0;i<n;i++)
		    {
		        a[sc.nextInt()]++;
		    }
		    int i=0;
		    StringBuilder sb = new StringBuilder();
		    while(i<3)
		    {
		        if(a[i]==0)
		           i++;
		        else
		        {
		           sb.append(i+" ");
		           a[i]--;
		        }
		    }
		    System.out.println(sb);
		}
	}
}