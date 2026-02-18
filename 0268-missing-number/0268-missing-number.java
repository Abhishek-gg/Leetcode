class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int n = nums.length;

        for(int i =0; i<nums.length; i++){
            sum =sum + nums[i];
        }

        int total = (n*(n+1))/2;

        return(total-sum);
    }
}