class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        nums2.forEachIndexed { i, _ -> nums1[m + i] = nums2[i] }
        nums1.sort()
    }
}