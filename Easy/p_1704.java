class Solution {
    public boolean halvesAreAlike(String s) {
        if(s.length()%2==1) return false;
        int mid=s.length()/2;
        int a=count(s.substring(0,mid));
        int b=count(s.substring(mid));
        if(a==b) return true;
        return false;
    }
    private int count(String str){
        int i=0,a=0;
        char ch='a';
        while(i<str.length()){
            ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            a++;
            i++;
        }
        return a;
    }
}
