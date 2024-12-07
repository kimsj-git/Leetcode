class Solution {
    fun reverseVowels(s: String): String {
        val reversedVowels = s.filter { it in VOWELS }.reversed()
        var index = 0
        
        return s.map { char -> 
            if (char in VOWELS) reversedVowels[index++] else char
        }.joinToString("")
    }

    companion object {
        private val VOWELS = listOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
    }
}