class Solution {
    public boolean isArraySpecial(int[] nums) {
        int len = nums.length ; 
        if(len == 1)
        {return true ; }
        for(int i = 1 ; i<len ; i++)
        {
            int first = nums[i-1];
            int last = nums[i];
            if(first % 2 != 0)
            {
                if(last % 2 != 0)
                {return false ; } 
            }
            else
            {
                if(last % 2 == 0)
                {return false  ; }
            }
        }
        return true ; 
    }
}