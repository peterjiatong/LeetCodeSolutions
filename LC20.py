class Solution(object):
    def isValid(self, s):
        #CC
        if len(s) % 2 != 0: return False

        dict = {'(': ')','[': ']','{': '}'}
        stack = []

        for i in range(len(s)):
            if s[i] in dict:
                stack.append(dict.get(s[i]))
            else:
                if not stack: return False
                if s[i] != stack.pop(): return False

        return stack == []
    