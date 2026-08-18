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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode bumm = new ListNode(0);

        ListNode curr= bumm;
        int carry =0;

        while(l1!=null || l2!=null || carry!=0)
        {
            int digt1 = (l1!=null) ? l1.val : 0;
            int digt2 = (l2!=null) ? l2.val : 0;

           int sum = digt1+digt2 + carry;

           int digt = sum%10;
           carry= sum/10;

        curr.next = new ListNode(digt);

        curr = curr.next;

        if (l1 != null) {
                l1 = l1.next;
            }

            if (l2 != null) {
                l2 = l2.next;
            }
         

        }
        

        return bumm.next;
        
    }
}