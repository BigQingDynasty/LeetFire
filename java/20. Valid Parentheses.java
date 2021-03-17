// https://leetcode-cn.com/problems/valid-parentheses/submissions/
class Solution {
    public boolean isValid(String s) {
        if (s == null || s.length() <=1) return false;
        Deque q = new LinkedList<Character>();
        int i = 0;
        while (i < s.length()) {
            char c = s.charAt(i);
            switch(c) {
                case '(':
                case '[':
                case '{':
                q.push(c);break;
                case ')':{
                    Character top = (Character)q.poll();
                    if (top ==null || top !='(')
                        return false;
                }
                break;
                case ']':{
                    Character top = (Character)q.poll();
                    if (top ==null || top !='[')
                        return false;
                }
                break;
                case '}':{
                    Character top = (Character)q.poll();
                    if (top ==null || top !='{')
                        return false;
                }
                break;
            }
            i++;
        }
        return q.isEmpty();
    }
}
