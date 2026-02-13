class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        for (int i = 0, j = nums.length - 1; i < j; i++, j--) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        return(nums[k-1]);
    }
}