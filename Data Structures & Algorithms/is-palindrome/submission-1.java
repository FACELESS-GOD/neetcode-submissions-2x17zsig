class Solution {
    public boolean isPalindrome(String s) {
        String kk = s.replaceAll("[^a-zA-Z0-9]", "");        
        String p = kk.toLowerCase();
        int len = p.length() ; 
        if(len <=1)
        {return true ; }

        if(len <= 3)
        {
            if(p.charAt(0) == p.charAt(len-1 ) )
            {return true ; }
            else
            {return false ; }
        }

        if(len % 2 == 0 )
        {
            len = len / 2 ;
        }
        else
        {
            len = (len-1) / 2 ;
        }

        int k = p.length() - 1 ; 

        for(int i = 0 ; i<len ; i++)
        {
            if(p.charAt(i) != p.charAt(k-i))
            {
                System.out.println(p+" -- "+"i: "+i+" Char: "+p.charAt(i)+" k-i: "+(k-i)+" Char :"+p.charAt(k-i));
                return false ; 
            }
        }
        return true ; 
    }
}
