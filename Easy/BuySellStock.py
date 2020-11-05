class Solution:
    def maxProfit(self, prices: List[int]) -> int:

        if len(prices) == 0:
            return 0
        result = 0
        minPrice = prices[0]
        for i in range(1, len(prices)):
            temp = prices[i]
            minPrice = min(minPrice, temp)
            if(temp > minPrice):
                result = max(result, temp-minPrice)
        
        return result