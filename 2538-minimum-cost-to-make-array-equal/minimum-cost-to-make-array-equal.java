class Solution {
    public long minCost(int[] nums, int[] cost) {
        int n = nums.length;
        int left = Integer.MAX_VALUE;
        int right = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            left = Math.min(left, nums[i]);
            right = Math.max(right, nums[i]);
        }
        long ans = 0;
        while (left < right) {
            int mid = (left + right) / 2;
            long cost1 = totalCost(nums, cost, mid);
            long cost2 = totalCost(nums, cost, mid + 1);
            
            ans = Math.min(cost1, cost2);
            
            // move toward smaller cost side
            if (cost1 < cost2) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }

    private long totalCost(int[] nums, int[] cost, int target) {
        long total = 0;
        for (int i = 0; i < nums.length; i++) {
            total += (long) Math.abs(nums[i] - target) * cost[i];
        }
        return total;
    }
}