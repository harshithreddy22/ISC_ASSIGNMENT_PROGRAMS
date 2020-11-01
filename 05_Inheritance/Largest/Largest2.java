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
import java.util.*;
class Largest2
{
    int a,b,l;
    Largest2()
    {
        a=b=l=0;
    }
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
    }
    void compute()
    {
        l = a;
        if(b>l)
            l=b;
       
    }
    void display()
    {
        System.out.println("Largest is: " + l);
    }
}