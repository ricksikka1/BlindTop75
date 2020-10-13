class Solution {
    public int rob(int[] nums) {
        return Math.max(helper(nums, 0, nums.length-2), helper(nums, 1, nums.length-1));
    }
    
    public int helper(int[] nums, int start, int end){
        int[] dp = new int[nums.length];
        if(nums.length < 1){
            return 0;
        }
        if(nums.length == 1){
            return nums[0];
        }else if(nums.length == 2){
            return Math.max(nums[0], nums[1]);
        }
        dp[start] = nums[start];
        dp[start+1] = Math.max(nums[start], nums[start+1]);
        for(int i = start+2; i < end; i++){
            dp[i] = Math.max(dp[i-2] + nums[i], dp[i-1]);
        }
        
        return dp[nums.length-1];
    }
}