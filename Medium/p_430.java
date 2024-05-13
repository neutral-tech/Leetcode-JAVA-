class Solution {
    public Node flatten(Node head) {
       solve(head);
       return head;
    }
    private void solve(Node head){
        if(head==null) return;
        else if(head.child==null) solve(head.next);
        else if(head.next==null) solve(head.child);
        if(head.child!=null){
            solve(head.child);
            solve(head.next);
            Node temp=head.next;
            head.next=head.child;
            head.child=null;
            head.next.prev=head;
            while(head.next!=null) head=head.next;
            head.next=temp;
            if(temp!=null)temp.prev=head;
        }
        return;
    }
}
