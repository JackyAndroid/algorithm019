/*
 * @lc app=leetcode id=11 lang=java
 *
 * [11] Container With Most Water
 *
 * https://leetcode.com/problems/container-with-most-water/description/
 *
 * algorithms
 * Medium (51.28%)
 * Likes:    7221
 * Dislikes: 616
 * Total Accepted:    740.3K
 * Total Submissions: 1.4M
 * Testcase Example:  '[1,8,6,2,5,4,8,3,7]'
 *
 * Given n non-negative integers a1, a2, ..., an , where each represents a
 * point at coordinate (i, ai). n vertical lines are drawn such that the two
 * endpoints of the line i is at (i, ai) and (i, 0). Find two lines, which,
 * together with the x-axis forms a container, such that the container contains
 * the most water.
 * 
 * Notice that you may not slant the container.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: height = [1,8,6,2,5,4,8,3,7]
 * Output: 49
 * Explanation: The above vertical lines are represented by array
 * [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the
 * container can contain is 49.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: height = [1,1]
 * Output: 1
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: height = [4,3,2,1,4]
 * Output: 16
 * 
 * 
 * Example 4:
 * 
 * 
 * Input: height = [1,2,1]
 * Output: 2
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 2 <= height.length <= 3 * 10^4
 * 0 <= height[i] <= 3 * 10^4
 * 
 * 
 */

// @lc code=start
class Solution {
    public int maxArea(int[] height) {
        int l = 0, r = height.length - 1;
            int ans = 0;
            while (l < r) {
                int area = Math.min(height[l], height[r]) * (r - l);
                ans = Math.max(ans, area);
                if (height[l] <= height[r]) {
                    ++l;
                } else {
                    --r;
                }
            }
            return ans;
    }
}
// @lc code=end

