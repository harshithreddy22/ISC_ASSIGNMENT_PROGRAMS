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
//Check Prime
class CheckPrime
{
    int i,c;
    CheckPrime()
    {
        i=1;
        c=0;
    }
    void count(int n)
    {
        if(i<=n)
        {
            if(n%i==0)
                c++;
            i++;
            count(n);
        }
    }
    void check(int n)
    {
        count(n);
        if(c==2)
            System.out.println("It is prime");
        else
            System.out.println("Not prime");
    }
    
    public static void main(String args[])
    {
        CheckPrime ob = new CheckPrime();
        ob.check(10);
    }
}