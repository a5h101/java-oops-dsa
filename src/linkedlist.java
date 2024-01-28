public class linkedlist {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void lengthRecursion(Node head){
        int l=0;
        Node temp=head;
        while (temp!=null){
            l++;
            temp=temp.next;
        }
        System.out.println(l);
    }
    public static void displayRecursion(Node head){
        if(head==null) return;
        System.out.print(head.data+"\t");
        displayRecursion(head.next);
    }
    public static void displayRecursionReverse(Node head){
        if(head==null) return;
        displayRecursionReverse(head.next);
        System.out.print(head.data+"\t");
    }
    public static void display(Node head){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+ "\t");
            temp=temp.next;
        }
    }
    public static void insertAtEnd(Node head,int data){
        Node temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next= new Node(data);
    }
    public static void main(String[] args) {
        Node a=new Node(98);
        Node b=new Node(78);
        Node c=new Node(8);
        Node d=new Node(55);
        Node e=new Node(15);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
//        System.out.println(a.next.next.next.data);
        display(a);
        System.out.println();
        displayRecursion(a);
        System.out.println();
        displayRecursionReverse(a);
        System.out.println();
        lengthRecursion(a);
    }
}

