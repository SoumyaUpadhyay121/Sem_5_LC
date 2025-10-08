class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int n=capacity.length;
        int []need=new int[n];
        int count=0;

        for(int i=0;i<n;i++){
            need[i]=capacity[i]-rocks[i];
        }

        Arrays.sort(need);

        for(int i=0;i<n && additionalRocks>=need[i];i++){
            additionalRocks-=need[i];
            count++;
        } 

        return count;
    }
}