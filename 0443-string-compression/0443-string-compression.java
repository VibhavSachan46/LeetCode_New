class Solution {
    public int compress(char[] chars) 
    {
        int i=0;
        int ansIndex = 0;
        int n = chars.length;
        
        while(i<n)
        {
            int j= i+1;
            while(j<n && chars[i]==chars[j])
            {
                j++;
            }
            
            chars[ansIndex++]= chars[i];
            int count = j-i;
            if(count>1)
            {
                String c= String.valueOf(count);
                for(int k = 0; k< c.length(); k++)
                {
                    chars[ansIndex++] = c.charAt(k);
                }
            }
            
            i=j;
        }
        return ansIndex;
    }
}