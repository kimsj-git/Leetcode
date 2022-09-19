class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        dict = {}       # key: char in s, value: char in t
        t_values = []   # store already used chars in str t
        
        for i, char_s in enumerate(s):
            char_t = dict.get(char_s)
            if char_t:
                if char_t != t[i]:
                    return False
            else:
                if t[i] in t_values:
                    return False
                else:
                    dict[char_s]= t[i]
                    t_values.append(t[i])

        return True
                