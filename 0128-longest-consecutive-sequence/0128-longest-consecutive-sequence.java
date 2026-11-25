class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet < Integer> set = new HashSet<>();

        // we use For each loop to store vaule in hashset
        for(int arr : nums){
            set.add(arr);
        }

        int maxCount = 0;
        // find starting point in set because check next iteration is consecute
        for(int arr : set){

            if(!set.contains(arr - 1)){         //arr -1 is 0-1 = -1 is present in set or not 
                
                int count = 1;
                int current = arr;  // get next vaule in set

                while(set.contains(current + 1)){
                    count++;
                    current++;
                }
                maxCount = Math.max(maxCount,count);
            }
        }
        return maxCount;
        // Brute Force Approach TC- O(n long n)
        // Arrays.sort(nums);
        // int count = 1;
        // for(int i = 0; i < nums.length - 1; i++){
        //     if(nums[i + 1] == nums[i] + 1){
        //         count ++;
        //     }
        // }
        // return count;
    }
}