class Solution{

	public boolean isUnique(String st){
		if(st.length() > 128) return false;

		boolean[] marked = new boolean[128];

		for(int i = 0; i < st.length(); i++){
			if(marked[st.charAt(i)]) return false;
			marked[st.charAt(i)] = true;
 		}
 		return true;
	}


	public static void main(String[] args) {
		Solution obj = new Solution();

		System.out.println(obj.isUnique("vipulv"));
	}
}