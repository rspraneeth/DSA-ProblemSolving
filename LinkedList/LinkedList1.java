package LinkedList;

import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<Integer> nums = new LinkedList<>();

        nums.add(5);nums.add(8);nums.add(3);nums.add(7);

        System.out.println(nums);

        nums.addLast(10);
        nums.addFirst(1);

        System.out.println(nums);
        System.out.println(nums.get(5));
        System.out.println(nums.peek());
        System.out.println(nums);
    }
}
