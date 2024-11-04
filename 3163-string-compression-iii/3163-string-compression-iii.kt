class Solution {
    fun compressedString(word: String): String {
        var cnt = 1
        var currentChar = word[0]
        var comp = ""
        for (i in 1 until word.length) {
            if (word[i] == currentChar && cnt < 9) {
                cnt++
            } else {
                comp += "$cnt$currentChar"
                cnt = 1
                currentChar = word[i]
            }
        }
        comp += "$cnt$currentChar"
        return comp
    }
}