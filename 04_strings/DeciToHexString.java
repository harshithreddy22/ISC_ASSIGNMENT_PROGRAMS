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
class DeciToHexString
{
    private int deci;
    private String hex;
    
    DeciToHexString()
    {
        deci=0;
        hex="";
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
        for(div=deci;div>0;div=div/16)
        {
            digit = div%16;
            hex = (char)(digit<10?digit+48:digit+55)+ hex;
        }
        
       
    }
    public void display()
    {
        System.out.println("Binary is: " + hex);
    }
    public static void main(String args[])
    {
        DeciToHexString ob = new DeciToHexString();
        ob.input();
        ob.compute();
        ob.display(); 
    }
}

