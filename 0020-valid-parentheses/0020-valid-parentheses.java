class Solution {
    public boolean isValid(String s) 
    {
        Deque<Character> de=new ArrayDeque<>();        
        for(int i=0 ; i< s.length(); i++)
        {
            char ch =s.charAt(i);
            if((ch=='(') || (ch=='[') || (ch=='{'))
            {
                de.push(ch);
            }
            else
            {
                if(de.isEmpty() ==true)
                    return false;
                else if(matching(de.peek(),ch)==false)
                    return false;
                else
                    de.pop();
            }
           
        }
         return (de.isEmpty() == true);
        
    }
    
    boolean matching(char a,char b)
    {
        return ((a=='(' && b==')')|| (a=='[' && b==']') || (a=='{' && b=='}'));
    }
}