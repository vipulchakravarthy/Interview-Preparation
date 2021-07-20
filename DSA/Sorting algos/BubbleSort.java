class BubbleSort {
    public void sort(int[] arr) {
        // bubble up the larger element to the end
        // start from first index
        for (int i = 0; i < arr.length; i++) {
            // start from first index and go until n-1-i
            for (int j = 0; j < arr.length - i - 1; j++) {
                // always compare the adjacent elements
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}