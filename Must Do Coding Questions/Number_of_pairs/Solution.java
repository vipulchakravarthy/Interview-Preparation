
import java.util.*;
import java.lang.*;
import java.io.*;
/*
The problem can be solved in O(nLogn + mLogn) time. 
The trick here is, if y > x then x^y > y^x with some exceptions.

Following are simple steps based on this trick.

Sort array Y[].
For every x in X[], find the index idx of smallest number greater 
than x (also called ceil of x) in Y[] using binary search or 
we can use the inbuilt function upper_bound() in algorithm library.
All the numbers after idx satisfy the relation so just add (n-idx) to the count.
*/
class Solution {

	public static long countPairX(int x, int[] Y, int N, int[] noOfY){

		//if x == 0 it means no pairs
		if(x == 0) return 0;

		//if x == 1 it means number of zeroes in y array
		if(x == 1) return noOfY[0];

		int index = Arrays.binarySearch(Y, x);
		long ans = 0;

		if(index < 0){
			index = Math.abs(index+1);
			ans = N-index;
		}else{
			while(index < N && Y[index] == x){
				index++;
			}
			ans = N-index;
		}
		
		// If we have reached here, then x must be greater than 1, 
        // increase number of pairs for y=0 and y=1 
        ans += (noOfY[0] + noOfY[1]); 
       
        // Decrease number of pairs for x=2 and (y=4 or y=3) 
        if (x == 2)  ans -= (noOfY[3] + noOfY[4]); 
       
        // Increase number of pairs for x=3 and y=2 
        if (x == 3)  ans += noOfY[2]; 
       
       	return ans;
	}

   public static long pairs(int[] X, int[] Y, int M, int N) {
        
        long totalPairs = 0;

        //get the number of 0,1,2,3,4 in Y
        int[] noOfY = new int[5];
        for(int i = 0; i < N; i++){
        	if(Y[i] < 5){
        		noOfY[Y[i]]++;
        	}
        }


        //first step is to sort the second array
        Arrays.sort(Y);

        for(int i = 0; i < M; i++){
        	totalPairs += countPairX(X[i], Y, N, noOfY);
        }
        return totalPairs;

    }
    
    
	public static void main (String[] args) throws IOException{
		//code
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		while(tc-- > 0){
		    String[] sizes = br.readLine().split(" ");
		    int M = Integer.parseInt(sizes[0]);
		    int N = Integer.parseInt(sizes[1]);
		    String[] temp1 = br.readLine().split(" ");
		    int[] arr1 = new int[M];
		    for(int i = 0; i < M;i++){
		        arr1[i] = Integer.parseInt(temp1[i]);
		    }
		    
		    String[] temp2 = br.readLine().split(" ");
		    int[] arr2 = new int[N];
		    for(int i = 0; i < N;i++){
		        arr2[i] = Integer.parseInt(temp2[i]);
		    }
		    
		    System.out.println(pairs(arr1, arr2, M, N));
		}
	}
}