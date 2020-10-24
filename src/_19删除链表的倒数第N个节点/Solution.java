package _19删除链表的倒数第N个节点;

public class Solution {
    public static void main(String[] args) {
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
//        ListNode a3 = new ListNode(3);
//        ListNode a4 = new ListNode(4);
//        ListNode a5 = new ListNode(5);

        a1.next = a2;
//        a2.next = a3;
//        a3.next = a4;
//        a4.next = a5;

        ListNode listNode = removeNthFromEnd(a1, 1);
        System.out.println("");
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {

//        ListNode list = new ListNode();
//        ListNode temp = head;
//        int len = 0;
//        //遍历出长度
//        while (head != null) {
//            ++len;
//            head = head.next;
//        }
//        int p = len - n;
//        head=list;
//        //遍历链表 把所有节点放在返回链表中 当遇到需要删除的节点 跳过即可
//        for (int i = 0; i < len ; i++) {
//            if (i == p) {
//                temp = temp.next;
//                continue;
//            }
//            list.next = temp;
//            list=list.next;
//            temp = temp.next;
//        }
//        list.next=null;
//        return head.next;





        //快慢指针
        //快慢指针
        ListNode fast=head;//快指针
        ListNode low =head;//慢指针
        ListNode temp = new ListNode();//创建一个头节点
        head=temp;//用head返回
        //使fast 比low 多前进n个
        for (int i = 0; i < n; i++) {
            fast=fast.next;
        }
        //当fast==null 时候 low就是倒数N+1个节点
        while (fast!=null){

            temp.next=low;
            temp=temp.next;
            low=low.next;
            fast= fast.next;
        }
        //low 是倒数N+1 是low跳过下一个节点
        if (fast==null){
            low=low.next;
            temp.next=low;
        }

        return head.next;
    }
}
