class Solution {
    public int longestConsecutive(int[] nums) {
        int len = nums.length ; 
        if(len == 0 )
        {return 0 ; }
        if(len == 1)
        {return 1 ; }
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i = 0 ; i<len ; i++)
        {
            int curr = nums[i];
            if(map.containsKey(curr) != true)
            {
                map.put(curr ,1);
            }
        }

        int ans = 1 ; 
        int min = nums[0];
        int max = nums[0];
        for(int i = 0 ; i<len ; i++)
        {
            if(min > nums[i])
            {
                min = nums[i];
            }

            if(max < nums[i])
            {
                max = nums[i];
            }
        }

        for(int i = min ; i<max ; i++)
        {
            int curr = i ; 
            int currLen = 0 ; 
            while(map.containsKey(curr) == true)
            {
                currLen = currLen + 1 ; 
                curr = curr + 1 ; 
            }

            if(currLen > ans)
            {
                ans = currLen ;
            }
            i = curr ; 
        }
        return ans ; 
    }
}
