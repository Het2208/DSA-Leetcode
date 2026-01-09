class Solution(object):
    def isPalindrome(self, s):
        l = 0
        r = len(s) - 1
        s = s.lower()

        while l < r:
            while l < r and not self.AlphaNum(s[l]):
                l += 1
            while r > l and not self.AlphaNum(s[r]):
                r -= 1

            if s[l] != s[r]:
                return False

            l += 1
            r -= 1
        
        return True

    def AlphaNum(self, c):
        return ('a' <= c <= 'z') or ('0' <= c <= '9')
