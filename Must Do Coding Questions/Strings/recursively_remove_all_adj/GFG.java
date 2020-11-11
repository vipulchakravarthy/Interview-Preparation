import java.util.*;

class Solution{


	public static String removeAdj(String st){

		if(st.length() == 0) return "";

		Stack<Character> stk = new Stack<>();

		for(int i = 0; i < st.length();i++){
			stk.push(st.charAt(i));
		}
		st = "";
		Character ch = stk.peek();
		stk.pop();
		boolean flag = false;
		int check = 0;

		while(!stk.isEmpty()){
			if(stk.peek() == ch){
				flag = true;
				check = 1;
			}
			else{
				if(flag == false){
					st += ch;
				}
				ch = stk.peek();
				flag = false;
			}
			stk.pop();
		}

		if(flag == false){
			st += ch;
		}
		StringBuilder sb =new StringBuilder(st);
	    sb = sb.reverse();
	    st = sb.toString();
	    
	    if(check==1){
	    	st = removeAdj(st);
	    }
	   return str;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int tc = Integer.parseInt(scan.nextLine());
		while(tc-- > 0){
			String st = scan.nextLine();
			System.out.println(removeAdj(st));
		}
	}
}