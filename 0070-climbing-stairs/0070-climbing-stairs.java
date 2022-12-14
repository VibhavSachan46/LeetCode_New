class Solution {
    public int climbStairs(int n) 
    {
        // Map<Integer, Integer> map = new HashMap<>();
        // map.put(1, 1);
        // map.put(2, 2);
        // return climbStairs(n, map);
        
        if (n <= 1) {
            return 1;
        }

        int prev1 = 1;
        int prev2 = 2;

        for (int i = 3; i <= n; i++) {
            int newValue = prev1 + prev2;
            prev1 = prev2;
            prev2 = newValue;
        }

        return prev2;
    }
    
    private int climbStairs(int n, Map<Integer, Integer> map) {
        if (map.containsKey(n)) {
            return map.get(n);
        }
        map.put(n, climbStairs(n - 1, map) + climbStairs(n - 2, map));
        return map.get(n);
    }
}