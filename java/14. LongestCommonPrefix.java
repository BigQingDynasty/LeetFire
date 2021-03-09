// https://leetcode-cn.com/problems/longest-common-prefix/submissions/
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length <=0 ) return "";
        String str0 = strs[0];
        for (int i=1; i <strs.length; i++) {
            String str1 = strs[i];
            str0 = getPrefix(str0, str1);
        }
        if (str0 == null) return "";
        return str0;
    }
    String getPrefix(String str0, String str1) {
        int min = Math.min(str0.length(), str1.length());
        int i = 0;
        while (i < min) {
            if (str0.charAt(i) != str1.charAt(i)) {
                break;
            }
            i++;
        }
        return str0.substring(0, i);
    }
}
