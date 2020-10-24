package _21合并两个有序链表;

public class Solution {
    public static void main(String[] args) {
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        ListNode a3 = new ListNode(4);
        a1.next = a2;
        a2.next = a3;
        ListNode b1 = new ListNode(1);
        ListNode b2 = new ListNode(3);
        ListNode b3 = new ListNode(4);
        b1.next = b2;
        b2.next = b3;

        ListNode res = mergeTwoLists(a1,b1);
        while (res!=null){
            System.out.print(res.val+"->");
            res=res.next;
        }
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode ls=new ListNode(0,null);
        ListNode head =ls;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                ls.next = l1;
                l1 = l1.next;
            } else {
                ls.next = l2;
                l2 = l2.next;
            }
            ls=ls.next;
        }
        if (l1 != null) {
            ls.next = l1;
            ls=ls.next;
            l1=l1.next;
        }
        if (l2 != null) {
            ls.next = l2;
            ls=ls.next;
            l2=l2.next;
        }

        return head.next;
    }

}
