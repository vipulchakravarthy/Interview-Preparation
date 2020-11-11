
import java.util.*;
import java.lang.*;
import java.io.*;

class Solution {
    
    public static int check(String s1, String s2){
        String temp = s1.substring(0,2);
        String temp2 = s1.substring(2);
        temp2 += temp;
        //anti-clock wise
        if(temp2.equals(s2)){
            return 1;
        }else {
            //clock-wise
            String t = s1.substring(0,s1.length()-2);
            String t1 = s1.substring(s1.length()-2);
            t1 += t;
            if(t1.equals(s2)){
                return 1;
            }
        }
        
        return 0;
    }
	public static void main (String[] args) {
		//code
		Scanner scan = new Scanner(System.in);
		int tests = Integer.parseInt(scan.nextLine());
		for(int i = 0; i < tests; i++){
		    String s1 = scan.nextLine();
		    String s2 = scan.nextLine();
		    System.out.println(check(s1, s2));
		}
	}
}