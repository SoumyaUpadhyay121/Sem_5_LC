class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] count = new int[n + 1]; // using 1-based index

        for (int[] t : trust) {
            int a = t[0]; // truster
            int b = t[1]; // trusted
            count[a]--;   // a trusts someone -> lose 1 point
            count[b]++;   // b is trusted -> gain 1 point
        }

        for (int i = 1; i <= n; i++) {
            if (count[i] == n - 1) return i; // everyone trusts i, i trusts nobody
        }

        return -1;
    }
}
