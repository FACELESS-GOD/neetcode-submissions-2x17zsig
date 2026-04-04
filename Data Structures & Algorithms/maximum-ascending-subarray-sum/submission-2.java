class Solution {
    public int maxAscendingSum(int[] nums) {
        int ans = 0 ; 
        int sum = 0 ; 
        int len = nums.length; 
        for(int i = 0 ; i<len ; i++)
        {
            System.out.println("curr : "+nums[i]+" sum : "+sum+" ans: "+ans );
            if(i == 0 )
            {
                sum = nums[0];
            }
            else if(i == len-1)
            {
                if(nums[i] <= nums[i-1])
                {
                    if(ans < sum)
                    {ans = sum ; }
                    sum = nums[i];
                }
                else
                {
                    sum = sum + nums[i];
                    if(ans < sum)
                    {
                        ans = sum ;
                    }
                    
                }
            }
            else
            {
                if(nums[i] <= nums[i-1])
                {
                    if(ans < sum)
                    {ans = sum ; }
                    sum = nums[i];
                }
                else
                {
                    sum = sum + nums[i];
                }
            }
        } 
        return ans ; 
    }
}