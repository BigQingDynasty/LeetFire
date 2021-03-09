// https://leetcode-cn.com/problems/remove-all-adjacent-duplicates-in-string/
class Solution {
    public String removeDuplicates(String S) {
        if (S.length() <= 1) return S;
        LinkedList<Character> stack = new LinkedList<>();
        int i = 0;
        Character c = S.charAt(i);
        stack.push(c);
        i++;
        while (i < S.length()) {
            c = S.charAt(i);
            Character top = stack.peek();
            if (top == c) {
                stack.pop();
            } else {
                stack.push(c);
            }
            i++;
        }
        StringBuilder sb = new StringBuilder();
        for (int j = stack.size()-1; j >= 0; j--) {
            sb.append(stack.get(j));
        }
        return sb.toString();
    }
}
