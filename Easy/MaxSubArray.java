class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        if(nums.length == 1){
            return nums[0];
        }
        
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int max = dp[0];
        
        for(int i = 1; i < nums.length; i++){
            dp[i] = nums[i];
            if(dp[i-1] > 0){
                dp[i] += dp[i-1];
            }
            max = Math.max(max, dp[i]);
        }
        
        return max;
    }
}