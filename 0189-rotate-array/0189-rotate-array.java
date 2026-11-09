class Solution {
    public void rotate(int[] nums, int k) {

        // Optimal or better
        int n = nums.length;
        if(n == 0) 
            return;
        
        k = k%n;

        // use for temp array store last digit which are reverse
        int temp[] =new int [k];

         // Store last k elements
        for(int i = 0; i< k; i++){
            temp[i] = nums[n - k + i];
        }
        // Shift remaining elements to the right
        for(int i = n - k- 1; i >= 0; i--){
            nums[i + k] = nums[i];
        }
        // Put stored elements at the beginning
        for(int i = 0; i < k; i++){
            nums[i] = temp[i];
        }



        // Brute Force apporach failed due time Exceed
        // int n = nums.length;
        // for(int i = 0; i<k; i++){
        //     int temp = nums[n - 1];
        //     for(int j = n-1; j > 0; j--){
        //         nums[j] = nums[j-1];
        //     }
        //     nums[0] = temp;
        // }
    }
}