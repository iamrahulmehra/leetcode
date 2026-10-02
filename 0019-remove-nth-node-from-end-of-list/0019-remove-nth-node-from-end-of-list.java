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
    public int size(ListNode head){
        ListNode temp = head;
        int length=0;
        while(temp!=null){
            temp=temp.next;
            length++;
        }
        return length;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int length = size(head);
        if(length<=1){
            return null;
        }
        for(int i = 1 ; i<length-n;i++){
            temp = temp.next;
        }
    
        if(length==n){
            head =head.next;
        }
        else if(temp.next.next!=null){
            temp.next = temp.next.next;
        }
        
        else{
            temp.next=null;
        }
        
        
        
        return head;
    }
        
        
}