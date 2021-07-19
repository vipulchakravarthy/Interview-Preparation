import java.util.Arrays;

class Solution{


	public String URLify(String s){
		char[] arr = s.toCharArray();
		for(int i = 0; i < arr.length; i++){
			if(arr[i] == ' '){
				insertCh(arr, i);
				i += 2;
			}
		}
		
		System.out.println(String.valueOf(arr));
		System.out.println(s.substring(0, s.length()-4).replaceAll(" ", "%20"));
		return "";
	}

	public void insertCh(char[] arr, int index){
		System.out.println(Arrays.toString(arr) + " " +index+" "+ arr[index]);
		if(index+2 < arr.length){
			arr[index] = '%';
			for(int i = arr.length-1; i > index; i--){
				arr[i] = arr[i-2];
			}
			arr[index+1] = '2';
			arr[index+2] = '0';
		}		
	}

	public static void main(String[] args) {
		Solution obj = new Solution();

		System.out.println(obj.URLify("Mr John Smith    "));
	}
}