class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int noOfWords = words.length ; 
        HashMap<Character, Integer>map = new HashMap<Character, Integer>();
        int len = allowed.length() ; 
        for(int i = 0 ; i<len ; i++)
        {
            char curr = allowed.charAt(i);
            if(map.containsKey(curr) != true)
            {
                map.put(curr, 1);
            }
        }
        int count = 0 ;
        for(int j = 0; j<noOfWords ; j++)
        {
            String curr = words[j];
            int lenWord = curr.length();
            boolean isConsistent = true ;
            for(int i = 0 ; i<lenWord ; i++)
            {
                char currChar = curr.charAt(i);
                if(map.containsKey(currChar) != true)
                {isConsistent = false ; break;}
            }
            if(isConsistent == true )
            {count = count + 1 ;}

        } 
        return count ; 
    }
}