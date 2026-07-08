package LinkedList;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LInkedList nums = new LInkedList();

        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.insertatfirst(0);
        nums.insertatfirst(-1);
        nums.insertat(6,44);
        nums.insertat(3,11);
        System.out.println(nums.get(3));
//        nums.delete(5);
//        nums.delete(1);


        nums.display();
        System.out.println();
        System.out.println(nums.size());



//        newnode.addFirst(11);
//        newnode.addLast(13);



    }
}
