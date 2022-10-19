class Solution {
    public int specialArray(int[] nums) {
        int numOfElements = nums.length;
        int[] counts = new int[numOfElements+1];
        for(int elem : nums) {
            if(elem >= numOfElements) { counts[numOfElements]++; }
            else { counts[elem]++; }
        }
        
        int res = 0;
        for(int i = counts.length-1; i > 0; i--) {
            res += counts[i];
            if(res == i) { return i; } // res: (number of elements in nums that are >= x)  == i: (x)
        }
        
        return -1;
    }
}