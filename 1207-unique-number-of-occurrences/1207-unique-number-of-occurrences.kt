class Solution {
    fun uniqueOccurrences(arr: IntArray): Boolean {
        val map = mutableMapOf<Int, Int>()
        for (num in arr) {
            map[num] = (map[num] ?: 0) + 1
        }
        
        val counts = map.values
        
        return if (counts.toSet().size == counts.size) true else false
    }
}