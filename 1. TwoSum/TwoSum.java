/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ind = new int[2];
        for (int i=0; i<nums.length; i++) {
            int current = nums[i];
            for (int j=i+1; j<nums.length; j++) {
                if (nums[j] == (target-current)) {
                    ind[0] = i;
                    ind[1] = j;
                }
            }
        }
        return ind;
    }
}
// @lc code=end

