import java.util.*;
class Solution{

	public void transpose(int[][] grid){
		for(int i = 0; i < grid.length; i++){
			for(int j = i; j < grid[0].length; j++){
				int temp = grid[j][i];
				grid[j][i] = grid[i][j];
				grid[i][j] = temp;
			}
		}

	}

	public void reverseColumns(int[][] grid){
		for(int i = 0; i < grid[0].length; i++){
			for(int j = 0, k = grid[0].length-1; j < k; j++, k--){
				int tem = grid[j][i];
				grid[j][i] = grid[k][i];
				grid[k][i] = tem;
			}
		}
	}


	public void rotateMatrix(int[][] grid){
		transpose(grid);
		reverseColumns(grid);
	}

	public static void main(String[] args) {
		Solution obj = new Solution();
		int arr[][] = { { 1, 2, 3, 4 }, 
                        { 5, 6, 7, 8 }, 
                        { 9, 10, 11, 12 }, 
                        { 13, 14, 15, 16 } };

        for(int i = 0; i < arr.length; i++){
			System.out.println(Arrays.toString(arr[i]));
		}
		System.out.println("*****"); 
		obj.rotateMatrix(arr);
		for(int i = 0; i < arr.length; i++){
			System.out.println(Arrays.toString(arr[i]));
		}
		
	}
}