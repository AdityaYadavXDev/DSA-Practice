class Solution {
    public int firstUniqChar(String s) {

        // Brute Force Approach use T.C is - o(n^2)
        // for (int i = 0; i < s.length(); i++) {
        //     int count = 0;
        //     for (int j = 0; j < s.length(); j++) {
        //         if (s.charAt(i) == s.charAt(j)) {
        //             count++;
        //         }
        //     }
        //     if (count == 1) {
        //         return i;
        //     }
        // }
        // return -1;

        // Optimize Approach use - Hashing , TC - o(1)

        HashMap< Character, Integer> map = new HashMap<>();
        // Frequency Count (hashmap mai Store)
        for( int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            map.put(ch, map.getOrDefault(ch, 0) + 1);

        } 

        // Unique Value Find in hashmap

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if( map.get(ch)== 1){
                return i;
            }
        }
        return -1;
    }
}