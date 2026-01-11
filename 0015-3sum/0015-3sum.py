class Solution(object):
    def threeSum(self, nums):
        res = []
        nums.sort()

        for i,a in enumerate(nums):
            if i > 0 and a == nums[i - 1]:
                continue
            left = i+1
            right = len(nums) - 1
            while left < right:
                ThreeSum = a + nums[left] + nums[right]
                if ThreeSum > 0:
                    right -= 1
                elif ThreeSum < 0:
                    left += 1
                else:
                    res.append([a , nums[left] , nums[right]])
                    left += 1
                    right -= 1
                    while left < right and nums[left] == nums[left-1]:
                        left += 1

        return res