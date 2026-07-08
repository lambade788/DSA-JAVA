package Queue;

public class QueueImplementationArray {
    static class QueueY{
       int r=-1;
       int front=-1;
      int [] arr= new int[100];
      int size=0;

      public void add(int val){
          if(front==-1) {
              front=0;
              r=0;
              arr[0]=val;
          }
          else{
              arr[++r]=val;
          }
          size++;
      }

        public int remove(){
            if(size == 0){
                System.out.println("Empty");
                return -1;
            }

            int val = arr[front];
            front++;
            size--;

            return val;
        }

        public int peek(){
          if(size==0){
              System.out.println("Empty");
          }
          return arr[front];
        }


        public boolean isEmpty(){
          if(size==0){
              return true;
          }
          else{
          return false;
          }
        }

      public void display(){
        if(size==0) System.out.print("Queue is Empty.");
        else for(int i=front;i<=r;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        }
    }
    public static void main(String[] args) {
        QueueY q = new QueueY();
        q.add(1);
        q.add(2);
        q.add(3);
//        System.out.println(q);
        q.display();

        q.remove();
        q.display();

        System.out.println(q.peek());

        System.out.println(q.isEmpty());
    }
}


