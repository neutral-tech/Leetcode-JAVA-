class Solution {
    private int[] arr;
    int n=0,i=0;
    public ListNode removeNodes(ListNode head) {
        if(head==null||head.next==null) return head;
        i=0;
        prefix(head);
        ListNode prev=head,node=head;
        while(node.next != null){
            if(node.val < arr[i+1]){
                if(prev == node){
                    prev = prev.next;
                    head = prev;
                }
                else prev.next = node.next;
            }
            else if(prev!=node) prev = prev.next;
            node = node.next;
            i++;
        }
        return head;
    }
    private void prefix(ListNode head){
        if(head == null){
            arr = new int[n];
            i = n-1;
            return;
        }
        n++;
        prefix(head.next);
        if(i == (n-1) || head.val > arr[i+1]) arr[i] = head.val;
        else arr[i] = arr[i+1];
        i--;
        return;
    }
}

