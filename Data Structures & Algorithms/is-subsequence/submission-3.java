class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() == 0)
        { return true ; }
        else
        {
            if(t.length() == 0)
            {return false ; }
        }
        int curr = 0 ;  
        for(int i = 0 ; i<t.length() ; i++)
        {
            if(s.charAt(curr) == t.charAt(i))
            {
                if(curr == s.length() - 1)
                {
                    return true ; 
                }
                else
                {
                    curr = curr + 1 ; 
                }
            }

        }
        return false ; 

    }
}