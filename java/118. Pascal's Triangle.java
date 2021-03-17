// https://leetcode-cn.com/problems/pascals-triangle/submissions/
class Solution {
    public List<List<Integer>> generate(int numRows) {
        if (numRows <= 0) return null;
        List<List<Integer>> res = new ArrayList();
        List<Integer> firstrow = new ArrayList();
        firstrow.add(1);
        res.add(firstrow);
        for (int i = 1; i < numRows; i++) {
            List<Integer> row = new ArrayList();
            int j = 0;
            row.add(1);
            for (j = 1; j < i; j++) {
                row.add(res.get(i - 1).get(j - 1) + res.get(i - 1).get(j));
            }
            if (j < i + 1)
                row.add(1);
            res.add(row);
        }
        return res;
    }
}
