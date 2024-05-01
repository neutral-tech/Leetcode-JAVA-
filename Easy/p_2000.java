class Solution {
    public String reversePrefix(String word, char ch) {
        int a=word.indexOf(ch);
        if(a==-1) return word;
        String temp="";
        int i=a;
        while(a>=0){
            temp=temp+word.charAt(a);
            a--;
        }
        temp=temp+word.substring(i+1);
        return temp;
    }
}
