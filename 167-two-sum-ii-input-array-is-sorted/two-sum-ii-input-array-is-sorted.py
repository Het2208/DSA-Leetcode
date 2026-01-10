class Solution(object):
    def twoSum(self, nums, target):
        left = 0
        right = len(nums) - 1
        while left < right:
            Sum = nums[left] + nums[right]
            if Sum == target:
                return [left+1 , right+1]
            elif Sum < target:
                left += 1
            else :
                right -= 1