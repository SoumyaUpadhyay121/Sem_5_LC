class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int ans=0;
        while(l<r){
            int width=r-l;
            int ht=Math.min(height[l],height[r]);
            int contain=width*ht;
            ans=Math.max(ans,contain);
            if(height[l]<height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return ans;
    }
}