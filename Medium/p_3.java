class Solution {
    public int lengthOfLongestSubstring(String s) {
     if (s.isEmpty() || s.length() == 1) return s.length();
        int i, answer = 1, initial = 0, check, flag = 0, count = 1, a = 0;
        for (i = 1; i < s.length(); i++) {
            for (check = i - 1; check >= initial; check--) {
                a++;
                if (s.charAt(i) == s.charAt(check)) {
                    flag = 1;
                    initial = check + 1;
                    break;
                }
            }
            if (flag == 0) {
                count++;
                a = 0;
                if (count > answer) answer = count;
            } else {
                count = a;
                a = 0;
                flag = 0;
                if (count > answer) answer = count;
            }

        }
        return answer;
    }   
    
}
