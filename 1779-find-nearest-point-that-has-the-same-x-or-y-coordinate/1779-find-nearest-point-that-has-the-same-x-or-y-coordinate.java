class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int index = -1;
        int smallest = Integer.MAX_VALUE ;
        for(int i=0;i<points.length ;i++)
        {
            int dx = x-points[i][0];
            int dy = y-points[i][1];
            
            if(dx*dy ==0 && Math.abs(dx+dy)<smallest)
            {
                smallest = Math.abs(dx+dy);
                index = i;
            }
        }
        
        return index;
    }
}