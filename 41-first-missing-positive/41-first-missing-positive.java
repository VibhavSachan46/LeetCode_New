class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        long max = 1;
        for (int num : nums) {
            set.add(num);
            max = Math.max(num, max);
        }
        for (int i = 1; i <= max + 1; i++)
        {
            if (!set.contains(i)) return i;
        }
        return 0;
    }
}