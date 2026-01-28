class Solution(object):
    def findMin(self, nums):
        Min = nums[0]
        for i in nums:
            if i < Min:
                Min = i
        return Min
        