class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> al = new ArrayList<List<Integer>>();
        ArrayList<Integer> row = new ArrayList<Integer>();

        
        for(int i=0 ;i<numRows ;i++)
        {
            row.add(0,1);
            for(int j=1;j<i ;j++)
            {
                row.set(j,row.get(j)+row.get(j+1));
            }
            
            al.add(new ArrayList<Integer>(row));
        }
        
        return al;
    }
}