class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        hm = {}
        result = []
        for i,x in enumerate(nums):
            compl = target - x
            if compl in hm.keys():
                result.append(i)
                result.append(hm[compl])
                return result
            hm[x] = i
        return result
            
        