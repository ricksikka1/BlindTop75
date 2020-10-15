class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length == 0){
            return true;
        }
        
        int lastIndex = nums.length-1;
        for(int i = nums.length-1; i >= 0; i--){
            if(nums[i] + i >= lastIndex){
                lastIndex = i;
            }
        }
        
        return lastIndex == 0;
    }
}