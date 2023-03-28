import sun.awt.image.ImageWatched;

import java.util.LinkedList;
public class LinkedList1 {
    public static void remove(LinkedList<Integer> link , int x){
        for(int i =0 ; i< link.size();i++){
            if (link.get(i) == x ) {
                link.remove(i);
            }
        }
    }
    public static void reverse(LinkedList<Integer> link) {
        for(int i = link.size()-1 ; i >= 0;i--){
            System.out.print(link.get(i) + "\t");
        }
    }

    public static void sortTwoLinkedList(LinkedList<Integer> link1 , LinkedList<Integer> link2){
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addAll(link1);
        linkedList.addAll(link2);
        for (int i=0; i< linkedList.size();i++){
            for (int j = i+1 ; j< linkedList.size();j++)
            {
                if (linkedList.get(i)> linkedList.get(j)){
                    int temp = linkedList.get(i);
                    linkedList.set(i,linkedList.get(j));
                    linkedList.set(j,temp);
                }
            }
        }
        for (Integer link : linkedList) {
            System.out.print(link + "\t");
        }
    }
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(2);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);
        linkedList.add(9);
        LinkedList<Integer> linkedList1 = new LinkedList<>();
        linkedList1.add(1);
        linkedList1.add(3);
        linkedList1.add(7);
        linkedList1.add(8);
//        remove(linkedList,3);
//        for (Integer link : linkedList) {
//            System.out.print(link + "\t");
//        }
//        reverse(linkedList);
        sortTwoLinkedList(linkedList, linkedList1);
    }
}
