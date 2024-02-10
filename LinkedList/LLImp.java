package LinkedList;

class Node{
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        next=null;
    }
}

class LL {

    Node head = null;
    public void add(int data){
        Node nn = new Node(data);
        Node current = head;
        if (head==null) head=nn;
        else {
            while (current.next!=null) current=current.next;
            current.next=nn;
        }
    }

    public void printValues() {
        Node current=head;
        while (current != null) {
            System.out.print(current.data+" ");
            current = current.next;
        }
        System.out.println();
    }

    public void addFirst(int data) {
        Node nn = new Node(data);
        nn.next=head;
        head=nn;
    }

    public void delete(int data) {
        Node current = head;

//        Node prev=null;
//        while (current.next != null){
//            if (current.data == data) {
//                prev.next=current.next;
//                break;
//            }
//            else {
//                prev=current;
//                current = current.next;
//            }
//
//        }

        while (current.next!=null && current.next.data!=data) current=current.next;
        if (current.next != null) current.next = current.next.next;
    }
}

public class LLImp{
    public static void main(String[] args) {
        LL nums = new LL();
        nums.add(2);
        nums.add(5);
        nums.add(7);
        nums.add(9);
        nums.printValues();
        nums.addFirst(10);
        nums.printValues();
        nums.delete(7);
        nums.printValues();
    }
}

