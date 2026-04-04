class Solution {
    public int heightChecker(int[] heights) {
        int len = heights.length ; 
        int [] expected = new int[len];
        for(int i = 0 ; i<len ; i++)
        {expected[i] = heights[i];}
        int count = 0 ; 
        Arrays.sort(expected);
        for(int i = 0 ; i<len ; i++)
        {
            if(expected[i] != heights[i])
            {count = count + 1 ; }
        }
        return count ; 
    }
}