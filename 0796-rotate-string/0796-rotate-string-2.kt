class Solution {
    fun rotateString(s: String, goal: String): Boolean {
        if (s.length != goal.length) {
            return false
        }
        
        return goal.indices.any { offset ->
            s.withIndex().all { (i, char) -> char == goal[(i + offset) % goal.length] }
        }
    }
}