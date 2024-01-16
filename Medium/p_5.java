class Solution {
    int first=-1,last=-1,max=-1;
    public String longestPalindrome(String s) {
        if(s.length()==0||s.length()==1) return s;
        int i=0;
        for(i=0;i<s.length();i++){
            check(i,i,s);
            check(i-1,i,s);
        }
        return s.substring(first,last);
    }

    public void check(int i,int j,String s){
        while(i>=0&&j<s.length()){
            if(s.charAt(i)!=s.charAt(j)){
                break;
            }
            if((j-i+1)>max){
                first=i;
                last=j+1;
                max=last-first;
            }
            i--;
            j++;
        }
        return;
    }
}
