class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> mapTarget = new HashMap<>();
        for ( char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
         for ( char c : t.toCharArray()){
            mapTarget.put(c, mapTarget.getOrDefault(c,0)+1);
        }

        if ( map.equals(mapTarget)){
            return true;
        } else{
            return false;
        }

    }
}
