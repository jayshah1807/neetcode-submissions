class Solution {
    public int[] productExceptSelf(int[] nums) {
        int postfix = 1;
        int prefix = 1;
        int[] answer = new int[nums.length];

        for (int i = 0; i < nums.length; i++){
            answer[i] = prefix;
            prefix *= nums[i];
        }

         for (int i = nums.length - 1; i >= 0; i--){
            answer[i] *= postfix;
            postfix *= nums[i];
        }

        return answer;
    }
}  
