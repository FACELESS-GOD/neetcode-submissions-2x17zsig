class Solution {
    public boolean divideArray(int[] nums) {
        int len = nums.length ; 
        int noOfPairs = len / 2 ;
        HashMap<Integer, Integer>map = new HashMap<Integer, Integer>();
        for(int i = 0 ; i<len  ;i++)
        {
            int curr = nums[i];
            if(map.containsKey(curr) != true)
            {
                map.put(curr, 1);
            }
            else
            {
                int val = map.get(curr);
                val = val + 1 ; 
                map.put(curr, val);
            }
        }
        int count = 0 ; 
        for(Map.Entry<Integer, Integer>etr : map.entrySet())
        {
            int val = etr.getValue();
            if(val % 2 != 0 )
            {return false ; }
            count = count  +  ( val / 2 ) ;
        }
        if(count != noOfPairs)
        {return false ; }
        return true ; 

    }
}