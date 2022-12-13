import java.util.HashMap;

/* More time efficient solution
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hMap = new HashMap<Integer, Integer>(nums.length);
        for (int i=0; i<nums.length; i++) {
            hMap.put(nums[i], i);
        }
        for (int i=0; i<nums.length; i++) {
            int k = nums[i];
            System.out.println("k: " + k + ", needed: " + (target-k));
            if (k == target && hMap.containsKey(0)) {
                System.out.println("hMap.get(0): " + hMap.get(0));
                return new int[] { i, hMap.get(0) };
            }
            else if (hMap.containsKey(target-k)) {
                System.out.println("hMap.get(target-k): " + hMap.get(target-k));
                if (hMap.get(target-k) > i) 
                    return new int[] { i, hMap.get(target-k) };
            } 
        }
        return new int[] { 0, 0 };
    }
}
// @lc code=end

