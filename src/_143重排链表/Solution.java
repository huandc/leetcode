package _143重排链表;

public class Solution {
    public static void main(String[] args) {
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        ListNode a3 = new ListNode(3);
        ListNode a4 = new ListNode(4);
//        ListNode a5 = new ListNode(5);

        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
//        a4.next = a5;

        reorderList(a1);
    }
    public static void reorderList(ListNode head) {

        ListNode merege =head;

        //front 放前半部分的元素 使用后插法
        ListNode l1=new ListNode();
        ListNode front=l1;
        //放后半部分的元素 前插法
        ListNode l2=new ListNode();
        ListNode rear = l2;

        int len=0;
        ListNode temp = head.next;
        merege=merege.next;
        while (merege!=null){
            ++len;
            merege=merege.next;
        }
        merege=temp;
        int i=0;
        while (merege!=null){
            if (i<len/2){
                l1.next=merege;
                merege=merege.next;
                l1=l1.next;
                l1.next=null;
            }else {
                temp=merege.next;
                merege.next=l2.next;
                l2.next=merege;
                merege=temp;
            }
            i++;
        }
        System.out.println("");
        merege=head;
        front=front.next;
        rear=rear.next;
        while (front!=null||rear!=null){
            if (rear!=null){
               merege.next=rear;
               merege=merege.next;
               rear=rear.next;
               merege.next=null;
            }
            if (front!=null){
                merege.next=front;
                merege=merege.next;
                front=front.next;
                merege.next=null;
            }
        }

        while (head!=null){
            System.out.print(head.val+"  ");
            head=head.next;
        }






    }
}
