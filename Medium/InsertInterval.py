class Solution:
    def insert(self, intervals: List[List[int]], newInterval: List[int]) -> List[List[int]]:
        if not intervals:
            return [newInterval]
        result = []
        n = len(intervals)
        i = 0
        index = 0
        
        while i < n:
            if newInterval[0] > intervals[i][1]:
                result.append(intervals[i])
                index += 1
            elif newInterval[1] < intervals[i][0]:
                result.append(intervals[i])
            else:
                newInterval[0] = min(newInterval[0], intervals[i][0])
                newInterval[1] = max(newInterval[1], intervals[i][1])
            i += 1 
        result.insert(index, newInterval)
        return result
                    