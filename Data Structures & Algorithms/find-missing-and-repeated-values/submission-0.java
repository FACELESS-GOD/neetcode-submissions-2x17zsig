class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int len = grid.length ; 
        List<Integer> arr = new ArrayList<Integer>();
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int []ans = new int[2];
        int sum = 0 ;
        int upperLimit = len * len ;  
        for(int i = 1 ; i<=upperLimit ; i++)
        {
            sum = sum + i ; 
        }
        int count =  0 ; 
        for(int i = 0 ; i<len ; i++)
        {
            for(int j = 0 ; j<len ; j++)
            {
                int curr = grid[i][j];
                
                if(map.containsKey(curr) != true)
                {
                    map.put(curr , 1);
                    count = count + curr ; 
                }
                else
                {ans[0] = curr; }
            }
        }
        ans[1] = sum - count ; 
        return ans ; 
    }
}