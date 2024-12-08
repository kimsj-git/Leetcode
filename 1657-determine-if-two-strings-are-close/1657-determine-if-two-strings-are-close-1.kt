class Solution {
    fun closeStrings(word1: String, word2: String): Boolean {
        val map1 = mutableMapOf<Char, Int>()
        word1.forEach { char -> map1[char] = (map1[char] ?: 0) + 1 }

        val map2 = mutableMapOf<Char, Int>()
        word2.forEach { char -> map2[char] = (map2[char] ?: 0) + 1 }

        if (map1.keys.sorted() == map2.keys.sorted() && map1.values.sorted() == map2.values.sorted()) {
            return true
        }
        return false
    }
}