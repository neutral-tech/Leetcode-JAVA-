class Solution {
    public int romanToInt(String s) {
       int top = -1, i = 0, num = 0;
        for (i = s.length() - 1; i >= 0; i--) {
            if (i != s.length() - 1) {
                if (num > findValue(s.charAt(i))) {
                    if(s.charAt(i)==s.charAt(i+1)) num = findValue(s.charAt(i)) + num;
                    else num = num - findValue(s.charAt(i));
                } else {
                    num = findValue(s.charAt(i)) + num;
                }
            } else {
                num = findValue(s.charAt(i));
            }
        }
        return num; 
    }
    public int findValue(char a) {
        int j = 0;
        char[] symbol = {'M', 'D', 'C', 'L', 'X', 'V', 'I'};
        int[] value = {1000, 500, 100, 50, 10, 5, 1};
        for (j = 0; j < 7; j++) {
            if (symbol[j] == a) {
                break;
            }
        }
        return value[j];
    }
}

