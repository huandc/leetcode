package _22两数相加;

class Solution {
    public static void main(String[] args) {

        // 1+99
//        ListNode a1 = new ListNode(1);
//        ListNode b1 = new ListNode(9);
//        ListNode b2 = new ListNode(9);
//        b1.next = b2;


        ListNode a1 = new ListNode(3);
        ListNode a2 = new ListNode(4);
        ListNode a3 = new ListNode(2);
        a1.next = a2;
        a2.next = a3;
        ListNode b1 = new ListNode(4);
        ListNode b2 = new ListNode(6);
        ListNode b3 = new ListNode(5);
        b1.next = b2;
        b2.next = b3;

//        ListNode a1 = new ListNode(9);
//        ListNode a2 = new ListNode(9);
//        ListNode a3 = new ListNode(9);
//        ListNode a4 = new ListNode(9);
//        a1.next = a2;
//        a2.next = a3;
//        a3.next = a4;
//        ListNode b1 = new ListNode(4);
//        ListNode b2 = new ListNode(6);
//        ListNode b3 = new ListNode(5);
//        b1.next = b2;
//        b2.next = b3;


//        ListNode a1 = new ListNode(4);
//        ListNode b1 = new ListNode(5);

        ListNode ls = addTwoNumbers(a1, b1);
        System.out.println(ls);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode res1 = new ListNode(0);
        ListNode res = res1;
        ListNode res2 = new ListNode(0);
        int flag = 0;
        while (true) {
            res2 = (flag == 1) ? new ListNode(1): new ListNode(0);

            if (l1.val + l2.val + flag >= 10) {
                res2.val = l1.val + l2.val - 10 + flag+res2.val ;
                flag = 1;
            } else {
                res2.val = l1.val + l2.val + flag + res2.val;
                flag = 0;
            }

            l1 = l1.next == null ? new ListNode(0) : l1.next;
            l2 = l2.next == null ? new ListNode(0) : l2.next;

            if(l1.next ==null & l2.next == null){
                break;
            }

            res1.next = res2.val!= 0? res2:null;
            res1 = res1.next;
        }
        return res;
    }
}

