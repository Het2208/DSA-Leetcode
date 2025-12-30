class Solution(object):
    def intersection(self, nums1, nums2):
        seen = set(nums1)
        result = []
        for num in nums2:
            if num in seen: 
                result.append(num)
                seen.remove(num)

        return result
        