class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int n = nums.length;
        int[] freq = new int[n]; 
        int[] ans = new int[2];
        int k = 0;

        for (int num : nums) {
            freq[num]++;
        }
        for (int i = 0; i < n; i++) {
            if (freq[i] == 2) {
                ans[k++] = i;
            }
        }

        return ans;

    }
}