
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner scan = new Scanner(System.in);
		int test = Integer.parseInt(scan.nextLine());
		for(int i = 0; i < test; i++) {
		    String[] arr = scan.nextLine().split("\\.");
		    int j = 0;
		    for(j = arr.length-1;j > 0; j--){
		        System.out.print(arr[j] + ".");
		    }
		    System.out.print(arr[j]);
		    System.out.println();
		}
	}
}