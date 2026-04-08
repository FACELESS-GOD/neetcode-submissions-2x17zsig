class Solution {
    public boolean makeEqual(String[] words) {
        int noOfWords = words.length ; 
        int count = 0 ; 
        boolean isOnlyOne = true ; 
        if(noOfWords == 1)
        {return true ; }
        HashMap<Character, Integer>map = new HashMap<Character, Integer>();
        for(int i = 0 ; i<noOfWords ; i++)
        {
            String curr = words[i];
            int currLen = curr.length() ; 
            count = count + currLen ;
            if(currLen > 1)
            {isOnlyOne = false ; } 
            
            for(int j = 0 ; j<currLen ; j++)
            {
                char currChar = curr.charAt(j);
                if(map.containsKey(currChar) != true)
                {map.put(currChar , 1);}
                else
                {map.put(currChar, map.get(currChar)+1);}
            }

        }
        if(isOnlyOne == true)
        {return false ; }
        System.out.println(count+" , "+noOfWords);
        System.out.println(count % noOfWords);
        
        List<Character>ch = new ArrayList<Character>(map.keySet());
        int max = map.get(ch.get(0));
        for(Character letter:ch)
        {
            System.out.println(letter);
            if(max != map.get(letter))
            {return false ; }
        }
        if(count % noOfWords == 0 )
        {return true ; }
        return false ; 
    }
}