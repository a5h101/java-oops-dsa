package linkedlist;

public class doublyLl {
    public static class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val = val;
        }
    }

    public static void displayTail(Node temp){
        if(temp==null) return;
        displayTail(temp.prev);
        System.out.print(temp.val+"->");
    }

    public static void display(Node any){
        while (any.prev!=null){
            any=any.prev;
        }
        while (any!=null){
            System.out.print(any.val+"->");
            any = any.next;
        }
        System.out.println("Null");
    }

    public static Node createDLL(int[] arr){
        Node head = new Node(arr[0]);
        Node temp = head;
        for(int i=1;i<arr.length;i++){
            Node t = new Node(arr[i]);
            temp.next = t;
            t.prev = temp;

            //move temp pointer
            temp = t;
        }
        return head;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9};
        Node head = createDLL(arr);
        display(head);
    }


}
