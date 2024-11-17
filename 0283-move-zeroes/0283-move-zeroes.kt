class Solution {
    fun moveZeroes(nums: IntArray): Unit {
        val nonZeros = nums.filter { it != 0 }
        for (i in 0 until nonZeros.size) {
            nums[i] = nonZeros[i]
        }
        for (i in nonZeros.size until nums.size) {
            nums[i] = 0
        }
    }
}