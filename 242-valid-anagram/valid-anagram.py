class Solution(object):
    def isAnagram(self, s, t):
        if len(s) != len(t) : 
            return False
        CountS , CountT = {} , {}

        for i in range(len(s)):
            CountS[s[i]] = 1 + CountS.get(s[i],0)
            CountT[t[i]] = 1 + CountT.get(t[i],0)
        for c in CountS:
            if CountS[c] != CountT.get(c,0):
                return False
        return True
