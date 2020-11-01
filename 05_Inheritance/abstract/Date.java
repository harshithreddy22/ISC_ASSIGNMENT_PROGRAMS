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
abstract class Date
{
    int dd,mm,yy;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the date: ");
        dd = sc.nextInt();
        mm = sc.nextInt();
        yy = sc.nextInt();
    }
    abstract void display();
}