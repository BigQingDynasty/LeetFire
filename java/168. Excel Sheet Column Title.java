// https://leetcode-cn.com/problems/excel-sheet-column-title/submissions/
class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while(columnNumber != 0){
            int mod = (--columnNumber) % 26;
            sb.append((char)('A' + mod));
            columnNumber /= 26;
        }
        return sb.reverse().toString();
    }
}
