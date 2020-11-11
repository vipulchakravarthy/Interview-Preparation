
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner scan = new Scanner(System.in);
		int test = Integer.parseInt(scan.nextLine());
		for(int i = 0; i < test;i++){
		    String st = scan.nextLine();
		    System.out.println(fun(st));
		}
    }
    
    public static String fun(String st) {
        boolean[] chars = new boolean[256];
        StringBuilder sb = new StringBuilder();
        for(Character c: st.toCharArray()){
            if(!chars[c]) {
                sb.append(c);
                chars[c] = true;
            }
        }
        return sb.toString();
    }
}