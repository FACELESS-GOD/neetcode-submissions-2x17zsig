class Solution {
    public int findLucky(int[] arr) {
        int len = arr.length;
        HashMap<Integer, Integer>map = new HashMap<Integer, Integer>();
        for(int i = 0 ; i<len ; i++)
        {
            int curr = arr[i];
            if(map.containsKey(curr) != true)
            {
                map.put(curr , 1);
            }
            else
            {
                int val = map.get(curr) ;
                val = val + 1 ; 
                map.put(curr, val);
            }
        }
        int count = -1;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
            if(entry.getKey() == entry.getValue())
            {
                if(count < entry.getKey())
                {count = entry.getKey() ; }
            }
            // {count = count + 1;}
            // System.out.println(entry.getKey() + " = " + entry.getValue());
        }
        // if(count == 0)
        // {return -1 ; }
        return count ;
        // return -1 ;  
    }
}