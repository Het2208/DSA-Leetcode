class Solution(object):
    def evalRPN(self, tokens):
        stack = []
        for i in tokens:
            if i == "+":
                stack.append(stack.pop() + stack.pop())
            elif i == "-":
                b = stack.pop()
                a = stack.pop()
                stack.append(a - b)
            elif i == "*":
                stack.append(stack.pop() * stack.pop())
            elif i == "/":
                b = stack.pop()
                a = stack.pop()
                stack.append(int(float(a) / b))
            else:
                stack.append(int(i))
        return stack.pop()
