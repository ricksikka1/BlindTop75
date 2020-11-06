class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        
        nums.sort()
        ans = set()
        if len(nums) < 3:
            return None
        
        for i in range(len(nums)-2):
            if i != 0 and nums[i] == nums[i-1]:
                continue
                
            j = i+1
            k = len(nums)-1
        
            while j < k:
                first = nums[i]
                second = nums[j]
                third = nums[k]
                
                if first + second + third == 0:
                    ans.add((first, second, third))
                    k-=1
                    j+=1
                elif first + second + third > 0:
                    k -= 1
                else:
                    j += 1 
            
        return ans
            
        