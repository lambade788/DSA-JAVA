package Stack;

import java.util.Stack;

public class Insertatbottom {
    public static void main(String[] args) {
        Stack<Integer> insert = new Stack<>();
        insert.push(1);
        insert.push(2);
        insert.push(3);
        insert.push(4);
        insert.push(5);
        System.out.println(insert.peek());

        int idx=4;
        int x=7;

        Stack<Integer> insert2 =new Stack<>();

        while(insert.size()>idx){
            insert2.push(insert.pop());
        }

        insert.push(x);

        while(insert2.size()>0){
            insert.push(insert2.pop());
        }

        System.out.println(insert);
    }
}
