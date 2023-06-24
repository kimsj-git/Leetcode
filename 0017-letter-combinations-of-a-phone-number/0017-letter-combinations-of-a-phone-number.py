class Solution:
    def letterCombinations(self, digits: str) -> List[str]:
        def dfs(index, letters):
            if len(letters) == len(digits):
                result.append(letters)
                return
            
            for i in range(index, len(digits)):
                for j in digits_to_letters[digits[i]]:
                    dfs(i + 1, letters + j)


        digits_to_letters = {
            "2": "abc",
            "3": "def",
            "4": "ghi",
            "5": "jkl",
            "6": "mno",
            "7": "pqrs",
            "8": "tuv",
            "9": "wxyz",
        }

        if not digits:
            return []
        
        result = []
        dfs(0, "")
        return result