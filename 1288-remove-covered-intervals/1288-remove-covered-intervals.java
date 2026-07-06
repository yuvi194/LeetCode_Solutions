class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        int covered =0;
        Arrays.sort(intervals, (a, b) -> {
            if (a[0] == b[0]) {
                return b[1] - a[1];
            }
            return a[0] - b[0];
        });
        for(int i=0;i<intervals.length;i++){
            for(int j=0;j<i;j++){
                if (intervals[j][0] <= intervals[i][0] && intervals[i][1] <= intervals[j][1]) {
                    covered++;
                    break;
                }
            }
        }
        return intervals.length - covered;
    }
}