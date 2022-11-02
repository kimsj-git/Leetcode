from collections import deque

def isMutation(str1, str2):
    cnt = 0
    for i in range(8):
        if str1[i] != str2[i]:
            cnt += 1
            if cnt > 1:
                return False
    if cnt == 1:
        return True

class Solution:
    def minMutation(self, start: str, end: str, bank: List[str]) -> int:
        Q = deque([(start, 0)])
        visited = set(start)
        
        while Q:
            gene, cnt = Q.popleft()
            if gene == end:
                return cnt
            for mutant in bank:
                if mutant not in visited and isMutation(gene, mutant):
                    visited.add(mutant)
                    Q.append((mutant, cnt + 1))
        return -1