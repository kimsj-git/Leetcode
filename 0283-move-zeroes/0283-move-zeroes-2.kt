class Solution {
    fun moveZeroes(nums: IntArray): Unit {
        var allocateIndex = 0
        for (num in nums) {
            if (num != 0) {
                nums[allocateIndex] = num
                allocateIndex += 1
            }
        }
        for (i in allocateIndex until nums.size) {
            nums[i] = 0
        }
    }
}