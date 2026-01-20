class Solution(object):
    def longestConsecutive(self, nums):
        numSet = set(nums)
        sequence = 0

        for i in numSet:               # iterate set, not nums
            if i - 1 not in numSet:    # start of sequence
                length = 1
                x = i
                while x + 1 in numSet:
                    x += 1
                    length += 1
                sequence = max(sequence, length)

        return sequence
