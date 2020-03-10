import java.util.*;

class Solution{

	public String stringCompression(String st){
		HashMap<Character, Integer> map =new HashMap<>();

		for(int i = 0; i < st.length(); i++){
			if(map.containsKey(st.charAt(i))){
				map.put(st.charAt(i), map.get(st.charAt(i)) + 1);
			}else{
				map.put(st.charAt(i), 1);
			}
		}

		String res = st.charAt(0) +"" + map.get(st.charAt(0)); 
		char prev = st.charAt(0);
		for(int i = 1; i < st.length();i++){
			if(prev != st.charAt(i)){
				res += st.charAt(i) +""+map.get(st.charAt(i));
				prev = st.charAt(i);
			}
		}

		if(res.length() > st.length()) return st;
		return res;
	}

	public static void main(String[] args) {
		Solution obj = new Solution();
		System.out.println(obj.stringCompression("bbbbbbcccddd"));
	}
}