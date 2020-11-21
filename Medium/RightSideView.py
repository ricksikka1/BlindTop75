# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def rightSideView(self, root: TreeNode) -> List[int]:
        if not root:
            return []
        
        result = []
        q = []
        q.append(root)
        
        while q:
            size = len(q)
            for i in range(size):
                tmp = q.pop(0)
                if tmp.left:
                    q.append(tmp.left)
                if tmp.right:
                    q.append(tmp.right)
                if i is size-1:
                    result.append(tmp.val)
                    
        return result
            
        