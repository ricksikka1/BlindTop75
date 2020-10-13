class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<List<Integer>> list = new ArrayList<>();
        
        int i = 0; 
        int n = intervals.length;
        int index = 0;
        
        
        while(i < n){
            if(newInterval[0] > intervals[i][1]){
                list.add(intervals[i]);
                index++;
            }else if(intervals[i][0] > newInterval[1] ){
                list.add(intervals[i]);
            }else{
                newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
                newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            }
            i++;
        }
        list.add(index, newInterval);
        return list;
        
    }
}