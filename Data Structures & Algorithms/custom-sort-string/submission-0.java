class Solution {
    public String customSortString(String order, String s) {
         int orderLen = order.length() ; 
         int sLen = s.length();

         HashMap<Character, Integer>orderMap = new HashMap<Character, Integer>();
         HashMap<Character, Integer>sMap = new HashMap<Character, Integer>();

         for(int i = 0 ; i<orderLen ; i++)
         {
            char curr = order.charAt(i);
            if(orderMap.containsKey(curr) != true)
            {
                orderMap.put(curr, 1);
            }
            else
            {
                int val = orderMap.get(curr);
                val = val + 1; 
                orderMap.put(curr, val);
            }
         }

         for(int i = 0 ; i<sLen ; i++)
         {
            char curr = s.charAt(i);
            if(sMap.containsKey(curr) != true)
            {
                sMap.put(curr , 1);
            }
            else
            {
                int val = sMap.get(curr);
                val = val + 1 ;
                sMap.put(curr , val);
            }
         }
         String prefix = "";
         String suffix = "" ;

         for(int i = 0 ; i<orderLen ; i++)
         {
            char curr = order.charAt(i);
            if(sMap.containsKey(curr) == true)
            {
                int val = sMap.get(curr);
                for(int j = 0 ; j<val ; j++)
                {
                    prefix = prefix + String.valueOf(curr);
                }
            }
         }

         for(int i = 0 ; i<sLen ; i++)
         {
            char curr = s.charAt(i);
            if(orderMap.containsKey(curr) != true)
            {
                suffix = suffix + String.valueOf(curr);
            }
         }

         return prefix + suffix ; 
        
    }
}