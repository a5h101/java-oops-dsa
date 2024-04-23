package linkedlist;

public class llclassnmethods {
    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next=null;
        }
    }

    public static class linkedlist {
        Node head = null;
        Node tail = null;
        int size = 0;

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println();
        }

        void insertAtHead(int val) {
            Node temp = new Node(val);
            if (size == 0) {
                head = tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
            size++;
        }

        void insertAtEnd(int val) {
            Node temp = new Node(val);
            if (size == 0) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
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
        void insertAt(int idx, int val) {
            if (idx < 0 || idx > size) {
                System.out.println("Invalid Index");
            } else if (idx == 0) {
                insertAtHead(val);
            } else if (idx == size) {
                insertAtEnd(val);
            } else {
                Node curr = head;
                Node temp = new Node(val);
                for (int i = 0; i < idx - 1; i++) {
                    curr = curr.next;
                }
                temp.next = curr.next;
                curr.next = temp;
                size++;
            }
        }

        void getAt(int idx) {
            if (idx < 0 || idx >= size) {
                System.out.println("Invalid Index");
            } else if (idx == 0) {
                System.out.println(head.data);
            } else if (idx == size - 1) {
                System.out.println(tail.data);
            } else {
                Node curr = head;
                for (int i = 0; i < idx; i++) {
                    curr = curr.next;
                }
                System.out.println(curr.data);
            }
        }

        void nthFormEnd(int n) {
            int s = 0; //ll size
//            int s = size;
            int c = 0; //count
            Node temp = head;
            while (temp != null) {
                s++;
                temp = temp.next;
            }
            temp = head;
            while (c != (s - n - 1)) {
                temp = temp.next;
                c++;
            }
            System.out.println(temp.next.data);
        }

        void deleteAt(int idx) {
            if (idx < 0 || idx >= size) {
                System.out.println("Invalid Index");
            } else if (idx == 0) {
                head = head.next;
                size--;
            } else if (idx == size - 1) {
                Node curr = head;
                for (int i = 0; i < idx - 1; i++) {
                    curr = curr.next;
                }
                curr.next = null;
                tail = curr;
                size--;
            } else {
                Node curr = head;
                for (int i = 0; i < idx - 1; i++) {
                    curr = curr.next;
                }
                curr.next = curr.next.next;
                size--;
            }
        }

        void sortLinkedList() {
            if (head == null || head.next == null)
                return;
            Node curr = head;
            while (curr != null) {
                Node innerCurr = head;
                while (innerCurr.next != null) {
                    if (innerCurr.data > innerCurr.next.data) {
                        swapNodes(innerCurr, innerCurr.next);
                    }
                    innerCurr = innerCurr.next;
                }
                curr = curr.next;
            }
        }

        void swapNodes(Node a, Node b) {
            int temp = a.data;
            a.data = b.data;
            b.data = temp;
        }
    }

        public static void main(String[] args) {
            int[] arr = {8, 5, 4, -2,9,-8,7};
            linkedlist ll = new linkedlist();
            for (int i : arr) {
                ll.insertAtEnd(i);
//            ll.display();
            }
//        ll.insertAt(3,3);
//        ll.display();
//        ll.getAt(3);
//        ll.deleteAt(3);
//        System.out.println(ll.tail.data + " " + ll.head.data);
//        ll.nthFormEnd(2);
            ll.display();
            ll.sortLinkedList();
            ll.display();
    }
}

