class Solution{


	public String URLify(String s){
		return s.replaceAll(" ", "%20");
	}

	public static void main(String[] args) {
		Solution obj = new Solution();

		System.out.println(obj.URLify("vip ulv  "));
	}
}