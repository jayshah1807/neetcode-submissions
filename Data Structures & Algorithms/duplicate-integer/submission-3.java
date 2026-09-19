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

        HashSet<Integer> duplicate = new HashSet<>(nums.length * 2);

        for (int num : nums){
            
            if ( !duplicate.add(num)){
                return true;
            }
        }

        return false;
    }
}