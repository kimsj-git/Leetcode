class Solution:
    def reorderLogFiles(self, logs: List[str]) -> List[str]:
        logs = [log.split() for log in logs]
        letter_logs = []
        digit_logs = []
        for log in logs:
            if log[1].isalpha():
                letter_logs.append(log)
            else:
                digit_logs.append(log)

        letter_logs.sort(key=lambda x: [x[1:], x[0]])

        return [' '.join(log) for log in letter_logs + digit_logs]