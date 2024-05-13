class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp=head;
        if(head==null) return head;
        while(temp.next!=null){
            solve(temp,temp.next);
            temp=temp.next.next;
        }
        return head;
    }
    private void solve(ListNode first,ListNode second){
        int a=first.val,b=second.val;
        while(a!=b){
            if(a>b) a=a-b;
            else b=b-a;
        }
        ListNode temp=new ListNode(a);
        first.next=temp;
        temp.next=second;
        return;
    }
}
