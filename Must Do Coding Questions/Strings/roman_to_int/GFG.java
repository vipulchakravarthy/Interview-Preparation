
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    static HashMap<Character, Integer> map = new HashMap<Character, Integer>();
    public static void start(){
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
    }
    public static int func(String q){
        int i = 0;
        int res = 0;
        if(q.length() <= 1){
            return map.get(q.charAt(0));
        }else{
            while(i < (q.length())) {
                //IX
                if(i < (q.length()-1) && map.get(q.charAt(i)) < map.get(q.charAt(i+1))){
                    res += map.get(q.charAt(i+1)) - map.get(q.charAt(i));
                    i += 2;
                }else{
                    //XII
                    res += map.get(q.charAt(i));
                    i++;
                }
            }
        }
        return res;
    }
	public static void main (String[] args) {
		//code
		Scanner scan = new Scanner(System.in);
		int test = Integer.parseInt(scan.nextLine());
		start();
		for(int i = 0; i < test;i++){
		    String query = scan.nextLine();
		    System.out.println(func(query));
		}
	}
}