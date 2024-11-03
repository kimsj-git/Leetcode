class Solution {
    fun rotateString(s: String, goal: String): Boolean {
        if (s.length != goal.length) {
            return false
        }
        
        val offsets = goal.indices.mapNotNull { 
            if (goal[it] == s[0]) it else null
        }
        for (offset in offsets) {
            if (s.indices.all { s[it] == goal[(it + offset) % s.length] }) {
                return true
            }
        }
        return false
    }
}