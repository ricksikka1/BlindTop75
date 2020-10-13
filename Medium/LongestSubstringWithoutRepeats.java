class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<Character>();
        if(s == null || s.isEmpty()){
            return 0;
        }
        set.add(s.charAt(0));
        int max = Integer.MIN_VALUE;
        int i = 0;
        int j = 1;
        
        while(j < s.length()){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
            }else{
                max = Math.max(max, j-i);
                i = j;
                set.clear();
            }           
        }
        
        if(max != Integer.MIN_VALUE){
            return max;
        }else{
            return 0;
        }
    }
}