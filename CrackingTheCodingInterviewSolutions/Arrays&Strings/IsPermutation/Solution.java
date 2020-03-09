class Solution{

	public boolean isPermutation(String s, String t){
		if(s.length() != t.length()) return false;

		int[] marked = new int[128];

		for(int i = 0; i < s.length(); i++){
			marked[s.charAt(i)]++;
 		}

 		for(int i = 0; i < t.length(); i++){
			marked[t.charAt(i)]--;
			if(marked[t.charAt(i)] < 0) return false;
 		}
 		return true;
	}


	public static void main(String[] args) {
		Solution obj = new Solution();

		System.out.println(obj.isPermutation("vipul", "upllv"));
	}
}