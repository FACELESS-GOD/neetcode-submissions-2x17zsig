class Solution {
    public int appendCharacters(String s, String t) {
        int count = 0 ;
        int curr =  0 ;  
        for(int i = 0 ; i<t.length() ; i++)
        {
            //System.out.println(" "++" "+curr);
            if(curr == s.length())
            {
                return t.length() - i ; 
            }
            else
            {
                char curr_char = t.charAt(i);
                boolean is_found = false ; 
                for(int j = curr ; j<s.length() ; j++)
                {
                    if(s.charAt(j) == curr_char)
                    {
                        is_found = true ; 
                        curr = j + 1 ; 
                        break;
                    }
                }
                if(is_found == false)
                {return t.length() - i ; }
            }
        }
        return 0 ; 
    }
}