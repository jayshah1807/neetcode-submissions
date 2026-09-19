class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> m = new HashMap<>();
        for (int n : nums) m.put(n, m.getOrDefault(n, 0) + 1);

        return m.keySet().stream()
            .sorted((a, b) -> m.get(b) - m.get(a))
            .limit(k)
            .mapToInt(i -> i)
            .toArray();
        
    }
}
