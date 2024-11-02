class Solution {
    fun isCircularSentence(sentence: String): Boolean {
        val words = sentence.split(" ")
        val n = words.size
        for (i in 0 until n) {
            val first = words[i]
            val second = words[(i + 1) % n]
            if (first.last() != second.first()) {
                return false
            }
        }
        return true
    }
}