class Solution:
    def reorderLogFiles(self, logs: List[str]) -> List[str]:
        letter_logs = []
        digit_logs = []
        for log in logs:
            words = list(log.split())
            if words[1].isalpha():
                letter_logs.append(words)
            else:
                digit_logs.append(words)

        letter_logs.sort(key=lambda x: [x[1:], x[0]])
        total_logs = letter_logs + digit_logs

        return [' '.join(word) for word in total_logs]