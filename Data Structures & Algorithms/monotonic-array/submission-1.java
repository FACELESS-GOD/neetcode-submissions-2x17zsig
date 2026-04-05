class Solution {
    public boolean isMonotonic(int[] nums) {
        int len = nums.length ; 
        if(len == 1 )
        {return true ; }
        boolean isIncreasing = false ; 
        if(nums[1] >= nums[0])
        {isIncreasing = true ; }
        for(int i = 1 ; i<len ; i++)
        {
            if(isIncreasing == true)
            {
                if(nums[i] < nums[i-1])
                {
                    System.out.println("i: "+i+" nums[i]: "+nums[i]+" nums[i-1]: "+nums[i-1]);
                    return false ;
                }
            }
            else
            {
                if(nums[i] > nums[i-1])
                {
                    System.out.println("i: "+i+" nums[i]: "+nums[i]+" nums[i-1]: "+nums[i-1]);
                    return false ; 
                }
            }
            
        }
        return true ; 
    }
}