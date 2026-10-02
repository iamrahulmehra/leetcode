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
   
    public ListNode mid(ListNode head){
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode temp = head ;
        ListNode midterm= mid(head);
        
        
        while(temp!=midterm){
            temp=temp.next;
        }
        
        ListNode curr = temp.next;
        temp.next=null;
        ListNode prev= null;
        while(curr!=null){
            ListNode x = curr.next;
            curr.next=prev;
            prev = curr;
            curr=x;
        }
        ListNode right=prev;
        ListNode left = head;
        while(left!=null && right!=null){
            if(left.val!=right.val){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;


    }
}