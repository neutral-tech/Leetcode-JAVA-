class Solution {
    public void deleteNode(ListNode node) {
        ListNode temp=node;
        while(node.next!=null){
        node.val=node.next.val;
        temp=node;
        node=node.next;
        }
        node=temp;
        node.next=null;
    }
}
