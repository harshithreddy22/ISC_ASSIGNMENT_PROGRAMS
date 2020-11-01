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
class Reverse
{
    int n,r;
    Reverse()
    {
        n= r = 0;
    }
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        n = sc.nextInt();
    }
    void compute()
    {
        int div,digit;
        for(div=n;div>0;div=div/10)
        {
            digit = div%10;
            r = r*10+digit;
        }
    }
    void display()
    {
        System.out.println("Reverse is: " + r);
    }
}