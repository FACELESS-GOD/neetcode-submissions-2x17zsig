class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer>ans = new ArrayList<Integer>();
        HashMap<Integer , Integer> map = new HashMap<Integer , Integer>();
        int len = nums.length ; 
        for(int i = 0 ; i<len ; i++)
        {
            int curr = nums[i];
            if(map.containsKey(curr) != true)
            {
                map.put(curr,1);
            }
        }

        for(int i = 1 ; i<=len ; i++)
        {
            if(map.containsKey(i) != true)
            {
                ans.add(i);
            }
        } 
        return ans ; 
    }
}