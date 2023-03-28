import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Heap {
    public static void main(String[] args) {
        int[] arr = {1, 23, 12, 9, 30, 2, 50};
        int k = 3;

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int num : arr) {
            pq.offer(num);
            if (pq.size() > k) {
                pq.poll();
            }
        }

        List<Integer> list = new ArrayList<>(pq);

        System.out.println("K largest elements in the array are:");
        for (int num : list) {
            System.out.print(num + " ");
        }
    }
    }

