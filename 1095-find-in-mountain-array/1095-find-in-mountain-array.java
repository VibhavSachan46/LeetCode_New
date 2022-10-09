/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
//     public int findInMountainArray(int target, MountainArray mountainArr) {
        
//         int peak = findpeak(mountainArr);
//         int first = find(mountainArr , target , 0 , peak);
//         if(first != -1)
//         {
//             return first;
//         }
        
//         return find(mountainArr , target , peak+1 , mountainArr.length()-1);
//     }
    
    public int findInMountainArray(int target, MountainArray mountainArr) {
        
        int peak = findpeak(mountainArr);
        int leftHalf = find(mountainArr,target ,0, peak);
        if(leftHalf!=-1){
            return leftHalf;
        }else{
            return find(mountainArr,target, peak+1, mountainArr.length()-1);
        }
        
    }
    
    public int findpeak(MountainArray mountainArr){
        int start =0;
        int end = mountainArr.length()-1;
            
        while(start<end){
            int mid = start + (end-start)/2;
            
            if(mountainArr.get(mid)>mountainArr.get(mid+1)){
                end = mid;
            }else{
                start = mid+1;
            }
        }
        return start;
    }
    
    public int find(MountainArray mountainArr,int target,int start, int end){
        
        boolean isAsc = mountainArr.get(start) < mountainArr.get(end);
        
        while(start<=end){
            
            int mid = start + (end-start)/2;
            
            if(target == mountainArr.get(mid)){
                return mid;
            }
            if(isAsc){
                if(target < mountainArr.get(mid)){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
            else{
                if(target > mountainArr.get(mid)){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return -1;
    }
}