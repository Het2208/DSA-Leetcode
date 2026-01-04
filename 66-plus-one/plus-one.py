class Solution(object):
    def plusOne(self, nums):
        nums = nums[::-1]
        one = 1
        i = 0
        
        while one==1:
            if i < len(nums):
                if nums[i] == 9:
                    nums[i] = 0
                else:
                    nums[i] += 1
                    one = 0
            else:
                nums.append(1)
                one = 0
            i += 1

        return nums[::-1]
                