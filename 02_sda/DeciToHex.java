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
//WAP to accept a decimal number and convert to hexadecimal
import java.util.*;
class DeciToHex
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,div,digit,i;
        char hex[]=new char[50];
        System.out.println("Enter the number: ");
        n = sc.nextInt();
        
        i=0;
        for(div=n;div>0;div/=16)
        {
            digit=div%16;
            if(digit<10)
                hex[i++] = (char)(digit+48);
            else
                hex[i++] = (char)(digit+55);
        }
        
        System.out.println("The hexadecimal equivalent is: ");
        for(i--;i>=0;i--)
            System.out.print(hex[i]);
    }
}