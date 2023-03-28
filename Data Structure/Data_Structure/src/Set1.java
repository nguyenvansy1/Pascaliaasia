import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Set1 {
    public static void learn(){
        boolean check =true;
        int day = 1;
        Set<String> integerSet = new LinkedHashSet<>();
        do {
            int count;

            Scanner scanner = new Scanner(System.in);
            System.out.println("Day" + day + " :");
            System.out.println("Enter the numbers you learned");
            count = Integer.parseInt(scanner.nextLine());
            for (int i =0 ;i< count ;i++) {
                System.out.println("Enter the word " +(i+1) + " :");
                String word = scanner.nextLine();
                integerSet.add(word);
            }
            for (String x : integerSet) {
                System.out.print(x + ", ");
            }
            System.out.println("Choose y/n");
            String choose = scanner.nextLine();
            if (choose.equals("y")){
                day++;
                check = true;
            } else {
                check =false;
            }
        } while (check);
    }
    public static void main(String[] args) {
//        Set<Integer> integerSet = new LinkedHashSet<>();
//        int[] arr = {1,2,3,4,5,2,-1,5,2,7,11,11,-5};
//        for (int i=0; i<arr.length;i++){
//            integerSet.add(arr[i]);
//        }
//        for (Integer x: integerSet
//             ) {
//            System.out.print(x + " ");
//        }
       learn();
    }
}
