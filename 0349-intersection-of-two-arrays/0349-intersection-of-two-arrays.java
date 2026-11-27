class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for( int arr: nums1){
            set1.add(arr);
        }
        for(int i = 0; i < nums2.length; i++){
            if(set1.contains(nums2[i])){
                set2.add(nums2[i]);
            }
        }

        int[] ans = new int[set2.size()];
        Iterator<Integer> it = set2.iterator();

        int i = 0;
        while(it.hasNext()){
            ans[i] = it.next();
            i++;
        }
        return ans;
    }
}