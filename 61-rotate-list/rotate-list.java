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

        int length=1;
        ListNode tail=head;

        if(head==null || k==0)
           return head;

        // Find the length and tail element of linkedList
        while(tail.next!=null){
            length++;
            tail=tail.next;
        }

        // If Suppose LinkedList length is 5 and k is coming 5, 10,15 (Fully Divisible by 5 i.e k) so after rotate it will come at head so if K is fully divisible by length should return head
        if(k%length==0) return head;

        // Linked tail node with head (Now our LinkedList is circular linkedlist)
        tail.next=head;
        
        //If k not fully Divisible by length find out new K e.g = k=14 and length is 5 newK = 4(Reminder)
        int newK=k%length;

        //Pass head and length-newk so 5-4=1
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