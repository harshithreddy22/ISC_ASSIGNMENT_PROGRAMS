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

//WAP in java to accept a binary number and convert to decimal equivalent

import java.util.*;
class HexToDeciString
{
    String hex;
    int deci;
    HexToDeciString()
    {
        hex="";
        deci=0;
    }
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        hex = sc.next();
    }
    public void compute()
    {
        int i,l,p,digit;
        char ch;
        l = hex.length();
        p=l-1;
        for(i=0;i<l;i++)
        {
            ch = hex.charAt(i);
            digit = ch>=65?ch-55:ch-48;
            deci += digit * (int)Math.pow(16,p);
            p--;
        }
    }
    public void display()
    {
        System.out.println("Decimal is: " + deci);
    }
    public static void main(String args[])
    {
        HexToDeciString ob = new HexToDeciString();
        ob.input();
        ob.compute();
        ob.display();
    }
}