package _142环形链表IIdetectCycle;

public class Solution {
    public static void main(String[] args) {

    }
    public  static ListNode detectCycle(ListNode head) {
        ListNode slow = head; //慢指针
        ListNode fast = head;  //快指针

        do {
            //当fast 可以走尽时  说明没有环路
            if (fast ==null ||fast.next ==null) return null;
            fast = fast.next.next;  //快指针每次走两步
            slow=slow.next;  //满指针一次走一步
        }while (fast!=slow);//当两个相遇时候,存在环路

        fast = head;
        while (fast!=slow){
            slow= slow.next;
            fast=fast.next;
        }
        return fast;

    }
}
