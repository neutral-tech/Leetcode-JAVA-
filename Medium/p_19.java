class Solution {
    private int num=0;
    private ListNode back=null;
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null) return head;
        else if(head.next==null&&n==1) return null;
        remove(head,n);
        if(this.num==n) return head.next;
        return head;
    }
    private void remove(ListNode head,int n){
        if(head==null) return;
        remove(head.next,n);
        (this.num)++;
        if(this.num==(n-1)) back=head;
        else if(this.num==(n+1)){
            head.next=back;
            return;
        }
        return;
    }
}
