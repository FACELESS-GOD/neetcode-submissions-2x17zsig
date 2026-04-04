class Solution {
    public boolean wordPattern(String pattern, String s) {
        int patternLen = pattern.length() ; 

        HashMap<Character, Integer>patternCount = new HashMap<Character, Integer>();
        HashMap<Integer, Character>idx = new HashMap<Integer, Character>();
        int count = 1 ; 
        for(int i = 0 ; i<patternLen ; i++)
        {
            char curr = pattern.charAt(i);
            if(patternCount.containsKey(curr) != true )
            {
                patternCount.put(curr, 1);
                idx.put(count, curr);
                count = count + 1 ; 
            }
            else
            {
                int val = patternCount.get(curr);
                val = val + 1 ; 
                patternCount.put(curr, val);
            }           
        }
        String [] words = s.split(" ");
        int noOfWords = words.length ;
        if(noOfWords < idx.size())
        {return false ; }
        HashMap<String, Character>map = new HashMap<String, Character>(); 
        HashMap<Character, Integer>mapCount = new HashMap<Character, Integer>();
        count = 1 ; 
        for(int i = 0 ; i<noOfWords ; i++)
        {
            String curr = words[i];
            if(map.containsKey(curr) != true)
            {
                if(count > idx.size())
                {
                    System.out.println("Count : "+count+" idx: "+idx.size());
                    return false ;
                 
                }
                else
                {
                    char ch = idx.get(count);
                    map.put(curr, ch);
                    mapCount.put(ch, 1);
                    count = count + 1; 
                }
            
            }
            else
            {
                char linkedChar = map.get(curr);
                int val = mapCount.get(linkedChar);
                val = val + 1; 
                int linkedLimit = patternCount.get(linkedChar);
                if(val > linkedLimit)
                {
                    System.out.println("char = "+linkedChar+"upperLimit : "+linkedLimit+" val: "+val);

                    return false ;
                }

                mapCount.put(linkedChar, val);              

            }
        }
        return true ; 
    }
}