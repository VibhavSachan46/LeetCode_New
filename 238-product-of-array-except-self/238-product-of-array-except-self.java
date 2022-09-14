class Solution {
    public int[] productExceptSelf(int[] nums) {
        int ans [] = new int[nums.length] ; 
        
        int count_0 = 0 ; 
        
        int tot_prod = 1 ; 
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i]==0){
                count_0++;
                continue;
            }
            tot_prod*=nums[i];
        }
        
        if(count_0 > 1)
            return ans;
        
        if(count_0 == 1){
            for(int i = 0 ; i < nums.length ; i++ ){
                if(nums[i] == 0)
                    ans[i] = tot_prod;
                else
                    ans[i]= 0;
            }
        }
        else{
            for(int i = 0 ; i < nums.length ; i++){
                ans[i] = tot_prod/nums[i];
            }
        }
        return ans;
    }
}