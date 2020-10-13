class Solution {
    public int[] twoSum(int[] nums, int target) {
        if(nums.length == 0 || nums == null){
            return null;
        }
        int[] result = new int[2];
        
        HashMap<Integer, Integer> map = new HashMap();
        for(int i = 0; i < nums.length; i++){
            int diff = target - nums[i];
            if(map.containsKey(diff)){
                result[0] = map.get(diff);
                result[1] = i;
            }
            map.put(nums[i], i);
        }
        
        return result;
    }
}