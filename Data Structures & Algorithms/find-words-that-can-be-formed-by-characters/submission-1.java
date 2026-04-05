class Solution {
    public int countCharacters(String[] words, String chars) {
        int noOfWords = words.length ; 
        int noOfChars = chars.length() ; 
        HashMap<Character, Integer>map = new HashMap<Character, Integer>();
        int count = 0 ;
        for(int i = 0 ; i<noOfChars ; i++)
        {
            char curr = chars.charAt(i);
            if(map.containsKey(curr) != true)
            {
                map.put(curr, 1);
            }
            else
            {
                int val = map.get(curr);
                val = val + 1 ; 
                map.put(curr, val);
            }
        }
        for(int j = 0 ; j<noOfWords ; j++)
        {
            String currWord = words[j];
            int lenWord = currWord.length() ; 
            boolean isPossible = true ; 
            HashMap<Character, Integer> uniq = new HashMap<Character, Integer>();
            for(int i = 0 ; i<lenWord ; i++)
            {
                char curr = currWord.charAt(i);
                if(uniq.containsKey(curr) != true)
                {
                    uniq.put(curr, 1);
                }
                else
                {
                    int val = uniq.get(curr);
                    val = val + 1 ; 
                    uniq.put(curr, val);
                }
            }
            for(Map.Entry<Character, Integer>etr : uniq.entrySet())
            {
                char key = etr.getKey();
                int val = etr.getValue() ;

                if(map.containsKey(key) != true)
                {isPossible = false ; break ;}
                
                int totalVal = map.get(key);
                if(val > totalVal)
                {isPossible = false ; break ;}
            }

            if(isPossible == true)
            {
                
                count = count + lenWord ; 
            }
        } 
        return count ;
    }
}