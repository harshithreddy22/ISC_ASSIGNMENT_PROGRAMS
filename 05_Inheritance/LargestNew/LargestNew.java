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
class LargestNew extends Largest2
{
    int c;
    LargestNew()
    {
        c=0;
    }
    void input()
    {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the third number: ");
        c = sc.nextInt();
    }
    void compute()
    {
        super.compute();
        if (c>l)
            l=c;
    }
}