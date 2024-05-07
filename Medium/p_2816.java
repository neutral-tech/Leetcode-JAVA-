class Solution {
    private int carry=0;
    public ListNode doubleIt(ListNode head) {
        add(head);
        if(carry!=0){
            ListNode temp=new ListNode(carry);
            temp.next=head;
            head=temp;
        }
        return head;
    }
    private void add(ListNode head){
        if(head==null) return;
        add(head.next);
        head.val=2*(head.val)+carry;
        carry=head.val/10;
        head.val=(head.val)%10;
        return;
    }
}
