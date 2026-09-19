class Solution {
    public boolean hasDuplicate(int[] nums) {
        // int i = 0;
        // Arrays.sort(nums);
        // while ( i < nums.length - 1){
        //     if ( nums[i] == nums[i+1]){
        //         return true;
        //     }
        //     i++;
        // }

        // return false;

        HashSet<Integer> duplicate = new HashSet<>();

        for (int num : nums){
            
            if ( duplicate.contains(num)){
                return true;
            }
            duplicate.add(num);
        }

        return false;
    }
}