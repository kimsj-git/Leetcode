class Solution {
    fun countSquares(matrix: Array<IntArray>): Int {
        val m = matrix.size
        val n = matrix[0].size

        var answer = 0
        
        for (r in 0..m-1) {
            for (c in 0..n-1) {
                for (side in 1..minOf(m, n)) {
                    if (r + side > m || c + side > n) break
                    if (isSquare(r, c, side, matrix)) answer += 1
                }
            }
        }

        return answer
    }

    private fun isSquare(startRow: Int, startCol: Int, side: Int, matrix: Array<IntArray>): Boolean {
        val endRow = startRow + side - 1
        val endCol = startCol + side - 1
        for (r in startRow..endRow) {
            for (c in startCol..endCol) {
                if (matrix[r][c] != 1) return false
            }
        }
        return true
    }
}