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
class Sum
{
    int a,b,s;
    Sum()
    {
        a =b = s= 0;
        
    }
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
    }
    void computeSum()
    {
        s = a+b;
    }
    void displaySum()
    {
        System.out.println("Sum is: " + s);
    }
}