class Node{
    int data;
    Node next;
    Node(int d){
        data = d;
        next = null;
    }
}

public class L30DeleteKthEle {
    public static void main(String args[]){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = head;
        head= delKth(head, 4);
        printlist(head);

    }
    public static void printlist(Node head){
        if(head==null)return;
        Node r=head;
        do{
            System.out.print(r.data+" ");
            r=r.next;
        }while(r!=head);

    }

    public static Node delKth(Node head, int k){
        if(head == null) return null;
        if(k==1) return delHead(head); // if k= head of the linkedlist

        Node curr = head;
        for(int i=0; i<k-2;i++){
            curr= curr.next;
        }
        curr.next= curr.next.next;
        return head;

    }

    // for deleting head of the linkedlist
    public static Node delHead(Node head){
        if(head== null) return null;
        if(head.next == head) return null;

        head.data = head.next.data;
        head.next= head.next.next;
        return head;

    }
}
