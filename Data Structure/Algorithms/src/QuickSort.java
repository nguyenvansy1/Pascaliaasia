import java.util.Arrays;

public class QuickSort {
    //Using quicksort to both 2 arrays
    //Compare sum between 2 arrays and manage their indexs.
    public static int[] findMinSumPairs(int[] arr1, int[] arr2, int k) {
        quicksort(arr1, 0, arr1.length - 1);
        quicksort(arr2, 0, arr2.length - 1);

        int n = arr1.length;
        int[] sums = new int[n * n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sums[index++] = arr1[i] + arr2[j];
            }
        }

        Arrays.sort(sums);
        int[] minSumPairs = new int[k * 2];
        for (int i = 0; i < k; i++) {
            minSumPairs[i * 2] = sums[i] / n;
            minSumPairs[i * 2 + 1] = sums[i] % n;
        }

        return minSumPairs;
    }

    private static void quicksort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quicksort(arr, low, pivotIndex - 1);
            quicksort(arr, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        int[] arr1 = {11, 7, 1};
        int[] arr2 = {4, 6, 2};
        findMinSumPairs(arr1,arr2,2);
    }
}
