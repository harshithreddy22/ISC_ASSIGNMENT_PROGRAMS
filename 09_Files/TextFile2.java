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
/*#

WAP to display all the palindrome words from a text file.

*/
import java.io.*;
import java.util.*;
class TextFile2
{
    public static void main(String args[])throws FileNotFoundException
    {
        Scanner sc = new Scanner(new FileInputStream("d:/filesamples/words.txt"));
        String w;
        while(sc.hasNext())
        {
            w = sc.next();
            if(w.equalsIgnoreCase(reverse(w)))
                System.out.println(w);
        }
        sc.close();
       
    }
    
    static String reverse(String s)
    {
        StringBuffer sb = new StringBuffer(s);
        sb.reverse();
        return sb.toString();
    }
}