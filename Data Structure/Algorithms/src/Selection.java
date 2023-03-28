public class Selection {
    public static void selectionSortRecursion(int[] arr, int n) {

        if (n <= 1) {
            return;
        }

        int maxIndex = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }

        int temp = arr[maxIndex];
        arr[maxIndex] = arr[n-1];
        arr[n-1] = temp;

        selectionSortRecursion(arr, n-1);
    }

    public static void main(String[] args) {
        int[] arr = {3,5,8,1,2,10};
        selectionSortRecursion(arr,arr.length);
        for (Integer arr1: arr
        ) {
            System.out.println(arr1);
        }
    }
}
