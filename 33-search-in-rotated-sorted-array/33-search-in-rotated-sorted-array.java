class Solution {
    public int search(int[] A, int target) 
    {
//         if(arr.length ==0) return -1;
//         int s =0;
//         int e = arr.length-1;
//         if(target < arr[e] && target > arr[s]) return -1;
//         while(s<=e)
//         {
//             int mid = (s+e)/2;
            
//             if(arr[mid]==target)
//             {
//                 return mid;
//             }
            
//             if(arr[s]<arr[mid])
//             {
//                 if(target >= arr[s] && target < arr[mid])
//                 {
//                     e= mid-1;
//                 }
//                 else
//                 {
//                     s = mid+1;
//                 }
//             }
//             else
//             {
//                 if(target <= arr[e] && target > arr[mid])
//                 {
//                     s = mid+1;
//                 }
//                 else
//                 {
//                     e = mid-1;
//                 }
//             }
//         }
//         if(arr[s]== target)
//             return s;
        
//         return -1;
        
        
        if (A.length == 0) return -1;
    int L = 0, R = A.length-1;
    //
    if (target < A[L] && target > A[R]) return -1;
    
    while (L < R) {
        int M = (L + R)/2;
        if (A[M] <= A[R]) {
            if (target > A[M] && target <= A[R]) {
                L = M+1;
            } else {
                R = M;
            }
            
        } else {
            if (target <= A[M] && target >= A[L]) {
                    R = M;
            } else {
                L = M+1;
            }
        }
    }
    if (A[L] == target) return L;
    else return -1;
    }
    

}