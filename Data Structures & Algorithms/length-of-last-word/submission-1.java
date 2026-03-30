class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0 ;
        int curr = s.length() - 1 ;  
        for(int i = curr ; i>=0 ; i--)
        {
            if(s.charAt(curr) != ' ')
            {break;}
            else
            {
                curr = curr - 1 ; 
            }
        }
        for(int i = curr ; i>=0 ; i--)
        {
            if(s.charAt(i) == ' ')
            {break;}
            else
            {
                count = count + 1 ; 
            }
        }
        return count ; 
    }
}