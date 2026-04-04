class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int len1 = nums1.length ; 
        int len2 = nums2.length ;

        int[] ans = new int[len1];
        
        Arrays.fill(ans, -1);

        int[] last = new int[len2];
        int max = 0 ; 
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0 ; i<len2 ; i++)
        {
            map.put(nums2[i], i);
            int index = i ; 
            int curr = nums2[i];
            for(int j = index ; j<len2 ; j++ )
            {
                if(nums2[j] > curr)
                {
                    index = j;
                    break;
                }
            }
            if(index != i)
            {last[i] = nums2[index];}
            else
            {last[i] = -1 ; }
           
        }

        for(int i = 0 ; i<len1 ; i++)
        {
            if(map.containsKey(nums1[i]) == true)
            {
                int index = map.get(nums1[i]);
                ans[i] = last[index];
            }
            else
            {                
                ans[i] = -1;
            }

            
        }

        return ans ; 
    }
}