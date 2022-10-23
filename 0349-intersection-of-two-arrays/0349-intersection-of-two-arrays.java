class Solution {
    public int[] intersection(int[] nums1, int[] nums2) 
    {
        Set<Integer> set = new HashSet<Integer>();
        Set<Integer> res = new HashSet<Integer>();
        
        for(int n: nums1)
        {
            set.add(n);
        }
        
        for(int y: nums2)
        {
            if(set.contains(y))
            {
                res.add(y);
                set.remove(y);
            }
        }
        int[] ret = new int[res.size()];
        int i = 0;
        for(int x : res)
        {
            ret[i++] = x;
        }
        return ret;

        
    }
}