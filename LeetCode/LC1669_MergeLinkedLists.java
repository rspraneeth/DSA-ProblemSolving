public class LC1669_MergeLinkedLists {


    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {

        int h = 0;
        ListNode cur = list1;
        ListNode c = null;
        ListNode curr=list2;
        while(curr.next!=null){
            curr=curr.next;
        }
        System.out.println("list2, last value is "+curr.val);
        while(cur.next!=null){
            System.out.println(h+" "+cur.val);
            if(h==b){
                curr.next=cur.next;
                System.out.println(curr.val+"***");
                break;
            }
            cur=cur.next;
            h++;
        }
        h=0;cur=list1;
        while(cur.next!=null){
            System.out.println(h+" ");
            if(h==a-1){
                c=cur;
                System.out.println(c.val+"  "+cur.val);
                c.next=list2;
            }
            System.out.println("current value is "+cur.val);
            cur=cur.next;
            h++;
        }



        return list1;

        //when removing elements between node values a & b
        // ListNode current=list1;
        // ListNode cur = list2;
        // ListNode c = null;

        // while(cur.next!=null){
        //     cur=cur.next;
        // }

        // while(current.next!=null){
        //     if(current.next.val==a){
        //         c=current;
        //         c.next=list2;
        //     }
        //     if(current.next.val==b){
        //         cur=current.next.next;
        //     }
        //     current=current.next;
        // }

        // return list1;
    }

}

