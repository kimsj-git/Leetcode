class Solution:
    def pivotIndex(self, nums: List[int]) -> int:
        N = len(nums)
        left = -nums[-1]
        right = sum(nums)

        for i in range(0, N):
            left += nums[i-1]
            right -= nums[i]
            if left == right:
                return i
        return -1
            