import java.util.HashMap;

/*
 * @lc app=leetcode id=3 lang=java
 *
 * [3] Longest Substring Without Repeating Characters
 */

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        int[] pos = new int[128];
        int start = 0, end = 0;
        for (char c : s.toCharArray()) {
            start = Math.max(start, pos[c]);
            maxLen = Math.max (maxLen, end-start+1);
            pos[c] = end+1;
            end++;
        }
        return maxLen;
    }
}
// @lc code=end

