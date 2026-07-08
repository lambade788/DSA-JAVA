package Stack;

import java.util.Stack;

public class Copystack {
    public static void main(String[] args) {
        Stack<Integer> copy = new Stack<>();
        copy.push(1);
        copy.push(2);
        copy.push(3);
        copy.push(4);
        copy.push(5);

        System.out.println(copy);

        Stack<Integer> copy1= new Stack<>();
        while (!copy.isEmpty()){
            copy1.push(copy.pop());
        }
//        System.out.println(copy1);

        Stack<Integer> copy2=new Stack<>();
        while(!copy1.isEmpty()){
            copy2.push(copy1.pop());
        }

        System.out.println(copy2);

    }
}
