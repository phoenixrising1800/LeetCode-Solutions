/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        char[] str = String.valueOf(x).toCharArray();
        int i = 0;
        int end = str.length-1;
        while (i<=end) {
            if (str[i] != str[end]) 
                return false;
            end--;
            i++;
        }
        return true;
    }
}
// @lc code=end

