class Solution {
    public boolean isLongPressedName(String name, String typed) {
         int i = 0, j = 0;

        while (i < name.length() && j < typed.length()) {
            if (name.charAt(i) != typed.charAt(j)) {
                return false;
            }

            char ch = name.charAt(i);

            int c_Name = 0;
            int c_Typed = 0;

            while (i < name.length() && name.charAt(i) == ch) {
                i++;
                c_Name++;
            }

            while (j < typed.length() && typed.charAt(j) == ch) {
                j++;
                c_Typed++;
            }

            if (c_Typed < c_Name) {
                return false;
            }
        }
        return i == name.length() && j == typed.length();
    }
}