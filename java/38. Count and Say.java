// https://leetcode-cn.com/problems/count-and-say/submissions/
class Solution {
    public String countAndSay(int n) {
        if (n == 1) return String.valueOf(1);
        if (n == 2) return String.valueOf(11);
        String last = countAndSay(n - 1);
        int j = 1;
        int k = 1;
        StringBuilder sb = new StringBuilder();
        while (j < last.length()) {
            int a = last.charAt(j - 1) - '0';
            int b = last.charAt(j) - '0';
            if (a != b) {
                sb.append(k).append(a);
                j++;
                k = 1;
            } else {
                j++;
                k++;
            }
        }
        int a = last.charAt(j - 1) - '0';
        sb.append(k).append(a);
        return sb.toString();
    }
}
