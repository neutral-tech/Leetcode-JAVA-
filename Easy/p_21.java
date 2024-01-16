class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
       if(list1==null) return list2;
       else if (list2==null) return list1;
       ListNode list=list1,head=list1;
       
       if(list2.val<list1.val){
           list=list2;
           head=list;
           list2=list2.next;
       } 
       else{
          list=list1;
          head=list;
           list1=list1.next;
       }
       while(list1!=null&&list2!=null){
            if(list1.val<list2.val){
                list.next=list1;
                list=list.next;
                list1=list1.next;
            }
            else{
                list.next=list2;
                list=list.next;
                list2=list2.next;
            }
       }
       if(list2==null) list.next=list1;
       else if(list1==null) list.next=list2;
       return head;
    }
}
