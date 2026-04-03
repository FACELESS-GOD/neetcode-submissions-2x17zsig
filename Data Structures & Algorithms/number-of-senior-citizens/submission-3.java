class Solution {
    public int countSeniors(String[] details) {
        int count = 0 ;
        int len = details.length ; 
        for(int i = 0 ; i<len ; i++)
        {
            char tens = details[i].charAt(11);
            char units = details[i].charAt(12);
            int curr_age = Integer.parseInt(String.valueOf(tens)) *  10 + Integer.parseInt(String.valueOf(units));
            System.out.println(curr_age);
            if(curr_age > 60)
            {count = count + 1 ; }
            
        } 
        return count ; 
    }
}