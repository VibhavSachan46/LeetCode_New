class Solution {
    public int diagonalSum(int[][] mat) {
        int len = mat.length;
        int sum1=0;
        int sum2 =0;
        
        for(int i=0; i<len; i++)
        {
            sum1 += mat[i][i];
            sum2 += mat[i][mat.length-1-i];
        }
        if(len%2 != 0)
        {
            return sum1 + sum2 -mat[len/2][len/2];
        }
        return sum1 + sum2;
        
    }
}