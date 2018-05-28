/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        int a=0;
        int b=0;
        
        int carry = 0;
        ListNode res = head; 
        
        while(l1 != null || l2 != null ){
            a = (l1 != null ) ? l1.val : 0;
            b = (l2 != null ) ? l2.val : 0;
            
            int sum = a+b+carry;
            
            carry = sum / 10;
            
            res.next = new ListNode(sum%10);
            
            res =   res.next;
            if(l1 != null) l1 =l1.next;
            if(l2 != null) l2 =l2.next;
          
        }
        
        if(carry > 0){
            res.next = new ListNode(carry);
        }        
        
    return head.next;
    }
}