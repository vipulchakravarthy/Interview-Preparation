import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[] arr = { 10, 1, 4, 3, 2, 50, 100000 };
        SelectionSort obj = new SelectionSort();
        obj.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}