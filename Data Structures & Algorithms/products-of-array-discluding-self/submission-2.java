class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length ; 
        if(len == 1)
        {
            int arr[] = new int[1];
            arr[0] = 1 ; 
            return arr ;
        }
        int []ans = new int[len];
        int mul = nums[0];
        boolean isZeroExist = false; 
        boolean isMultipleZeroExist = false ; 
        int temp = nums[0];
        for(int i = 1 ; i<len ; i++)
        {
            mul = mul * nums[i];
            if(nums[i] == 0 )
            {
                if(isZeroExist == true)
                {
                    isMultipleZeroExist = true ; 
                    temp = 0 ; 
                }
                else
                {
                    isZeroExist = true ; 
                }
            }
            else
            {
                temp = temp * nums[i];
            }
        }

        for(int i = 0 ; i<len ; i++)
        {
            if(nums[i] == 0)
            {
                if(isMultipleZeroExist == true)
                {ans[i] = 0 ;}
                else
                {ans[i] = temp ; }
            }
            else
            {
                int curr = mul / nums[i];
                ans[i] = curr;
            }
            
        }
        return ans ; 
    }
}  
