class Solution {
    public int fib(int n) 
    {
	    // if(n<=1)
	    // {
	    // return n;
	    // }
	    // HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	    // map.put(0, 0);
	    // map.put(1, 1);
	    // return fib(n,map);
        if(n<=1)
        {
            return n;
        }
        int prev2 = 0;
        int prev =  1;
        for(int i=2 ;i<=n ;i++)
        {
            int cur = prev + prev2;
            prev2 = prev;
            prev = cur;
        }
        
        return prev;
    }
    
    public int fib(int n, HashMap<Integer,Integer> map)
    {
        if(n<=1)
        {
            return n;
        }
        if(!map.containsKey(n))
        {
            int currentFib = fib(n - 1, map) + fib(n - 2, map);
		    map.put(n, currentFib);
        }
        return map.get(n);
    }
}