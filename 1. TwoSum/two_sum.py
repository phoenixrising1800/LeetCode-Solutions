#
# @lc app=leetcode id=1 lang=python3
#
# [1] Two Sum
#

# @lc code=start
class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        ind = [0] * 2
        for i in range(len(nums)):
            temp = nums[i]
            for j in range(i+1, len(nums)):
                if nums[j] == (target - temp):
                    ind[0] = i
                    ind[1] = j
        return ind
        
# @lc code=end

