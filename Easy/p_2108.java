class Solution {
    public String firstPalindrome(String[] words) {
        int i=0;
        for(i=0;i<words.length;i++){
            if(check(words[i])) return words[i];
        }
        return "";
    }
    private boolean check(String s){
        if(s.length()==0||s.length()==1) return true;
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
