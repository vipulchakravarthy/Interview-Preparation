
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner scan = new Scanner(System.in);
		
		int test = Integer.parseInt(scan.nextLine());
		while(test-- > 0){
		    String st = scan.nextLine();
		    int len = 0;
		    int max = 0;
		    HashMap<Character, Integer> map = new HashMap<>();
		    for(int i = 0; i < st.length();i++){
		        Character ch = st.charAt(i);
		        if(!map.containsKey(ch)){
		            map.put(ch,i);
		            len++;
		            max = (len > max)? len:max;
		        }else{
		            i = map.get(ch);
		            map.clear();
		            len = 0;
		        }
		    }
		    System.out.println(max);
		}
	}
}