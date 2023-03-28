import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Scanner;

public class Queue1 {
    public static void queue(){
        ArrayDeque<Integer> dependent= new ArrayDeque<>();
        ArrayDeque<Integer> priority= new ArrayDeque<>();
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input mission :");
        n = scanner.nextInt();
        int hour = 0;
        System.out.println("Input dependent list:");
        for (int i=0; i <n;i++) {
            System.out.println("STT "+(i+1));
            dependent.add(scanner.nextInt());
        }
        System.out.println("Input priority task:");
        for (int i=0; i <n;i++) {
            System.out.println("STT "+(i+1));
            priority.add(scanner.nextInt());
        }
        for (int i=0;i<priority.size();i++){
            i--;
            if (Objects.equals(priority.peek(), dependent.peek())){
                priority.poll();
                dependent.poll();
                hour=hour+2;
            } else {
                assert priority.peek() != null;
                priority.add(priority.peek());
                priority.poll();
                hour++;

            }
        }
        System.out.println("Hour: " +hour);
    }
    public static void main(String[] args) {
//
        queue();
    }
}
