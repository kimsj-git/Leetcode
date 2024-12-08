class Solution {
    fun closeStrings(word1: String, word2: String): Boolean {
        val frequency1 = word1.groupingBy { it }.eachCount()
        val frequency2 = word2.groupingBy { it }.eachCount()

        return frequency1.keys.sorted() == frequency2.keys.sorted() &&
                frequency1.values.sorted() == frequency2.values.sorted()
    }
}