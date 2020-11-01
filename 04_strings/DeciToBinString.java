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

WAP to accept a decimal number and convert to binary form.

*/

import java.util.*;
class DeciToBinString
{
    private int deci;
    private String bin;
    DeciToBinString()
    {
        deci=0;
        bin="";
    }
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        deci = sc.nextInt();
    }
    public void compute()
    {
        long div,digit;
        for(div=deci;div>0;div=div/2)
        {
            digit = div%2;
            bin = digit+ bin;
        }
        
       
    }
    public void display()
    {
        System.out.println("Binary is: " + bin);
    }
    public static void main(String args[])
    {
        DeciToBinString ob = new DeciToBinString();
        ob.input();
        ob.compute();
        ob.display(); 
    }
}

