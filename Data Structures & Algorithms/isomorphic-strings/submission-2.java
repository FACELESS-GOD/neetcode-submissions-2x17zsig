class Solution {
    public boolean isIsomorphic(String s, String t) {
        int len = s.length();
        if(len == 0 )
        {return true ; }

       HashMap<Character, Character> sMap = new HashMap<Character, Character>(); 
       HashMap<Character, Character> tMap = new HashMap<Character, Character>();      
       
       for(int i = 0 ; i<len ; i++)
       {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(sMap.containsKey(sChar) != true)
            {
                if(tMap.containsKey(tChar) != true)
                {                    
                    sMap.put(sChar, tChar);
                    tMap.put(tChar, sChar);
                }
                else
                {
                    return false ; 
                }
            }
            else
            {
                char mappedChar = sMap.get(sChar);
                if(mappedChar != tChar)
                {return false ; }         

            }
       }
       return true ; 
    }
}