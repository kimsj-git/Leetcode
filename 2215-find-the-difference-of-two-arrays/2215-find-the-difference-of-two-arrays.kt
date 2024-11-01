class Solution {
    fun findDifference(nums1: IntArray, nums2: IntArray): List<List<Int>> {
        val onlyNums1 = nums1.toSet() - nums2.toSet()
        val onlyNums2 = nums2.toSet() - nums1.toSet()
        return listOf(onlyNums1.toList(), onlyNums2.toList())
    }
}