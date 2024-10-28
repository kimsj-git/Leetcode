class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val n = nums.size
        val answer = IntArray(n) { 1 }
        
        var leftProduct = 1
        for (i in 0 until n) {
            answer[i] *= leftProduct
            leftProduct *= nums[i]
        }

        var rightProduct = 1
        for (i in n - 1 downTo 0) {
            answer[i] *= rightProduct
            rightProduct *= nums[i]
        }

        return answer
    }
}