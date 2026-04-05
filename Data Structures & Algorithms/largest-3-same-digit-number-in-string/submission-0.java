class Solution {
    public String largestGoodInteger(String num) {
        int len = num.length() ; 
        HashMap<String, Integer>map = new HashMap<String, Integer>();

        for(int i = 2 ; i<len ; i++)
        {
            char hundreds = num.charAt(i-2);
            char tens = num.charAt(i-1);
            char units = num.charAt(i);
            if(hundreds == tens && tens == units)
            {
                String curr = String.valueOf(hundreds)+String.valueOf(tens)+String.valueOf(units);
                int val = Integer.parseInt(curr);
                if(map.containsKey(curr) != true)
                {
                    map.put(curr, val);
                }
            }
        }

        if(map.size() == 0)
        {return "";}
        int max = Integer.MIN_VALUE ;
        String ans = "";
        for(Map.Entry<String, Integer>etr: map.entrySet())
        {
            String curr = etr.getKey(); 
            int val = etr.getValue(); 
            if(val > max)
            {
                max = val ; 
                ans = curr ; 
            }
        }
        return ans ; 
    }
}