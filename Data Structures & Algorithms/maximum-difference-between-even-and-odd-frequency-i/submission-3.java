class Solution {
    public int maxDifference(String s) {
        int maxEven = Integer.MAX_VALUE ;
        int maxOdd = 0 ;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int len =s.length() ;  
        for(int i = 0 ; i<len ; i++)
        {
            char curr = s.charAt(i);
            if(map.containsKey(curr) != true)
            {
                map.put(curr, 1);
            
            }
            else
            {
                int currFreq = map.get(curr);
                currFreq = currFreq + 1 ; 
                map.put(curr, currFreq);
            }
        }

        for(int i = 0 ; i<len ; i++)
        {
            char curr = s.charAt(i);
            int currFreq = map.get(curr);
            if(currFreq % 2 == 0 )
            {
                if(maxEven > currFreq)
                {maxEven = currFreq ; }
            }
            else
            {
                if(maxOdd < currFreq)
                {maxOdd = currFreq ; }
            }
        } 
        // if(maxEven > maxOdd)
        // {
        //     int oddDif =  maxEven - maxOdd ;
        //     return oddDif ; 
        // }
        int evenDif = maxOdd - maxEven ;
        return evenDif ; 

    }
}