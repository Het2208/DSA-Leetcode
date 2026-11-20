class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int n = intervals.length;

        int[][] meetings = new int[n][3];

        for (int i = 0; i < n; i++) {
            meetings[i][0] = intervals[i][0];
            meetings[i][1] = intervals[i][1];
            meetings[i][2] = i + 1;
        }

        Arrays.sort(meetings, (a, b) -> {
            if (a[1] != b[1]) {
                return Integer.compare(a[1], b[1]);
            }
            return Integer.compare(a[2], b[2]);
        });

        int count = 1;
        int limit = meetings[0][1];

        for (int i = 1; i < n; i++) {

            if (meetings[i][0] >= limit) {
                count++;
                limit = meetings[i][1];
            }
        }
        return n - count;
    }
}