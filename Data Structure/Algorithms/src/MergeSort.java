import java.util.Arrays;

public class MergeSort {
    public static int findMaxPairSum(int[] arr) {
        int n = arr.length;
        int[] sortedArr = new int[n];
        for (int i = 0; i < n; i++) {
            sortedArr[i] = arr[i];
        }
        Arrays.sort(sortedArr);

        int max1 = arr[0], max2 = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++) {
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2) {
                max2 = arr[i];
            }
        }
        return sortedArr[n-1] + sortedArr[n-2];
    }

    public static void main(String[] args) {
         int[] arr = {0,2,1,9,7};
         findMaxPairSum(arr);
    }
}
