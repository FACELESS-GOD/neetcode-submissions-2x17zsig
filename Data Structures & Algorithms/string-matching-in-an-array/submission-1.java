class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> ans = new ArrayList<String>();
        for(int i = 0 ; i<words.length ; i++)
        {
            String word = words[i];
            for(int j = 0 ; j<words.length ; j++)
            {
                String curr = words[j];
                if(curr != word && curr.length() > word.length())
                {
                    boolean isFound = false; 
                    int start = curr.length() - word.length() ; 

                    for(int k = start ; k>=0 ; k--)
                    {
                        boolean isDiff = false ; 
                        for(int l = 0 ; l<word.length() ; l++)
                        {
                            if(curr.charAt(k+l) != word.charAt(l))
                            {
                                isDiff = true ; 
                                break;
                            }
                        }

                        if(isDiff != true)
                        {
                            ans.add(word);
                            isFound = true ; 
                            break;
                        }
                    }

                    if(isFound == true )
                    {break;}

                }


            }
        }
        return ans ; 
    }
}