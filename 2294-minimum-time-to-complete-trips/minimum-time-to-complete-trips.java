class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        long left = 1;
        long right = (long) Arrays.stream(time).min().getAsInt() * totalTrips;
        long ans = right;

        while (left <= right) {
            long mid = left + (right - left) / 2;

            if (canComplete(time, totalTrips, mid)) {
                ans = mid;
                right = mid - 1;  // try smaller time
            } else {
                left = mid + 1;   // need more time
            }
        }

        return ans;
    }

    private boolean canComplete(int[] time, int totalTrips, long givenTime) {
        long trips = 0;
        for (int t : time) {
            trips += givenTime / t;
            if (trips >= totalTrips) return true; // early exit
        }
        return false;
    }
}
