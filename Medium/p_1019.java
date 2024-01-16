class Solution {
    public int[] nextLargerNodes(ListNode head) {
        if(head==null) return null;
        ListNode temp=head,travel=head;
        int count=0,i=0;
        while(temp!=null){
           count++;
           temp=temp.next;
        }
        int[] arr=new int[count];
        temp=head;
        while(temp!=null){
            travel=temp;
            while(travel!=null){
                if(travel.val>temp.val){
                    arr[i]=travel.val;
                    break;
                }
                else travel=travel.next;
            }
            if(travel==null) arr[i]=0;
            i++;
            temp=temp.next;
        }
        return arr;
    }
}
