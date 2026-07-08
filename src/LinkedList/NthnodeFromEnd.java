package LinkedList;

public class NthnodeFromEnd {
    public static Node nthnode(Node head, int n){
        int size=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            size++;
        }

        int m=size-n+1;

        temp= head;
        for(int i=1;i<=m-1;i++){
            temp=temp.next;
        }
        return temp;
    }

    public static Node nthnodem2(Node head,int n){
        Node slow=head;
        Node fast=head;

        for(int i=1;i<=n;i++){
            fast=fast.next;
        }

        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }

    public static Node deletenthnode(Node head,int n){
        Node slow=head;
        Node fast=head;

        for(int i=1;i<=n;i++){
            fast=fast.next;
        }

        if(fast==null){
            head=head.next;
            return head;
        }

        while (fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return head ;
    }

    public static void main(String[] args) {
        LInkedList find = new LInkedList();
        find.add(1);
        find.add(2);
        find.add(3);
        find.add(4);
        find.add(5);

        find.display();
        Node ans= nthnode(find.head,2);
        System.out.println();
        System.out.println("output from method 1: "+ans.data);

        Node ans2=nthnodem2(find.head,2);
        System.out.println("output from method 2: "+ans2.data);

        deletenthnode(find.head,4);
        find.display();



    }
}
