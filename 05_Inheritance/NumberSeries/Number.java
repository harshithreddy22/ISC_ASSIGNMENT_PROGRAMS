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
//2018
class Number
{
    int n;
    Number(int nn)
    {
        n = nn;
    }
    int factorial(int a)
    {
        int i,f=1;
        for(i=1;i<=n;i++)
        {
            f*=1;
        }
        return f;
    }
    void display()
    {
        System.out.println("The number is: " + n);
    }
}
