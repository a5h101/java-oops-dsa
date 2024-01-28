public class llclassnmethods {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    public static class linkedlist{
        Node head=null;
        Node tail=null;
        int size=0;

        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data);
                temp=temp.next;
            }
            System.out.println();
        }

        void insertAtHead(int val){
            Node temp = new Node(val);
            if(size==0){
                head=tail=temp;
            }
            else {
                temp.next=head;
                head=temp;
            }
            size++;
        }

        void insertAtEnd(int val){
            Node temp = new Node(val);
            if(size==0){
                head=tail=temp;
            }
            else {
                tail.next=temp;
                tail=temp;
            }
            size++;
        }
//        void insertAt(int idx,int val){
//            Node curr=head;
//            Node temp=new Node(val);
//            for(int i=0;i<size;i++){
//                if(i==idx-1){
//                    Node t=curr.next;
//                    curr.next=temp;
//                    temp.next=t;
//                    size++;
//                    break;
//                }
//                curr=curr.next;
//            }
//        }
        void insertAt(int idx,int val){
            if(idx<0 || idx>size){
                System.out.println("Invalid Index");
            }
            else if(idx==0){
                insertAtHead(val);
            }
            else if(idx==size){
                insertAtEnd(val);
            }
            else {
                Node curr=head;
                Node temp=new Node(val);
                for(int i=0;i<idx-1;i++){
                    curr=curr.next;
                }
                temp.next=curr.next;
                curr.next=temp;
                size++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr={5,8,4,2};
        linkedlist ll=new linkedlist();
        for(int i:arr){
            ll.insertAtEnd(i);
            ll.display();
        }
        ll.insertAt(3,3);
        ll.display();
    }
}

