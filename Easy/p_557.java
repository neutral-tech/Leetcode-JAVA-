class Solution {
    public String reverseWords(String s) {
       String temp = "";
        int top = -1, i = 0;
        char[] stack = new char[s.length()];
        while (i < s.length()) {
            if (s.charAt(i) != ' ') {
                top++;
                stack[top] = s.charAt(i);
            } else if (s.charAt(i) == ' ') {
                while (top != -1) {
                    temp = temp + stack[top];
                    top--;
                }
                temp = temp + " ";
            }
            i++;
        }
        while (top != -1) {
            temp = temp + stack[top];
            top--;
        }
        return temp;
    }
}

