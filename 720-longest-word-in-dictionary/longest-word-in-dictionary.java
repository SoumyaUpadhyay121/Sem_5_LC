class Solution {
    public String longestWord(String[] words) {
        Arrays.sort(words, (a, b) -> {
            if (a.length() == b.length())
            {
                return a.compareTo(b);
            }  
            return a.length() - b.length();
        });

        HashSet<String> set = new HashSet<>();
        set.add("");

        String res = "";

        for (String word : words) {
            String p = word.substring(0, word.length() - 1);

            if (set.contains(p)) {
                set.add(word);
                if (word.length() > res.length())
                    res = word;
            }
        }

        return res;
    }
}