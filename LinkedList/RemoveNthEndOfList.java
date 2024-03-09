package LinkedList;
class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class RemoveNthEndOfList {
    public static void main(String[] args) {

        ListNode l5 = new ListNode(5);
        ListNode l4 = new ListNode(4, l5);
        ListNode l3 = new ListNode(3, l4);
        ListNode l2 = new ListNode(2, l3);
        ListNode l1 = new ListNode(1, l2);

        ListNode head = removeNthFromEnd(l1, 2);
        leng(head);

//        ListNode head = removeNthElementFromEnd(l1, 2);
//        leng(head);


    }

    public static ListNode removeNthElementFromEnd(ListNode head, int n){
        int l=0;
        if (head==null) return null;

        ListNode cur = head;
        ListNode diff=head;
        while (cur!=null){
            l++;
            System.out.print(cur.val+" ");
            cur = cur.next;
            if (l>n+1) {
                diff=diff.next;
            }
        }

        if (l==1 && n==1) return null;

        diff.next=diff.next.next;
        return head;
    }

    public static ListNode removeNthFromEnd(ListNode head, int n){
        int len = leng(head);
        int trav = len-n-1;
        ListNode cur = head;
        for (int i = 0; i < trav; i++){
            cur=cur.next;
        }
        cur.next = cur.next.next;
        return head;
    }

    private static int leng(ListNode head) {
        int l=0;
        if (head==null) return l;

        ListNode cur = head;
        while (cur!=null){
            l++;
            System.out.print(cur.val+" ");
            cur = cur.next;

        }
        System.out.println(". Length is "+l);
        return l;
    }
}


//Given the head of a linked list,
// remove the nth node from the end of the list and return its head.