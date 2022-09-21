class Solution {
    public int majorityElement(int[] nums) {
        int ans = 0;
        int c =1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==nums[ans])
            {
                c++;
            }
            else
            {
                c--;
            }
            if(c==0)
            {
                ans=i;
                c=1;
            }            
        }
        c=0;
        for(int i=0 ;i<nums.length;i++)
        {
            if(nums[i]==nums[ans])
                c++;
        }
        if(c>nums.length/2)
        {
            return nums[ans];
        }
        return -1;
    }
}