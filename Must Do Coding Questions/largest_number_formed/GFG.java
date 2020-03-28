
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner scan = new Scanner(System.in);
		int test = Integer.parseInt(scan.nextLine());
		for(int i = 0; i < test;i++){
		    int size = Integer.parseInt(scan.nextLine());
		    String[] arr = scan.nextLine().split(" ");
		    Arrays.sort(arr, new Comparator<String>(){
		        
		        @Override
		        public int compare(String x, String y){
		            String xy = x + y;
		            String yx = y + x;
		            
		            return xy.compareTo(yx)>0 ? -1:1;
		        }
		    });
		    
		    for(int j = 0; j < size;j++){
		        System.out.print(arr[j]);
		    }
		    
		    System.out.println();
		}
	}
}