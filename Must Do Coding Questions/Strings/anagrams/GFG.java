
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    public static String check(String s1, String s2){
        if(s1.length() != s2.length()){
		        return "NO";
		    }
		    char[] arrS1 = s1.toLowerCase().toCharArray();
		    char[] arrS2 = s2.toLowerCase().toCharArray();
		    Arrays.sort(arrS1);
		    Arrays.sort(arrS2);
		    if(Arrays.equals(arrS1, arrS2)){
		        return "YES";
		   }
		   return "NO";
    }
	public static void main (String[] args) {
		//code
		Scanner scan = new Scanner(System.in);
		int test = Integer.parseInt(scan.nextLine());
		for(int i = 0; i < test;i++){
		    String[] arr = scan.nextLine().split(" ");
		    System.out.println(check(arr[0], arr[1]));
		}
	}
}