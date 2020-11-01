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
class TwinPrime extends Prime
{
    int a,b;
    TwinPrime()
    {
        a = b= 0;
    }
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
    }
    boolean areTwinPrime()
    {
        
        if(Math.abs(a-b)!=2)
            return false;
        n = a;
        if(isPrime())
        {
            n = b;
            if(isPrime())
            {
                return true;
            }
        }
        return false;
    }
}