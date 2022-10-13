class Solution {
    public int threeSumClosest(int[] nums, int target) {
//         int n = nums.length;
//         int sum =0;
//         int finalSum = nums[0] + nums[1] + nums[n - 1];
//         for(int i=0 ;i<nums.length ;i++)
//         {
//             for(int j=i+1 ;j<nums.length ;j++)
//             {
//                 for(int k=j+1 ;k<nums.length ;k++)
//                 {
//                     sum = nums[i] + nums[j] + nums[k];
                    
//                     if (Math.abs(target - sum) < Math.abs(target - finalSum)) 
//                     {
//                         finalSum = sum;
//                     }
//                 }
                
//             }
//         }
        
//         return finalSum;
        
        
        int n = nums.length;
        Arrays.sort(nums);
        int diff = Integer. MAX_VALUE;
        int ans =0;
        
        for(int i=0;i<n;i++)
        {
            int first = nums[i];
            int s=i+1;
            int e = n-1;
            
            while(s<e)
            {
                if(first + nums[s] + nums[e] == target)
                {
                    return target;
                }
                else if(Math.abs(first + nums[s] + nums[e] - target) < diff)
                {
                    diff = Math.abs(first + nums[s] + nums[e] - target);
                    ans = first + nums[s] + nums[e];
                }
                if(first + nums[s] + nums[e] > target)
                {
                    e--;
                }
                else
                {
                    s++;
                }
            }
        }
        
        return ans;

    }
}