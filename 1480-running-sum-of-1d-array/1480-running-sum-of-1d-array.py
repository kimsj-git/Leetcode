class Solution:
    def runningSum(self, nums: List[int]) -> List[int]:
        N = len(nums)
        rsum = [0] * N
        rsum[0] = nums[0]
        for i in range(1, N):
            rsum[i] = rsum[i-1] + nums[i]
        return rsum
        