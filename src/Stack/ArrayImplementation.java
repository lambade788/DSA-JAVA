package Stack;

public class ArrayImplementation {
    public static class stack{
        private int arr[]=new int[100];
        private int idx=0;

        void push(int x){
            arr[idx]=x;
            idx++;
        }

        int pop(int x){
            if(idx==0){
                System.out.println("Stack is empty");
            }
            int top=arr[idx-1];
            arr[idx-1]=0;
            return top;
        }

        int peek(int x){
            if(idx==0){
                System.out.println("Stack is empty");
            }
            return arr[idx-1];
        }

        void display(){
            System.out.print("[");
            for(int i=0;i<idx;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.print("]");
        }

        int size(){
            return idx;
        }
    }
    public static void main(String[] args) {

        stack st = new stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.display();

    }
}
