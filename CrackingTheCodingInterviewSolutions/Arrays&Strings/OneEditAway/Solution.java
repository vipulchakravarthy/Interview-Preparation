
class Solution{

	public boolean isOneEdit(String s, String t){
		if(Math.abs(s.length() - t.length()) > 1) return false;

		String smaller = (s.length() < t.length()) ? s : t;
		String longer = (s.length() < t.length()) ? t : s;

		int index1 = 0;
		int index2 = 0;
		boolean found = false;
		while(index2 < t.length() && index1 < s.length()){

			if(smaller.charAt(index1) != longer.charAt(index2)){

				if(found) return false;
				found = true;
				if(s.length() == t.length()){
					index1++;
				}

			}else{
				index1++;
			}
			index2++;
		}

		return true;
	}

	public static void main(String[] args) {
		Solution obj = new Solution();
		System.out.println(obj.isOneEdit("pale", "bake"));
	}
}