/*
 * @lc app=leetcode id=1480 lang=java
 *
 * [1480] Running Sum of 1d Array
 */

// @lc code=start
class Solution {
    public int[] runningSum(int[] nums) {
       int[] result = new int[nums.length];
       int sum = 0;
        for (int i=0; i<nums.length; i++) {
            result[i] = nums[i] + sum;
            sum = result[i];
        }
        return result;
    }
}
// @lc code=end

