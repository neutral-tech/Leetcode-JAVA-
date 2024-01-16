class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode previous=null,current=head,forward;
        while(current!=null){
            forward=current.next;
            current.next=previous;
            previous=current;
            current=forward;
        }
        head=previous;
        return head;
    }
}
