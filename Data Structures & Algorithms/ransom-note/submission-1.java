class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int rlen = ransomNote.length() ;
        HashMap<Character, Integer> rmap = new HashMap<Character, Integer>() ; 

        int maglen = magazine.length() ; 
        HashMap<Character, Integer>mmap = new HashMap<Character, Integer>();


        for(int i = 0 ; i<rlen ; i++)
        {
            char curr = ransomNote.charAt(i);
            if(rmap.containsKey(curr) != true)
            {
                rmap.put(curr, 1);
            }
            else
            {
                int val = rmap.get(curr);
                val = val + 1 ; 
                rmap.put(curr, val);
            }
        }

        
        for(int i = 0 ; i<maglen ; i++)
        {
            char curr = magazine.charAt(i);
            if(mmap.containsKey(curr) != true)
            {
                mmap.put(curr, 1);
            }
            else
            {
                int val = mmap.get(curr);
                val = val + 1 ; 
                mmap.put(curr, val);
            }
        }

        for(Map.Entry<Character, Integer>etr: rmap.entrySet())
        {
            char curr = etr.getKey();
            int val = etr.getValue();
            if(mmap.containsKey(curr) != true)
            {return false ; }
            int inventory = mmap.get(curr);

            if(val > inventory)
            {return false ; }
        }

        return true ; 
    }
}