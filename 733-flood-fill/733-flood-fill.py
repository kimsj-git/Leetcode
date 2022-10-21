from collections import deque
drc = [(-1, 0), (1, 0), (0, -1), (0, 1)]

class Solution:
    def floodFill(self, image: List[List[int]], sr: int, sc: int, color: int) -> List[List[int]]:
        N = len(image)
        M = len(image[0])
        initial = image[sr][sc]
        if initial == color:
            return image

        Q = deque([(sr, sc)])
        image[sr][sc] = color
        while Q:
            r, c = Q.popleft()
            for dr, dc in drc:
                nr, nc = r + dr, c + dc
                if 0 <= nr < N and 0 <= nc < M and image[nr][nc] == initial:
                    image[nr][nc] = color
                    Q.append((nr, nc))
        
        return image