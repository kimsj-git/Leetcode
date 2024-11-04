class Solution {
    fun removeStars(s: String): String {
        val stack = ArrayDeque<Char>()
        s.forEach { char -> 
            if (char != '*') {
                stack.addLast(char)
            } else {
                stack.removeLast()
            }
        }
        return stack.joinToString(separator="")
    }
}