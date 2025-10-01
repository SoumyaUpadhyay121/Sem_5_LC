class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;//different length so no anagram

        int count[]=new int[26];

        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;//increment that character which is in s
            count[t.charAt(i)-'a']--;//decrement that character if present in t
        }

        for(int c:count){//if not 0 means count is not equal
            if(c!=0) return false;
        }

        return true;
    }
}