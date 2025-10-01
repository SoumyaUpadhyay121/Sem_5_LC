class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total=0;
        for(int i=0;i<cost.length;i++){
            total+=gas[i]-cost[i];
        }
        if(total<0) return -1;

        int idx=0;
        int tank=0;
        for(int i=0;i<cost.length;i++){
            tank+=gas[i]-cost[i];
            if(tank<0){
                idx=i+1;
                tank=0;
            }
        }
        return idx;
    }
}