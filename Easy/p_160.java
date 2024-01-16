public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp=headA;
        int count1=0,count2=0,i=1;
        while(temp!=null){
            count1++;
            temp=temp.next;
        }
        temp=headB;
        while(temp!=null){
            count2++;
            temp=temp.next;
        }
        if(count1>count2){
              while(i<=(count1-count2)){
                  headA=headA.next;
                  i++;
              }
        }
        else{
            i=1;
            while(i<=(count2-count1)){
                headB=headB.next;
                i++;
            }
        }
        while(headA!=null&&headB!=null){
            if(headA==headB) return headA;
            headA=headA.next;
            headB=headB.next;
        }
        return null;
    }
	    
}

