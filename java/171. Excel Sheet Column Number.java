// https://leetcode-cn.com/problems/excel-sheet-column-number/
class Solution {
    public int titleToNumber(String columnTitle) {
        if (columnTitle == null || columnTitle.equals("")) return -1;
        int res = 0;
        for (int i = 0; i < columnTitle.length() ; i++) {
            char c = columnTitle.charAt(i);
            int t = c - 'A' + 1;
            res = res * 26 + t;
        }
        return res;
    }
}
