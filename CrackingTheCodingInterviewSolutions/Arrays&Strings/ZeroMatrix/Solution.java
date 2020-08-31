import java.util.ArrayList;
import java.util.Arrays;

class Solution{

	public void zeroMatrix(int[][] arr){
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr.length; j++){
				if(arr[i][j] == 0){
					list.add(i);
					list.add(j);
				}
			}
		}

		System.out.println("-------> " + list);

		for(int i = 0; i < list.size()-1; i += 2){
			int row = list.get(i);
			int col = list.get(i+1);
			if(row >= 0){
				for(int c = 0; c < arr[0].length; c++){
					arr[row][c] = 0;
				}
			}

			if(col >= 0){
				for(int r = 0; r < arr.length; r++){
					arr[r][col] = 0;
				}
			}
		}
	}

    public static void main(String[] args) {
        Solution obj = new Solution();
        int arr[][] = { { 1, 2, 3, 4 }, 
                        { 5, 6, 0, 8 }, 
                        { 9, 10, 11, 12 }, 
                        { 0, 14, 15, 16 } };

        for(int i = 0; i < arr.length; i++){
			System.out.println(Arrays.toString(arr[i]));
		}
		System.out.println("*****"); 
		obj.zeroMatrix(arr);
		for(int i = 0; i < arr.length; i++){
			System.out.println(Arrays.toString(arr[i]));
		}
    }
}