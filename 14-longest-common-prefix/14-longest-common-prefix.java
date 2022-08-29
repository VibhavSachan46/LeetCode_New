class Solution {
    public String longestCommonPrefix(String[] strs) 
    {
        StringBuilder prefix = new StringBuilder(strs[0]);
        for(int i = 0 ; i < strs.length ; i++)
        {
            while(strs[i].indexOf(prefix.toString()) != 0)
            {
                prefix = prefix.deleteCharAt(prefix.length() - 1);
            }
            if(prefix.toString().equalsIgnoreCase(""))
            {
                break;
            }
        }
        return prefix.toString();
    }
}