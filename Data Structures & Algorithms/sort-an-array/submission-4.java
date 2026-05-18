class Solution {
    public int[] sortArray(int[] nums) {
        int len = nums.length ; 
        quick(nums, 0 , len-1);
        return nums;
    }
    public static void quick(int[] nums, int start , int end)
    {
        if(start == end || start > end || end < start)
        {return ; }
        else
        {
            int pivotVal = nums[end];

            int pivot = end ; 

            ArrayList<Integer>lower = new ArrayList<Integer>();
            ArrayList<Integer>higher = new ArrayList<Integer>();

            for(int i = start ; i<end ; i++)
            {
                int currVal = nums[i];
                if(currVal > pivotVal)
                {
                    higher.add(currVal);
                }
                else
                {
                    lower.add(currVal);
                }
            }

            int index = start ; 

            int lowerLen = lower.size();
            int higherLen = higher.size();

            for(int i = 0 ; i<lowerLen ; i++)
            {
                int curr = lower.get(i);
                nums[index] = curr ; 
                index = index + 1 ; 
            }

            int newPivotIndex = index ; 

            nums[index] = pivotVal ; 
            index = index + 1 ; 

            for(int i = 0 ; i<higherLen ; i++)
            {
                int curr = higher.get(i);
                nums[index] = curr ; 
                index = index + 1 ; 
            }
            
            int lowerLimit = newPivotIndex - 1 ; 
            int higherLimit = newPivotIndex + 1 ;

            quick(nums, start, lowerLimit);
            quick(nums, higherLimit, end);
        }
    }
}