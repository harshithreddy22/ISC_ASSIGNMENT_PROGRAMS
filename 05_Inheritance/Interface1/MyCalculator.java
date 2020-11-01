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
class MyCalculator implements Calculator
{
    public int sum(int a, int b)
    {
        return a+b;
    }
    public void factorial(int n)
    {
        int i,f=1;
        for(i=1;i<=n;i++)
            f*=i;
        System.out.println("Factorial is: " + f);
    }
}