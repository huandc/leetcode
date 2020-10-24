package _234回文链表;

import java.util.List;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
//        ListNode a3 = new ListNode(3);
        ListNode a4 = new ListNode(2);
        ListNode a5 = new ListNode(1);

        a1.next = a2;
        a2.next = a4;
//        a3.next = a4;
        a4.next = a5;

        System.out.println(isPalindrome(a1));
    }

    public static boolean isPalindrome(ListNode head) {

        //快慢指针找中点
        ListNode fast=head;
        ListNode low=head;
        Stack<ListNode> stack = new Stack<>();

        int len=0;
        while (fast!=null && fast.next!=null){
            fast=fast.next.next;
            len+=2;
            stack.push(low);
            low=low.next;

        }
        if (fast==null){

        }else {
            len+=1;
        }
        System.out.println(len);
        if (len%2==1){
            low=low.next;
        }

        while (!stack.empty()){
            if (low.val!=stack.pop().val){
                return false;
            }
            low=low.next;
        }


//
//        //将后半部分前插到fast中
//        fast=new ListNode();
//        while (low!=null){
//            temp=new ListNode(low.val);
//            temp.next=fast.next;
//            fast.next=temp;
//            low=low.next;
//
//        }
//        fast= fast.next;
//
//        while (fast!=null){
//            if (head.val!=fast.val){
//                return false;
//            }
//            head=head.next;
//            fast=fast.next;
//        }







        return true;
    }
}

