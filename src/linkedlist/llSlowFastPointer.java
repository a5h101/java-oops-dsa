package linkedlist;

public class llSlowFastPointer {
    public static class Node{
        int data;
        Node nxt;
        Node(int data){
            this.data=data;
        }
    }

    public static class LinkedList{
        Node head = null;
        Node tail = null;
        int size = 0;

        void display(){
            Node t = head;
            while (t!=null){
                System.out.print(t.data+" ");
                t=t.nxt;
            }
            System.out.println();
        }

        void insertAtTail(int val){
            Node t =  new Node(val);
            if(size==0){
                head=t;
            }
            else {
                tail.nxt=t;
            }
            tail = t;
            size++;
        }

        void nthFromLast(int n){
            Node fast = head;
            Node slow = head;
            for(int i=0;i<n;i++){
                fast=fast.nxt;
            }

            while (fast!=null){
                fast=fast.nxt;
                slow=slow.nxt;
            }
            System.out.println(slow.data);
        }
        void deleteNthFromLast(int n){
            Node fast = head;
            Node slow = head;

            for(int i=0;i<n;i++){
                fast=fast.nxt;
            }

            if(fast==null){
                head=head.nxt;
                return;
            }

            while (fast.nxt!=null){
                slow=slow.nxt;
                fast=fast.nxt;
            }

            slow.nxt=slow.nxt.nxt;
        }

    }


    public static void main(String[] args) {
        int[] arr={5,8,4,2};
        LinkedList ll = new LinkedList();

        for (int i: arr) {
            ll.insertAtTail(i);
        }
            ll.nthFromLast(1);
        ll.display();
        ll.deleteNthFromLast(1);
        ll.display();
    }

}
