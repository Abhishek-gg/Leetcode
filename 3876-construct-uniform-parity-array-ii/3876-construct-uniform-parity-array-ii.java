class Solution {
    public boolean uniformArray(int[] nums) {
        int mini = Integer.MAX_VALUE;

        for (int x : nums)
            mini = Math.min(mini, x);

        if (mini % 2 == 1)
            return true;

        for (int x : nums)
            if (x % 2 == 1)
                return false;

        return true;
    }
}