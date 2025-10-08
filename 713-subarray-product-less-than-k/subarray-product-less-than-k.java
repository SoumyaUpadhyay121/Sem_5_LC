class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int product=1;
        int left=0;
        int ans=0;
        for(int right=0;right<nums.length;right++){
            product*=nums[right];

            while(product>=k && left<=right){
                product/=nums[left];
                left++;
            }
            ans=ans+(right-left+1);
        }

        return ans;
    }
}