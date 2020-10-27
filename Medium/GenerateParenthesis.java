class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> results = new ArrayList<>();
        backtrack(results, "", n, 0, 0);
        return results;
    }
    
    public void backtrack(List<String> results, String curr, int n, int open, int close){
        if (curr.length() == 2*n){
            results.add(curr);
        }
        
        if(open < n){
            backtrack(results, curr + '(', n, open+1, close);
        }
        if(close < open){
            backtrack(results, curr + ')', n, open, close+1);
        }
    }
}