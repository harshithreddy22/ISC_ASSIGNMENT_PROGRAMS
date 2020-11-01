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
WAP in java to accept a decimal number and convert to binary equivalent.
(assume that the binary equivalent does not end with zeros)

*/
import java.util.*;
class DeciToBin
{
    long deci, bin;
    DeciToBin()
    {
        deci=bin=0;
    }
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        deci = sc.nextLong();
    }
    public void compute()
    {
        long div,digit,rems=0;
        for(div=deci;div>0;div=div/2)
        {
            digit = div%2;
            rems = rems * 10 + digit;
        }
        
        bin = 0;
        for(div=rems;div>0;div/=10)
        {
            digit = div%10;
            bin=bin*10 + digit;
        }
    }
    public void display()
    {
        System.out.println("Binary is: " + bin);
    }
    public static void main(String args[])
    {
        DeciToBin ob = new DeciToBin();
        ob.input();
        ob.compute();
        ob.display(); 
    }
}

