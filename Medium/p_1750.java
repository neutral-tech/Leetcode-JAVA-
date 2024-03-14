class Solution {
    public int minimumLength(String s) {
        int i=0,j=s.length()-1;
        char a,b;
        while(i<j){
            a=s.charAt(i);
            b=s.charAt(j);
            if(a!=b) break;
            else{
                while(i<s.length() && s.charAt(i)==a) i++;
                while(j>=0 && s.charAt(j)==b) j--;
            }
        }
        if(i>j) return 0;
        return (j-i+1);
    }
}
