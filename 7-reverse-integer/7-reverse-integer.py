class Solution:
    def reverse(self, x: int) -> int:
        str_x = str(x)
        if str_x[0] == '-':
            reverse = -int(str_x[1:][::-1])
            if reverse < -2**31:
                return 0
            else:
                return reverse
        else:
            reverse = int(str_x[::-1])
            if reverse > 2**31:
                return 0
            else:
                return int(str_x[::-1])