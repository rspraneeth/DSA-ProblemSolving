import java.util.HashMap;
import java.util.Map;

public class LC1171_RemoveZeroSum {
    public static void main(String[] args) {
//        ListNode l5 = new ListNode(1);
//        ListNode l4 = new ListNode(3, l5);
//        ListNode l3 = new ListNode(-3, l4);
        ListNode l2 = new ListNode(-1, null);
        ListNode l1 = new ListNode(1, l2);
        System.out.println(len(l1));
        ListNode node=removeZeroSumSublists(l1);
        System.out.println(node);
        System.out.println(len(node));

    }

    private static int len(ListNode head) {
        int l=0;
        ListNode current=head;
        while (current!=null){
            l++;
            System.out.print(current.val+" ");
            current=current.next;
        }
        System.out.println();
        return l;
    }

    public static ListNode removeZeroSumSublists(ListNode head) {
        if (head==null) return null;

        ListNode dummy = new ListNode(0); // a dummy(helps in pfSum=0), so whenever prefixSum=0, that means nodes until that point can be removed, so from dummy to current will be removed.
        dummy.next = head;
        int pf= 0;
        ListNode curr = dummy;
        Map<Integer, ListNode> pfMap = new HashMap<>();
        while (curr!=null){ // setting pfSum values with respective nodes in Map
            pf+= curr.val;
            pfMap.put(pf, curr);
            curr=curr.next;
        }

        pf=0;
        curr=dummy;

        while (curr!=null){

            pf+= curr.val;
            curr.next = pfMap.get(pf).next; //whenever pfSum equals to value present in map, means can remove from current to until that element
            curr=curr.next;

        }

        return dummy.next;
    }

}
