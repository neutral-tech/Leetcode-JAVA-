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

//Recursive algorithm
class Solution {
    ListNode root;
    public ListNode reverseList(ListNode head) {
        if(head==null||head.next==null) return head;
        reverse(null,head);
        return root;
    }
    private void reverse(ListNode previous,ListNode now){
        if(now==null){
            root=previous;
            return;
        }
        reverse(now,now.next);
        now.next=previous;
        return;
    }
}
