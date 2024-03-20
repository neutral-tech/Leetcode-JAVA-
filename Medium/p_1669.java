class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp=list1;
        ListNode last=list2;
        ListNode first=null,store=null;
        while(last.next!=null){
            last=last.next;
        }
        int i=1;
        while(i<=b){
            temp=temp.next;
            if(i==(a-1)) first=temp;
            i++;
        }
        store=temp.next;
        temp.next=null;
        last.next=store;
        if(a==0) return list2;
        else if(a==1) first=list1;
        first.next=list2;
        return list1;
    }
}
