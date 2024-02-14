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
    public ListNode middleNode(ListNode head) {
        ListNode current=head;
        int count=0;
        while(current!=null){
            count++;
            current=current.next;
        }

        int middleNode=(count/2+1);

        current=head;
        while(current!=null){
            middleNode--;   
            if(middleNode==0)
            break;
            
            current=current.next;
        }
        return current;
    }
}