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
class BinToDeci
{
    long bin, deci;
    BinToDeci()
    {
        bin=deci=0;
    }
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        bin = sc.nextLong();
    }
    public void compute()
    {
        long div,digit,p=0;
        for(div=bin;div>0;div=div/10)
        {
            digit = div%10;
            deci += digit * (long)Math.pow(2,p);
            p++;
        }
    }
    public void display()
    {
        System.out.println("Decimal is: " + deci);
    }
    public static void main(String args[])
    {
        BinToDeci ob = new BinToDeci();
        ob.input();
        ob.compute();
        ob.display();
    }
}