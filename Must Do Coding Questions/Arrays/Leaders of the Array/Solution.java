
import java.util.*;
import java.lang.*;
import java.io.*;

class Solution {
    
	public static void main (String[] args)throws IOException {
		//code
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		for(int i = 0; i < test; i++) {
		    int size = Integer.parseInt(br.readLine());
		    String[] st = br.readLine().trim().split(" ");
		    int max_right = Integer.parseInt(st[size-1]);
		    Stack<Integer> stk = new Stack<Integer>();
		    stk.push(max_right);
		    for(int j = size-2; j >= 0; j--) {
		        int x = Integer.parseInt(st[j]);
		        if(max_right <= x) {
		            max_right = x;
		            stk.push(max_right);
		        }
		    }
		    while(!stk.isEmpty()) {
		        System.out.print(stk.pop() + " ");
		    }
		    System.out.println();
		}
	}
}