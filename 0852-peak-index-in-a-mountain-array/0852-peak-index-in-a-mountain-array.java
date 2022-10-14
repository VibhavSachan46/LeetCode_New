class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int s=0;
        int e= arr.length-1;
        
        while(s<e)
        {
            int mid = (s+e)/2;
            
            if(arr[mid+1]>arr[mid] && mid+1<arr.length)
            {
                s = mid+1;
            }
            if(arr[mid+1]<arr[mid] && mid+1<arr.length)
            {
                e = mid;
            }
        }
        
        return s;
    }
}