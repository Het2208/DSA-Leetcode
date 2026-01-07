class Solution(object):
    def isValid(self, s):
        stack = []
        for i in s:
            if i == "(":
                stack.append(")")
            elif i == "[":
                stack.append("]")
            elif i == "{":
                stack.append("}")
            else:
                if not stack or stack.pop() != i:
                    return False
        
        return not stack
