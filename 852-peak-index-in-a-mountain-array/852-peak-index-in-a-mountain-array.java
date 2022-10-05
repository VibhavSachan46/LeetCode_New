class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int s=0;
        int e=arr.length;
        
        while(s<e)
        {
            int mid = (s+e) / 2;
            
            if(mid+1 < arr.length && arr[mid] > arr[mid+1] )
            {
                e = mid;
            }
            
            if(mid+1 < arr.length && arr[mid] < arr[mid+1])
            {
                s = mid+1;
            }
        }
        
        return s;
    }
}