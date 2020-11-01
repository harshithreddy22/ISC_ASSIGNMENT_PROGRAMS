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

WAP to accept a sentence and count number of words starting with capital letter.

*/

import java.util.*;
class CountWords
{
    private String s;
    private int c;
    public CountWords()
    {
        s = "";
        c = 0;
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
        String w;
        while(st.hasMoreTokens())
        {
            w = st.nextToken();
            if(Character.isUpperCase(w.charAt(0)))
                c++;
        }
    }
    public void display()
    {
        System.out.println("Number of such words: " + c);
    }
    public static void main(String args[])
    {
        CountWords ob = new CountWords();
        ob.input();
        ob.compute();
        ob.display();
    }
}