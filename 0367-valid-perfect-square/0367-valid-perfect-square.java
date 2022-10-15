class Solution {
    public boolean isPerfectSquare(int num) {
        // if(num == 0)
        // {
        //     return false;
        // }
        // if(num==1)
        // {
        //     return true;
        // }
        // int s=1;
        // int e= num/2;
        // while(s<=e)
        // {
        //     int mid = (s+e)/2;
        //     if(mid*mid == num)
        //     {
        //         return true;
        //     }
        //     if(mid*mid > num)
        //         e = mid-1;
        //     else
        //         s = mid+1;
        // }
        // return false;
        
        if(num == 1) return true;
        int i = 1,j = num/2;
        while(i<=j)
        {
            int mid = i + (j-i)/2;
            if((long)mid*mid == num) return true;
            if(((long)mid*mid) > num) j = mid-1;
            else i = mid+1;
        }
        return false;
        
    }
}