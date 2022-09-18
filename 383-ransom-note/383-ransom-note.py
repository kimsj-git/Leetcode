class Solution:
    def canConstruct(self, ransomNote: str, magazine: str) -> bool:
        magazine_chars = list(magazine)
        for char in ransomNote:
            if char in magazine_chars:
                magazine_chars.remove(char)
            else:
                return False
        return True