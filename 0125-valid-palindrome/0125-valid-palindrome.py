class Solution:
    def isPalindrome(self, s: str) -> bool:
        new_s = ''
        for char in s:
            if char.isalpha():
                new_s += char.lower()
            elif char.isnumeric():
                new_s += char

        answer = True
        n = len(new_s)
        for i in range(n // 2):
            if new_s[i] != new_s[n - 1 - i]:
                answer = False
                break
        return answer