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
    public ListNode deleteMiddle(ListNode head) {
        return brutForce(head);
    }

    public ListNode optimizeSolution(ListNode head){
        ListNode slow=head;
        ListNode fast=head.next.next;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        slow.next=slow.next.next;
        return head;
    }

    public ListNode brutForce(ListNode head){
        ListNode current=head;
        int count=0;

        if(head==null || head.next==null){
            return null;
        }

        while(current!=null){
            count++;
            current=current.next;
        }

        int middleNode=(count/2+1);

        current=head;
        while(current!=null){
            middleNode--;   
            if(middleNode==1){
               break;
            }
            else
                current=current.next;
        }
        
        current.next=current.next.next;
        return head;
    }
}