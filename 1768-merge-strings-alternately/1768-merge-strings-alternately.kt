class Solution {
    fun mergeAlternately(word1: String, word2: String): String {
        var i = 0
        var result = ""
        while (i < maxOf(word1.length, word2.length)) {
            if (i < word1.length) result += word1[i]
            if (i < word2.length) result += word2[i]
            i++
        }
        return result
    }
}