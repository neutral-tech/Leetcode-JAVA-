class Solution {
    List<String> abc;
    public List<String> generateParenthesis(int n) {
        if(n==0) return null;
        abc=new ArrayList<String>();
        combination("(",n-1,n);
        combination(")",n,n-1);
        return abc;
    }
    private void combination(String str,int open,int close){
        if(open==0&&close==0){
            if(isValid(str)) abc.add(str);
            return;
        }
        else if(open==0){
            str=str+')';
            combination(str,open,close-1);
        }
        else if(close==0){
            str=str+'(';
            combination(str,open-1,close);
        }
        else{
            combination(str+'(',open-1,close);
            combination(str+')',open,close-1);
        }
    }
    private boolean isValid(String str){
        int top=-1,i=0;
        char[] stack=new char[str.length()];
        while(i<str.length()){
            if(top==-1){
                top++;
                stack[top]=str.charAt(i);
            }
            else if(str.charAt(i)==')'&&stack[top]=='(') top--;
            else{
                top++;
                stack[top]=str.charAt(i);
            }
            i++;
        }
        if(top==-1) return true;
        return false;
    }
}
