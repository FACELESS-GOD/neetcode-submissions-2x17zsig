class Solution {
    public int numUniqueEmails(String[] emails) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for(String curr : emails)
        {
            List<Character>localName = new ArrayList<Character>();
            String domainString = "";
            boolean isDomainStarted = false ; 
            for(int i = 0; i<curr.length() ; i++)
            {
                if(curr.charAt(i) == '@')
                {
                    isDomainStarted = true ; 
                }
                if(isDomainStarted == true)
                {
                    domainString = domainString + String.valueOf(curr.charAt(i));
                }
                else
                {
                    localName.add(curr.charAt(i));
                }
            }
            String dist = "" ; 
            for(char currChar : localName)
            {
                if(currChar == '+')
                {
                    break;
                }
                else if(currChar == '.')
                {}
                else
                {
                    dist = dist + String.valueOf(currChar);
                }
            }
            dist = dist + domainString ; 
            if(map.containsKey(dist) != true)
            {map.put(dist,1);}
        }
        return map.size();
    }
}