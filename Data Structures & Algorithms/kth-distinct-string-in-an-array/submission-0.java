class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<Integer, String> index = new HashMap<Integer, String>();
        HashMap<String, Integer>map = new HashMap<String, Integer>();
        int len = arr.length ;
        int count = 1 ;  
        for(int i = 0 ; i<len ; i++)
        {
            String curr = arr[i];
            if(map.containsKey(curr) != true)
            {
                map.put(curr, 1);
                index.put(count, curr);
                count = count + 1;
            }
            else
            {
                int val = map.get(curr);
                val = val + 1 ; 
                map.put(curr, val);
            }
        }
        
        int idx = 1 ;
        HashMap<Integer, String>finalIdx = new HashMap<Integer, String>();
        for(int i = 1 ; i<=map.size(); i++)
        {
            String curr = index.get(i);
            int val = map.get(curr);
            if(val == 1)
            {
                finalIdx.put(idx, curr);
                idx = idx + 1 ; 
            }
        }

        if(finalIdx.size() < k)
        {return "";}

        return finalIdx.get(k);
    }
}