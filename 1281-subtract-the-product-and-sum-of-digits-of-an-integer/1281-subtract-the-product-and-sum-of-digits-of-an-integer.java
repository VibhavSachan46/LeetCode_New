class Solution {
    public int subtractProductAndSum(int n) {
        int p=1 , s=0;
        while(n>0)
        {
            int rem= n%10;
            s = s+rem;
            p *= rem;
            n = n/10;
        }
        return p-s;
    }
}