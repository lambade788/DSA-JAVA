package LinkedList;

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data=data;
        next=null;
    }
}
public class LInkedList {

    Node head;
    public void add(int data){
        Node newnode = new Node(data);
        if(head==null) {
            head = newnode;
            return;
        }

        Node temp=head;

        while(temp.next!=null){
            temp=temp.next;
        }

        temp.next=newnode;
    }

    void display() {
        Node temp=head;

        while(temp!=null){
            System.out.print(temp.data+" --> ");
            temp=temp.next;
        }
    }

    void insertatfirst(int data){
        Node newnode=new Node(data);

       newnode.next=head;

       head=newnode;
    }

    void insertat(int idx,int data){
        Node net = new Node(data);
        Node temp =head;

        if(idx==size()){
            add(data);
            return;
        }
        else if(idx==0){
             insertatfirst(data);
             return;
        } else if (idx<0 || idx>size()) {
            System.out.println("Wrong index.");
        }

        for(int i=1;i<idx-1;i++){
            temp=temp.next;
        }

        net.next=temp.next;
        temp.next=net;
    }


    int size() {

        int count = 0;

        Node temp = head;

        while(temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }

    int get(int idx){
        Node temp=head;
        for(int i=1;i<=idx;i++){
            temp=temp.next;
        }
        return temp.data;
    }

    void delete(int idx){
        Node temp=head;
        if(idx==0) head=head.next;
        for(int i=1;i<idx;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
    }




}

