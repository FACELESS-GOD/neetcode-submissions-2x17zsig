class Solution {
    public int scoreOfString(String s) {
        int count = 0 ;
        for(int i = 1 ; i<s.length() ; i++)
        {
            int a = (int)s.charAt(i);
            int b = (int)s.charAt(i-1);
            if(a > b)
            {
                count = count + (a-b) ; 
            }
            else
            {
                count = count + (b-a);
            }
        } 
        return count ; 
    }
}