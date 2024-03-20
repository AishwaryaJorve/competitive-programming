/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {

        if(head==null)
           return null;
        
        int length=1;
        ListNode tail=head;

        while(tail.next!=null){
            length++;
            tail=tail.next;
        }

        if(k%length==0) return head;
        int newK=k%length;
        tail.next=head;
        ListNode newTail= findNewTail(head,length-newK);

        head=newTail.next;
        newTail.next=null;

        return head;
    }

    public ListNode findNewTail(ListNode head,int newK){
        int count=1;
        ListNode newTail=head;
        
        while(head!=null){
            if(count==newK) return newTail;
            newTail=newTail.next;
            count++;
        }

        return newTail;
    }
}