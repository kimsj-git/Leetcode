class Solution {
    fun checkIfExist(arr: IntArray): Boolean {
        if (arr.count { it == 0 } > 1) return true
        return arr.filter { it != 0 }.any { 2 * it in arr }
    }
}