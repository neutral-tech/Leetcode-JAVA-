class Solution {
    public boolean isValid(String s) {
       char[] stack=new char[s.length()];
       int top=-1,i=0;
       for(i=0;i<s.length();i++){
           if(top==-1){
               top++;
               stack[top]=s.charAt(i);
           }
           else{
               if(stack[top]=='('&& s.charAt(i)==')'){
                   top--;
               }
               else if(stack[top]=='{'&& s.charAt(i)=='}'){
                   top--;
               }
               else if(stack[top]=='['&& s.charAt(i)==']'){
                   top--;
               }
               else{
                   top++;
                   stack[top]=s.charAt(i);
               }
           }
       } 
       if(top==-1) return true;
       else return false;
    }
}

