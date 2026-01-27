class Solution:
    def largestRectangleArea(self, heights):
        maxArea = 0
        stack = []  # (start_index, height)

        for i, h in enumerate(heights):
            start = i
            while stack and stack[-1][1] > h:
                index, height = stack.pop()
                maxArea = max(maxArea, height * (i - index))
                start = index
            stack.append((start, h))

        # Calculate area for remaining bars in stack
        n = len(heights)
        for i, h in stack:
            maxArea = max(maxArea, h * (n - i))

        return maxArea