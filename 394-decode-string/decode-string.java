class Solution {
    public String decodeString(String s) {
        Stack<String> strStack = new Stack<>();
        Stack<Integer> numStack = new Stack<>();
        String curr = "";
        int num = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            } else if (ch == '[') {
                numStack.push(num);
                strStack.push(curr);
                num = 0;
                curr = "";
            } else if (ch == ']') {
                StringBuilder temp = new StringBuilder(strStack.pop());
                int repeat = numStack.pop();
                for (int i = 0; i < repeat; i++) {
                    temp.append(curr);
                }
                curr = temp.toString();
            } else {
                curr += ch;
            }
        }

        return curr;
    }
}