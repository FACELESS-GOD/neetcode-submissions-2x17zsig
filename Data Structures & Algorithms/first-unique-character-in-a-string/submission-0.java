class Solution {
    public int firstUniqChar(String s) {
        int len = s.length() ; 
        if(len == 1)
        {return 0 ; }
        int count = 0 ; 
        HashMap<Character, Integer>map= new HashMap<Character, Integer>();
        HashMap<Character, Integer>unq= new HashMap<Character, Integer>();
        for(int i = 0 ; i<len ; i++)
        {
            char curr = s.charAt(i);
            if(map.containsKey(curr) != true)
            {map.put(curr, 1);}
            else
            {map.put(curr, map.get(curr) + 1);}
        }
        for(Map.Entry<Character, Integer>etr : map.entrySet())
        {
            if(etr.getValue() == 1)
            {unq.put(etr.getKey(),1);}
        }
        if(unq.size() == 0)
        {return -1 ; }
        for(int i = 0 ; i<len ; i++)
        {
            char currChar = s.charAt(i);
            if(unq.containsKey(currChar) == true)
            {return i ; }
        }
        return -1 ;
    }
}