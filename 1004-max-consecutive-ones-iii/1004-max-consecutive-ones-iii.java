import java.util.*;

class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxlength = 0, l = 0, r = 0, zeroes = 0;

        while (r < nums.length) {

            if (nums[r] == 0) {
                zeroes++;
            }

            while (zeroes > k) {
                if (nums[l] == 0) {
                    zeroes--;
                }
                l++;   
            }

            maxlength = Math.max(maxlength, r - l + 1);

            r++;
        }

        return maxlength;
    }
}