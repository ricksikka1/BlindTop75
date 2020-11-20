class Solution:
    def generateParenthesis(self, n: int) -> List[str]:
        if n is 0:
            return []
        
        result = []
        curr = ""
        self.backtrack(result, n, curr, 0, 0)
        return result
    
    def backtrack(self, result, n, curr, op, cl):
        if len(curr) is 2*n:
            result.append(curr)
        
        if op < n:
            self.backtrack(result, n, curr + "(", op+1, cl)
        if cl < op:
            self.backtrack(result, n, curr + ")", op, cl+1)
        