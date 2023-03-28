import java.sql.SQLOutput;
import java.util.Scanner;

public class Array {
    public static void sumAndAverage(int[] arr){
        int sum = 0;
        for(int i=0; i < arr.length;i++) {
            int min = arr[1];
            sum+=arr[i];
        }
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + sum/arr.length);
    }

    public static void minAndMax(int[] arr){
        int min = arr[0];
        int max = arr[0];
        for(int i=1; i < arr.length;i++) {
            if (arr[i]<min) {
                min = arr[i];
            }
            if (arr[i]>max) {
                max = arr[i];
            }
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }

    public static void sumArray(int[] a , int[] b){
        Integer[] c = new Integer[a.length];
        for(int i=0; i<a.length;i++){
            c[i] = a[i]+b[i];
        }
        for (Integer c1: c) {
            System.out.print(c1);
        }
    }
    public static void array2() {
        int m;
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input m :");
        m = scanner.nextInt();
        System.out.println("Input n :");
        n = scanner.nextInt();
        int[][] arr0 = new int[m][n];
        for (int i=0; i<m ;i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Enter the element arr[" +i + "][" +j+"]");
               arr0[i][j] = scanner.nextInt();
            }
        }
        int sum = 0;
        int min = arr0[0][0];
        int max = arr0[0][0];
        for (int i=0; i<m ;i++) {
           for (int j=0; j<n;j++) {
//              if (i ==0 && j==0){
//                  continue;
//              }
//              if (arr[i][j] < min) {
//                  min = arr[i][j];
//              }
//              if (arr[i][j] > max){
//                  max = arr[i][j];
//              }
              sum+= arr0[i][j];
           }
        }
        System.out.println("Sum: " + sum);
        System.out.println("Avg: " + sum/(m*n));

    }

    public static void main(String[] args) {
       int[] arr = {1,4,5,7,8};
       int[] a = {1,2,3,4,5};
       int[] b = {4,5,3,2,10};
       sumAndAverage(arr);
       minAndMax(arr);
       sumArray(a,b);
       array2();
    }
}



