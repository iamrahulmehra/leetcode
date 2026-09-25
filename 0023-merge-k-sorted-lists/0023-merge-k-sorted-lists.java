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
    public ListNode mergell(ListNode list1, ListNode list2) {
        ListNode Dummy = new ListNode(-1);
        ListNode curr = Dummy;

        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                curr.next = list1;
                list1=list1.next;
            }
            else{
                curr.next = list2;
                list2=list2.next;
            }
            curr=curr.next;
        }
        if(list1!=null){
            curr.next = list1;
        }
        else{
            curr.next=list2;
        }
        return Dummy.next;


    }
    public ListNode mergeKLists(ListNode[] lists) {

        ListNode result = null;
        for(int i = 0 ; i<lists.length;i++){
            result = mergell(result,lists[i]);
        }
        return result;
    }
}