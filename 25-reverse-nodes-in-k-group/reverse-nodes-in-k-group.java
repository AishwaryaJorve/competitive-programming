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
    public ListNode reverseKGroup(ListNode head, int k) {
        
        ListNode temp=head;
        ListNode kthNode=null;
        ListNode newMainHead=null;
        ListNode nextNode=null;
        ListNode lastTail=null;

        while(temp!=null){
            kthNode=findKthNode(temp,k);
            if(kthNode==null){
              if(lastTail!=null)  lastTail.next=temp;
                break;
            }

            nextNode=kthNode.next;
            kthNode.next=null;

            reverceLinkedList(temp);

            if(temp==head) newMainHead=kthNode;
            else lastTail.next=kthNode;
            lastTail=temp;
            temp=nextNode;

        }

        return newMainHead;
    }

    public static ListNode findKthNode(ListNode head,int k){
        int count=1;
        ListNode temp=head;
        while(count<k && temp!=null){
            temp=temp.next;
            count++;
        }
        return temp;
    }

    public static ListNode reverceLinkedList(ListNode head){


        ListNode temp=head;
        ListNode front=null;
        ListNode prev=null;

        while(temp!=null){
            front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }

        return prev;
    }
}