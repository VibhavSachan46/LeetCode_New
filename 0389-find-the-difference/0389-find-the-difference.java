class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        
        for (int i = 0; i < s.length(); i++) {
            char key = s.charAt(i);
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            }
            else {
                map.put(key, 1);
            }
        }
        
        for (int i = 0; i < t.length(); i++) 
        {
            char key = t.charAt(i);
            if (!map.containsKey(key)) 
            {
                return key;
            }
            else if (map.get(key) == 0) {
                return key;
            }
            else {
                map.put(key, map.get(key) - 1);
            }
        }
        
        return ' ';
    }
}