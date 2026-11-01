class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        // First Sort the Array because we use two pointer technique
        Arrays.sort(nums);

        // first store examine value & max value to find the difference
        int resultSum = nums[0]+nums[1]+nums[2];
        int minDiff = Integer.MAX_VALUE;

        // Using Two Pointer Approach this function
        for(int i = 0; i < nums.length-2; i++){
            
            int left = i+1;
            int right = nums.length -1;

            while(left < right ){

                int sum = nums[i]+nums[left]+nums[right];

                if(sum == target){
                    return target;
                }
                else if(sum < target){
                    left++;
                }
                else{
                    right--;
                }
                // Calculate the Difference between two element (Math.abs() use for +postive number lane ke liye)
                int diff = Math.abs(sum-target);
                if(diff < minDiff){
                    // store the new updated value 
                    resultSum = sum;
                    minDiff = diff;
                }
            }
        }
        return resultSum;
    }
}