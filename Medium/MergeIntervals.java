class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length == 0){
            return intervals;
        }
        List<int[]> res = new ArrayList<>();
        Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0], i2[0]));
        int[] newInterval = intervals[0];
        res.add(newInterval);
        for(int[] arr : intervals){
            if(newInterval[1] >= arr[0]){
                newInterval[1] = Math.max(newInterval[1], arr[1]);
            }else{
                newInterval = arr;
                res.add(newInterval);
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}