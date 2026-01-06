class Solution(object):
    def isHappy(self, n):
        seen = set()
        while(True):
            sum = 0
            while(n != 0):
                sum += pow(n % 10 , 2)
                n /= 10
            
            if sum == 1 : return True

            n = sum

            if sum in seen:
                return False
            seen.add(sum)


            

        