class Solution {
    public int numIdenticalPairs(int[] nums) {
        int len = nums.length ;
        if(len == 1)
        {return 0 ; }
        else if(len == 2)
        {
            if(nums[1] == nums[0])
            {return 1 ; }
            else
            {return 0 ; }
        } 
        int count = 0 ;
        for(int i = 0 ; i<len-1 ; i++)
        {
            for(int j = i + 1 ; j<len ; j++)
            {
                if(nums[i] == nums[j])
                {count = count + 1 ; }
            }
        } 
        return count ; 
    }
}