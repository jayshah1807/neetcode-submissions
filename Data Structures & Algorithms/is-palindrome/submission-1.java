class Solution {
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]", "");

        int left = 0;
        int right = str.length() - 1;

        while (left <= right) {
            char leftChar = Character.toLowerCase(str.charAt(left));
            char rightChar = Character.toLowerCase(str.charAt(right));

            if (leftChar != rightChar) {
                return false;
            } else if (leftChar == rightChar) {
                left++;
                right--;
            } 
        }

        return true;
    }
}
