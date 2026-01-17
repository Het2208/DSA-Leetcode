class Solution(object):
    def trap(self, height):
        left = 0
        right = len(height) - 1
        maxLeft = height[left]
        maxRight = height[right]
        res = 0
        while left < right:
            if maxLeft < maxRight:
                left += 1
                maxLeft = max(maxLeft , height[left])
                res += maxLeft - height[left]
            else:
                right -= 1
                maxRight = max(maxRight , height[right])
                res += maxRight - height[right]

        return res