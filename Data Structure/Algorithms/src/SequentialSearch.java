public class SequentialSearch {
    public static void countElement(int[] arr,int x){
        int count = 0;
          for (int i=0;i<arr.length;i++){
              if (arr[i] == x){
                  count++;
              }
          }
        System.out.println(count);
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 80, 30, 10, 50, 10, 100, 10, 10};
        countElement(arr,10);
    }
}
