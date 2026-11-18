class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int left = 0;
        for(int j=0;j<nums.length;j++){
           
            if(nums[j]%2==0){
                int temp = nums[left];
                nums[left] = nums[j];
                nums[j] = temp;
                left++;
            }
        }
        return nums;
    }
}