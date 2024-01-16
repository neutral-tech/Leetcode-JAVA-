class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        temp=head;
        int i=0,j=count-1;
        int[] arr=new int[count];
        while(temp!=null){
            arr[i]=temp.val;
            temp=temp.next;
            i++;
        }
        i=0;
        while(i<j){
            if(arr[i]!=arr[j]) break;
            i++;
            j--;
        }
        if(i>=j) return true;
        return false;
    }
}
