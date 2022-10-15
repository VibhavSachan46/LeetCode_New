class Solution {
    public int[] twoSum(int[] numbers, int target) 
    {
        int s = 0;
        int l = numbers.length-1;
        while(s<=l)
        {
            if(numbers[s]+numbers[l] == target)
            {
                return new int[]{s+1 , l+1};
            }
            else if(numbers[s]+numbers[l] > target)
            {
                l--;
            }
            else
            {
                s++;
            }
        }
        return new int[]{-1 , -1};
    }
}