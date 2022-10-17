class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        for(int i=0 ;  i<nums1.length ;i++)
        {
            int n = nums1[i];
            for(int j=0; j<nums2.length ;j++)
            {
                if(nums2[j]==n)
                {
                    
                    if(j+1 == nums2.length)
                    {
                        nums1[i] = -1;
                    }
                    
                    else
                    {
                        for(int k = j+1; k<nums2.length; k++)
                        {
                            
                            if(nums2[k]>n)
                            {
                                nums1[i]= nums2[k];
                                break;
                            }
                        }
                        
                        
                        if(nums1[i] == n)
                        {
                            nums1[i]= -1;
                        }
                    }
                }
            }
        }
        return nums1;
    }
}