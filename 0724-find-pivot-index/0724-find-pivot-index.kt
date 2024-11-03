class Solution {
    fun pivotIndex(nums: IntArray): Int {
        val n = nums.size
        val leftSum = IntArray(n) { 0 }
        for (i in 1 until n) {
            leftSum[i] = leftSum[i - 1] + nums[i - 1]
        }
        val rightSum = IntArray(n) { 0 }
        for (i in n - 2 downTo 0) {
            rightSum[i] = rightSum[i + 1] + nums[i + 1]
        }
        for (i in 0 until n) {
            if (leftSum[i] == rightSum[i]) {
                return i
            }
        }
        return -1
    }
}