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
class Series extends Number
{
    int sum;
    Series(int nn, int sum)
    {
        super(nn);
        this.sum = sum;
    }
    void calsum()
    {
        for(int i=1;i<=n;i++)
        {
            sum+= factorial(i);
        }
    }
    void display()
    {
        super.display();
        System.out.println("Sum is: " + sum);
    }
}