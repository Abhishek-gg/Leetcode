class Solution {
    public int sumCounts(List<Integer> nums) {
        int n = nums.size();
        int res = 0;

        for (int left = 0; left < n; left++) {
            Set<Integer> seen = new HashSet<>();
            int distinct = 0;

            for (int right = left; right < n; right++) {
                if (seen.add(nums.get(right))) {
                    distinct++;
                }

                res += distinct * distinct;
            }
        }

        return res;
    }
}