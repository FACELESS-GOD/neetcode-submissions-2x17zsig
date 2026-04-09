class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int noOfStudents = students.length , noOfSandwiches = sandwiches.length ; 
        Stack<Integer>st = new Stack<Integer>();
        for(int i = noOfSandwiches - 1 ; i >= 0 ; i--)
        {
            st.push(sandwiches[i]);
        }
        Queue<Integer>q = new LinkedList<>();
        for(int i = 0 ; i<noOfStudents ; i++)
        {q.add(students[i]);}
        while(q.isEmpty() != true)
        {
            int curr = q.poll();
            int sand = st.peek();
            if(sand == curr)
            {st.pop();}
            else
            {
                q.add(curr);
            }
            
            if(st.size() > 0)
            {
                int nex = st.peek();
                boolean isSame = true ; 
                for(int sa : q)
                {
                    if(sa == nex)
                    {
                        isSame = false ; 
                        break;
                    }
                }
                if(isSame == true)
                {return q.size();}
            }

        }  
        return 0 ; 
    }
}