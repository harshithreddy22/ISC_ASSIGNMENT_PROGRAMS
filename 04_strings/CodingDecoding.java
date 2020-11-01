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

WAP to accept an uppercase string and encode by adding 7 to each of its characters. also display it 
after decoding back.

*/
import java.util.*;
class CodingDecoding
{
    private String s,es, ds;
    public CodingDecoding()
    {
        s="";
        es = "";
        ds = "";
    }
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string in uppercase: ");
        s = sc.next();
    }
    public void encode()
    {
        int i,l;
        char ch;
        l = s.length();
        for(i=0;i<l;i++)
        {
            ch = s.charAt(i);
            ch+=7;
            if(ch>90)
                ch -= 26;
            es+=ch;
        }
    }
    public void decode()
    {
        int i,l;
        char ch;
        l = es.length();
        for(i=0;i<l;i++)
        {
            ch = es.charAt(i);
            ch-=7;
            if(ch<65)
                ch +=26;
            ds+=ch;
        }
    }
    public void display()
    {
        System.out.println("Encoded String is: " + es);
        System.out.println("Decoded String is: " + ds);
    }
    public static void main(String args[])
    {
        CodingDecoding ob = new CodingDecoding();
        ob.input();
        ob.encode();
        ob.decode();
        ob.display();
    }
}