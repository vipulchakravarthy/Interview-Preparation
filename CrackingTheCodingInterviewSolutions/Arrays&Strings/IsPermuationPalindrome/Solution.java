class Solution{

	public int getCharNumber(Character c) {
		int a = Character.getNumericValue('a');
		int z = Character.getNumericValue('z');
		
		int val = Character.getNumericValue(c);
		if (a <= val && val <= z) {
			return val - a;
		}
		return -1;
	}


	public boolean isPermutationPalindrome(String s){
		int count = 0;
		Solution obj = new Solution();
		int[] ascii = new int[26];
		// System.out.println(Character.getNumericValue('z') - Character.getNumericValue('a') + 1);
		for(char c: s.toCharArray()){
			int x = obj.getCharNumber(c);
			if(x != -1) {
				ascii[x]++;
				if(ascii[x] % 2 == 1){
					count++;
				}else{
					count--;
				}
			}
		}

		return count <= 1;
	}

	public static void main(String[] args) {
		Solution obj = new Solution();

		System.out.println(obj.isPermutationPalindrome("Zeus was deified, sat Suez"));
	}
}