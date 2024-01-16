class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null) return head;
        else if(head.next==null) return head;
        ListNode front=head,p=head,q=head.next,back=q.next;
        while(q!=null){
            back=q.next;
            q.next=p;
            p.next=back;
            if(p==head) head=q;
            else front.next=q;
            front=p;
            p=p.next;
            if(p==null) break;
            q=p.next;
        }
        return head;
    }
}
