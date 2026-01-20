class Solution(object):
    def findMissingElements(self, nums):
        Min = nums[0]
        Max = nums[0]
        for i in nums:
            if i < Min:
                Min = i
            if i > Max:
                Max = i
        res = []
        for i in range(Min,Max,1):
            if i + 1 not in nums:
                res.append(i+1)
            i += 1
        return res