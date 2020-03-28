import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner scan = new Scanner(System.in);
		
		int test = Integer.parseInt(scan.nextLine());
		while(test-- > 0){
		    String s = scan.nextLine();
		    boolean flag = false;
		    for(int i = s.length()-1; i>= 0; i--){
		        if(s.charAt(i) == '1'){
		            flag = true;
		            System.out.println(i);
		            break;
		        }
		    }
		    
		    if(!flag){
		        System.out.println("-1");
		    }
		}
	}
}
