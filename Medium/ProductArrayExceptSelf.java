class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums.length == 0 || nums == null){
            return nums;
        }
        
        int left = 1;
        
        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            result[i] = left;
            left *= nums[i];
        }
        
        int right = 1;
        for(int i = nums.length-1; i >= 0 ; i--){
            result[i] *= right;
            right *= nums[i];
        }
        return result;
    }
}