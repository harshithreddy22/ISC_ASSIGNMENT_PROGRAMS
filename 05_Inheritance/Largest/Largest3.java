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
class Largest3 extends Largest2
{
    int c;
    Largest3()
    {
        c=0;
    }
    void input5()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        
    }
    void compute()
    {
        l = a;
        if (b>l)
            l=b;
        if (c>l)
            l=c;
    }
}