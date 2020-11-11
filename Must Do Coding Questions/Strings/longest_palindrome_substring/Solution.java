
class Solution{

	public static String longestPalindromicSubstring(String st){
		int n = st.length;

		//grid to check the substring is palindrome or not
		//true indicates is it and false indicates its not
		boolean[][] grid = new boolean[n][n];

		//as 1 character string is always palindrome
		//make [i][i] true
		for(int i = 0; i < n; i++){
			grid[i][i] = true; 
		}

		//check whether substring of length is 2 is palindrome or not
		int maxLength = 1;
		int start = 0;
		for(int i = 0; i < n-1;i++){
			if(st.charAt(i) == st.charAt(i+1)){
				grid[i][i+1] = true;
				maxLength = 2;
				start = i;
			}
		}

		//Now with the help of above values we can check for
		//length of 3,4....n
		//

		for(int k = 3; k < n; k++){
			for(int i = 0; i < n; i++){
				int j = i+k;
				if(st.charAt(i) == st.charAt(j) && grid[i+1][j-1]){
					grid[i][j] = true;
					if(k > maxLength){
						start = i;
						maxLength = k;
					}
				}
			}

		}
		return st.substring(start,start + maxLength);
	}


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int tc = Integer.parseInt(scan.nextLine());
		while(tc-- > 0){
			String st = scan.nextLine();
			System.out.println(longestPalindromicSubstring(st));
		}
	}
}