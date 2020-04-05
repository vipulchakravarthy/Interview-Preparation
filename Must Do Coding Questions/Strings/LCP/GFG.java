
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    public static String getLCP(String a, String b){
        int n1 = a.length();
        int n2 = b.length();
        String res = "";
        int i = 0;
        int j = 0;
        
        while(i < n1 && j < n2){
            if(a.charAt(i) != b.charAt(j)){
                break;
            }
            res += a.charAt(i);
            i++;
            j++;
        }
        return res;
    }
    
    public static String check(String[] arr, int size){
        
        String prefix = arr[0];
        for(int i = 0; i < size; i++){
            prefix  = getLCP(prefix,arr[i]);
        }
        return prefix;
    }
	public static void main (String[] args) {
		//code
		Scanner scan = new Scanner(System.in);
		int test = Integer.parseInt(scan.nextLine());
		while(test-- > 0){
		    int size = Integer.parseInt(scan.nextLine());
		    String[] arr = scan.nextLine().split(" ");
		    String res = check(arr,size);
		    if(res.length() == 0){
		        System.out.println("-1");
		    }else{
		        System.out.println(res);
		    }
		}
	}
}