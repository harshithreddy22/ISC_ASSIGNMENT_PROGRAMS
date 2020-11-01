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
class Fibonacci
{
    static int fiboterm(int n)
    {
        if(n==1)
            return 0;
        else if(n==2)
            return 1;
        else
            return fiboterm(n-1) + fiboterm(n-2); 
    }
    public static void main(String args[])
    {
        //System.out.println("First 10 terms of fibonacci series: ");
        for(int i=5;i<=8;i++)
        {
            System.out.println(fiboterm(i));
        }
    }
}