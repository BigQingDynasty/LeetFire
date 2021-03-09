// https://leetcode-cn.com/problems/roman-to-integer/
class Solution {
    public int romanToInt(String s) {
        int res = 0;
        int i = 0;
        while(i < s.length()) {
            char c = s.charAt(i);
            char next = 0;
            if ((i + 1) < s.length()) {
                next = s.charAt(i+1);
            }
            switch(c) {
                case 'I': {
                    if (next == 'V') {
                        res += 4;i++;break;
                    }
                    if (next == 'X') {
                        res += 9;i++;break;
                    }
                    res += 1; break;
                }
                case 'V': res += 5; break;
                case 'X': {
                    if (next == 'L') {
                        res += 40;i++;break;
                    }
                    if (next == 'C') {
                        res += 90;i++;break;
                    }
                    res += 10; break; 
                }
                case 'L': res += 50; break;
                case 'C': {
                    if (next == 'D') {
                        res += 400;i++;break;
                    }
                    if (next == 'M') {
                        res += 900;i++;break;
                    }
                    res += 100; break;
                }
                case 'D': res += 500; break;
                case 'M': res += 1000; break;
            }
            i++;
        }
        return res;
    }
}
