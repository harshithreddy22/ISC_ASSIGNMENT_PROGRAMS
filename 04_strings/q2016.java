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
//string problem 2016 solution
import java.util.*;
class q2016
{
    private String s;
    public q2016()
    {
       s="";
    }
    public boolean input()
    {
        int l;
        char tc;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        s = sc.nextLine();
        l = s.length();
        tc = s.charAt(l-1);
        if(!(tc=='.'||tc=='?'||tc=='!'))
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    private boolean isVowel(char ch)
    {
        ch = Character.toLowerCase(ch);
        return (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u');
    }
   
    public void process()
    {
        String w,lp="",rp="",rs;
        int l = s.length(),wl,c=0;
        char fc,lc;
        char tc = s.charAt(l-1);
        String ns = s.substring(0,l-1);
        StringTokenizer st = new StringTokenizer(ns);

        while(st.hasMoreTokens())
        {
            w = st.nextToken();
            fc = w.charAt(0);
            wl = w.length();
            lc = w.charAt(wl-1);
            if(isVowel(fc) && isVowel(lc))
            {
                lp = lp + " " + w;
                c++;
            }
            else
            {
                rp = rp + " " + w;
            }

        }
        
        rs="";
        if(lp.length()!=0)
            rs += lp.substring(1) + " ";
        if(rp.length()!=0)
            rs += rp.substring(1);
        rs += tc;
        System.out.println("NUMBER OF WORDS BEGINNING AND ENDING WITH A VOWEL=" + c);
        System.out.println(rs);
    }
  
    public static void main(String args[])
    {
        q2016 ob = new q2016();
        if(!ob.input())
            System.out.println("Invalid Input");
        else
        {
            ob.process();
        }
            
    }
}