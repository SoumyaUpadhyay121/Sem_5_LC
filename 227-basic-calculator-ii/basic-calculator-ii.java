class Solution {
    public int calculate(String s) {
        int result = 0, lastNum = 0, num = 0;
        char sign = '+';
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
            }
            if ((!Character.isDigit(c) && c != ' ') || i == s.length() - 1) {
                if (sign == '+') {
                    result += lastNum;
                    lastNum = num;
                } else if (sign == '-') {
                    result += lastNum;
                    lastNum = -num;
                } else if (sign == '*') {
                    lastNum = lastNum * num;
                } else if (sign == '/') {
                    lastNum = lastNum / num;
                }
                sign = c;
                num = 0;
            }
        }
        result += lastNum;
        return result;
    }
}
