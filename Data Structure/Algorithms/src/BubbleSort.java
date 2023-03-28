public class BubbleSort {
    public static void bubbleSortRecursive(int[] arr, int n) {
        if (n == 1) {
            return;
        }
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        bubbleSortRecursive(arr, n - 1);
    }
    public static void main(String[] args) {
        int[] arr = {3,5,8,1,2,10};
        bubbleSortRecursive(arr,arr.length);
        for (Integer arr1: arr
        ) {
            System.out.println(arr1);
        }
    }
}
