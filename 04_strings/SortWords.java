/*
This Program was downloaded from this repository:
https://github.com/ApkaGuruji/ISC_ASSIGNMENT_PROGRAMS
=========== Apka Guruji ==============
for more free coding resources for ICSE, ISC, CBSE Students
Visit us:
Website: ApkaGuruji.com
Youtube: https://www.youtube.com/ApkaGuruji
GitHub: https://github.com/ApkaGuruji
*/
/*

WAP to accept a sentence and sort its words in lexicographic order.

*/

import java.util.*;
class SortWords
{
    private String s;
    private String w[];
    
    public SortWords()
    {
        s = "";
    }
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        s = sc.nextLine();
    }
    public void compute()
    {
        StringTokenizer st = new StringTokenizer(s);
        int i=0,nw;
        String t;
        
        nw = st.countTokens();
        w = new String[nw];
        while(st.hasMoreTokens())
        {
            w[i++] = st.nextToken();
        }
        
        for(i=1;i<nw;i++)
        {
            for(int j=0;j<nw-i;j++)
            {
                if(w[j].compareTo(w[j+1])>0)
                {
                    t = w[j];
                    w[j] = w[j+1];
                    w[j+1] = t;
                }
            }
        }
    }
    public void display()
    {
        System.out.println("Resulting Sentence: ");
        for(int i=0;i<w.length;i++)
        {
            System.out.print(w[i] + " ");
        }
    }
    public static void main(String args[])
    {
        SortWords ob = new SortWords();
        ob.input();
        ob.compute();
        ob.display();
    }
}