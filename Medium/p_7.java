class Solution {
    public int reverse(int x) {
        int flag=0,rev=0,digit=0,previous=0;
        if(x<0){
            x=-x;
            flag=1;
        }
        while(x>0){
            digit=x%10;
            rev=rev*10+digit;
            if((rev/10)!=previous) return 0;
            previous=rev;
            x=x/10;
        }
        if(flag==0) return rev;
        return -rev;
    }
}
