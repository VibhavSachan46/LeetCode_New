class Solution {
    public int firstMissingPositive(int[] arr) {
        int n= arr.length;
        for(int i=0;i<n;i++)
        {
            int ci=arr[i]-1;
            while(arr[i]<=n && arr[i]>0 && arr[i] != arr[ci])
            {
                int temp = arr[i];
                arr[i] = arr[ci];
                arr[ci] = temp;
                
                ci = arr[i]-1;
            }
            
        }
        
        for(int i=0;i<n;i++)
        {
           if(arr[i] != i+1) 
              return i+1;
        }
        return n+1;
    }
}