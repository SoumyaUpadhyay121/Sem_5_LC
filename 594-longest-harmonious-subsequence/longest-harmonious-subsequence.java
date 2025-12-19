class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);

        int i = 0;
        int j = 0;
        int maxLen = 0;

        while (j < nums.length) {
            int diff = nums[j] - nums[i];

            if (diff == 1) {
                maxLen = Math.max(maxLen, j - i + 1);
                j++;
            } 
            else if (diff < 1) {
                j++;
            } 
            else {
                i++;
            }
        }

        return maxLen;
    }
}