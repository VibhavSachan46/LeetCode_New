class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> set = new HashSet<>();
        for(char j : jewels.toCharArray())
            set.add(j);
        int c=0;
        for(char k : stones.toCharArray())
        {
            if(set.contains(k))
                c++;
        }
        return c;
        
        
    }
}