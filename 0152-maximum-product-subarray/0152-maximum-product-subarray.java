class Solution {
    public int maxProduct(int[] nums) {
        // Brute Force 

        // int maxProd = Integer.MIN_VALUE;
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
        // return maxprod;

        // // Brute Approach 2
        // for(int i = 0; i <= n; i++){
        //     int curProd = 1; 
        //     for(int j = i; j <= n; j++){
        //         curProd *= nums[j];
        //         maxProd = Math.max(curProd,maxProd);
        //     }
        // }

        int maxProd = nums[0];
        int minProd = nums[0];
        int answer = nums[0];

        for( int i = 1; i <= n; i++){
            int num = nums[i];
            if(num < 0){
                int temp = maxProd;
                maxProd = minProd;
                minProd = temp;
            }

            maxProd = Math.max(num, maxProd * num);
            minProd = Math.min(num, minProd * num);
            answer = Math.max(maxProd, answer);
        }

        return answer;
    }
}