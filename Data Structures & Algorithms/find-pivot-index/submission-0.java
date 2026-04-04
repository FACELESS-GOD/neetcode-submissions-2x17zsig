class Solution {
    public int pivotIndex(int[] nums) {
        int len = nums.length ; 
        int piv = 0 ;
        int [] leftSum = new int[len];
        int [] rightSum = new int[len];
        int count = 0 ; 
        for(int i = 0 ; i<len ; i++)
        {
            leftSum[i] = count ; 
            count = count + nums[i];
        }
        count = 0 ; 
        for(int i = len - 1 ; i>=0 ; i--)
        {            
            rightSum[i] = count ; 
            count = count + nums[i];
        }

        boolean isPivotExist = false ; 

        for(int i = 0; i< len ; i++)
        {
            if(leftSum[i] == rightSum[i])
            {
                piv = i ; 
                isPivotExist = true ; 
                break;
            }
        }
        if(isPivotExist != true)
        {return -1 ; }
        return piv ; 
    }
}