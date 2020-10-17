class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        
        backtrack(candidates, target, new ArrayList<>(), result, 0);
        
        return result;
    }
    
    public void backtrack(int[] candidates, int target, List<Integer> current, List<List<Integer>> result, int index){
        if(target < 0){
            return;
        }
        else if(target == 0){
            result.add(new ArrayList<Integer>(current));
            return;
        }
        else{
            for(int i = index; i < candidates.length; i++){
            current.add(candidates[i]);
            backtrack(candidates, target-candidates[i], current, result, i);
            current.remove(current.size()-1);
            }
        }
        
        
    }
}