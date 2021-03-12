// https://leetcode-cn.com/problems/length-of-last-word/submissions/
class Solution {
    public int lengthOfLastWord(String s) {
        int res = 0;
        int i = s.length() - 1;
        while (i >= 0 && s.charAt(i) == ' ')i--;
        while (i >= 0) {
            if (s.charAt(i) != ' ') {
                res++;
                i--;
            } else {
                break;
            }
        }
        return res;
    }
}
