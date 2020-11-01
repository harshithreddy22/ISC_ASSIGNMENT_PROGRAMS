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
//Count Factors
class CountFactors
{
    int i,c;
    CountFactors()
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
    void display()
    {
        System.out.println("Number of factors: " + c);
    }
    
    public static void main(String args[])
    {
        CountFactors ob = new CountFactors();
        ob.count(10);
        ob.display();
    }
}