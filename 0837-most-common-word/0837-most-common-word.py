class Solution:
    def getSplit(self, paragraph: str):
        result = []
        temp_str = ''
        for char in paragraph.lower():
            if char not in "!?',;. ":
                temp_str += char
            else:
                if len(temp_str) > 0:
                    result.append(temp_str)
                    temp_str = ''
        if len(temp_str) > 0:
            result.append(temp_str)
        return result
    
    
    def mostCommonWord(self, paragraph: str, banned: List[str]) -> str:
        # words = [word.strip("!?',;.").lower() for word in paragraph.split()]
        words = self.getSplit(paragraph)
        words_cnt = {word: 0 for word in words}
        for word in words:
            if word not in banned:
                words_cnt[word] += 1
        
        answer = [k for k, v in words_cnt.items() if words_cnt[k] == max(words_cnt.values())]
        return answer[0]