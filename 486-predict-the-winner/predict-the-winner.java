class Solution {
    public boolean predictTheWinner(int[] nums) {
        int n=nums.length;
        Integer [][]dp=new Integer[n][n];
        return help(nums,0,n-1,dp)>=0;
    }

    public static int help(int[] nums,int s,int e,Integer [][]dp){
        if(s==e) return nums[s];

        if(dp[s][e] !=null) return dp[s][e];

        int start=nums[s]-help(nums,s+1,e,dp);
        int end=nums[e]-help(nums,s,e-1,dp);

        return dp[s][e]=Math.max(start,end);
    }
}