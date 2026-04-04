class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int sum = 0 , ans = 0 , len = nums.length ;
        if(len == 1)
        {return nums[0];}
        boolean tog  = false ;
        if(nums[1] > nums[0])
        {
            tog = true ; 
        }
        else
        {
            tog = false ; 
        }
        sum = 1;
        for(int i  = 1 ; i< len ; i++)
        {
            System.out.println("curr : "+nums[i]+" sum: "+sum+" tog: "+tog+" ans: "+ans);
            if (i == len -1)
            {
                if(tog == true)
                {
                    if(nums[i] <= nums[i-1])
                    {
                        if(ans < sum)
                        {ans = sum ; }

                        sum = 2;
                        if(nums[i] == nums[i-1])
                        {sum = 1 ; }

                        

                        if(ans < sum)
                        {ans = sum ; }
                    }
                    else
                    {
                        sum = sum + 1;
                        if(ans < sum)
                        {ans = sum ; }
                    }
                }
                else
                {
                    if(nums[i] >= nums[i-1])
                    {
                         if(ans < sum)
                        {ans = sum ; }

                        sum = 2;
                        if(nums[i] == nums[i-1])
                        {sum = 1 ; }

                        if(ans < sum)
                        {ans = sum ; }
                    }
                    else
                    {
                        sum = sum + 1;
                        if(ans < sum)
                        {ans = sum ; }
                    }
                }
            }
            else
            { 
                if(tog == true)
                {
                    if(nums[i] <= nums[i-1])
                    {
                        if(ans < sum)
                        {ans = sum ; }
                        sum = 2;
                        if(nums[i] == nums[i-1])
                        {sum = 1 ; }
                        tog = false ; 
                    }
                    else
                    {
                        sum = sum + 1;
                    }
                }
                else
                {
                    if(nums[i] >= nums[i-1])
                    {
                        if(ans < sum)
                        {ans = sum ; }
                        sum = 2;
                        if(nums[i] == nums[i-1])
                        {sum = 1 ; }
                        tog = true ; 
                    }
                    else
                    {
                        sum = sum + 1;
                    }
                }
            }
        } 
        return ans ; 
    }
}