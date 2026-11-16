class Solution {
    public int maxSubArray(int[] nums) {
        // int maxSum = Integer.MIN_VALUE;
        int n = nums.length-1;
        // // Brute Force Approach 1
        // for(int i = 0; i<= n; i++){
        //     for(int j = i; j<=n; j++){
        //         int curSum = 0;
        //         for(int k = i; k <= j; k++){
        //             curSum += nums[k];
        //         }
        //         maxSum = Math.max(curSum,maxSum);
        //     }
        // }

        // Brute Force Approach 2

        // for ( int i = 0; i <= n; i++){
        //     int curSum = 0;

        //     for(int j = i; j <= n; j++){
        //         curSum += nums[j];
        //         maxSum = Math.max(curSum,maxSum);
        //     }
        // }

        // Optimze Approach 
        int curSum = nums[0];
        int maxSum = nums[0];

        for(int i = 1; i <= n; i++){
            curSum = Math.max(nums[i], curSum + nums[i]);
            maxSum = Math.max(curSum, maxSum);
        }
        return maxSum;
    }
}