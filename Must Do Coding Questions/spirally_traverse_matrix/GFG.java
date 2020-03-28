
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    public static void print(int[][] arr) {
        int rowL = arr.length;
        int colL = arr[0].length;
        int i;
        int rowS = 0, colS = 0;
        
        while(rowS < rowL && colS < colL) {
            for(i = colS; i < colL; ++i) {
                System.out.print(arr[rowS][i] + " ");
            }
            rowS++;
            
            for(i = rowS; i < rowL; ++i) {
                System.out.print(arr[i][colL-1] + " ");
            }
            colL--;
            
            if(rowS < rowL) {
                for(i = colL-1; i >= colS; --i) {
                    System.out.print(arr[rowL-1][i] + " ");
                }
                rowL--;
            } 
            
            if(colS < colL) {
                for(i = rowL -1; i >= rowS; --i) {
                    System.out.print(arr[i][colS] + " ");
                }
                colS++;
            }
            
        }
    }
	public static void main (String[] args) {
		//code
		Scanner scan = new Scanner(System.in);
		int test = scan.nextInt();
		
		for(int i = 0; i < test; i++) {
		    int row = scan.nextInt();
		    int col = scan.nextInt();
		    int[][] arr = new int[row][col];
		    for(int j = 0; j < row; j++){
		        for(int k = 0; k < col; k++){
		            arr[j][k] = scan.nextInt();
		        }
		    }
		    
		    print(arr);
		    System.out.println();
		}
	}
}