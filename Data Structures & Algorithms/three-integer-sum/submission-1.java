class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int len = nums.length ; 
        HashMap<String, Integer>map = new HashMap<String ,Integer>();
        List<List<Integer>> ans = new ArrayList<>();

        for(int i = 0 ; i< len ; i++)
        {
            for(int j = 0 ; j< len ; j++)
            {
                for(int k = 0 ; k< len ; k++)
                {
                    if(i != j && j != k && i != k)
                    {
                        int sum = nums[k] + nums[j] + nums[i] ;
                        if(sum == 0)
                        {
                            String key1 = String.valueOf(nums[i])+","+String.valueOf(nums[k])+","+String.valueOf(nums[j]);

                            String key2 = String.valueOf(nums[i])+","+String.valueOf(nums[j])+","+String.valueOf(nums[k]);

                            String key3 = String.valueOf(nums[j])+","+String.valueOf(nums[k])+","+String.valueOf(nums[i]);

                            String key4 = String.valueOf(nums[j])+","+String.valueOf(nums[i])+","+String.valueOf(nums[k]);

                            String key5 = String.valueOf(nums[k])+","+String.valueOf(nums[j])+","+String.valueOf(nums[i]);

                            String key6 = String.valueOf(nums[k])+","+String.valueOf(nums[i])+","+String.valueOf(nums[j]);

                            if( map.containsKey(key1 ) != true && 
                                map.containsKey(key2 ) != true && 
                                map.containsKey(key3 ) != true && 
                                map.containsKey(key4 ) != true && 
                                map.containsKey(key5 ) != true && 
                                map.containsKey(key6 ) != true )
                            {
                                map.put(key1,1);
                                map.put(key2,1);
                                map.put(key3,1);
                                map.put(key4,1);
                                map.put(key5,1);
                                map.put(key6,1);
                                
                                List<Integer>tempAns = new ArrayList<Integer>();
                                tempAns.add(nums[i]);
                                tempAns.add(nums[k]);
                                tempAns.add(nums[j]);
                                ans.add(tempAns);
                            }
                        }
                    }
                }
            }

        }

        return ans ; 
    }
}
