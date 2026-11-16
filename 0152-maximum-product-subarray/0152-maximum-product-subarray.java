class Solution {
    public int maxProduct(int[] nums) {
        // Brute Force 

        int maxProd = Integer.MIN_VALUE;
        int n = nums.length-1;

        // for(int i = 0; i <= n; i++){
        //     for(int j = i; j <= n; j++){
        //         int curProd = 1; 
        //         for(int k = i;  k <= j; k++){
        //             curProd *= nums[k];
        //         }
        //         maxProd = Math.max(curProd,maxProd);
        //     }
        // }

        for(int i = 0; i <= n; i++){
            int curProd = 1; 
            for(int j = i; j <= n; j++){
                curProd *= nums[j];
                maxProd = Math.max(curProd,maxProd);
            }
        }
        return maxProd;
    }
}