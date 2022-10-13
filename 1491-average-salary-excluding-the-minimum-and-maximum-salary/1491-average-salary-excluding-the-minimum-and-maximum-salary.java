class Solution {
    public double average(int[] salary) {
        int l = salary.length;
        int low= salary[0];
        int high= salary[0];
        for(int i=0 ; i<l ; i++)
        {
            if(salary[i]<low)
            {
                low = salary[i];
            }
            else if(salary[i]>high)
            {
                high = salary[i];
            }
        }
        double sum =0;
        for(int i=0 ; i<l ; i++)
        {
            if(salary[i]!=low && salary[i]!=high)
            {
                sum += salary[i];
            }
        }
        return sum/(l-2);
    }
}