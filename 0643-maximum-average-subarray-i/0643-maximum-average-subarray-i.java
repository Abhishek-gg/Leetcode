class Solution {
    public double findMaxAverage(int[] nums, int k) {
       int n = nums.length;
       int sum = 0;
       for(int i = 0; i < k; i++){
        sum = sum+nums[i];
       } 

       int maxsum = sum;

       for(int i = k; i<n ; i++){

        sum += nums[i];
        sum -= nums[i-k];
        maxsum = Math.max(maxsum,sum);
       }
       return (double) maxsum/k;
    }
}