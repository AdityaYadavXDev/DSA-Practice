class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        HashMap < Integer, Integer > map = new HashMap<>();

        for( int  i = 0; i <= nums.length - 1; i++){
            if(map.containsKey(nums[i])){
                // int prev = map.get(nums[i]); then if(Math.abs(orev -1) <=k)
                if(i - map.get(nums[i]) <= k){
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        return false;

        // Brute Force Apprach - 0(n)
        // for( int i = 0; i <= nums.length - 1; i++){
        //     for(int j =  i + 1 ; j <= nums.length - 1; j++){
        //         if(nums[i] == nums[j] && Math.abs(i - j) <= k ){
        //            return true;
        //         }
        //     }
        // }
        // return false;
    }
}