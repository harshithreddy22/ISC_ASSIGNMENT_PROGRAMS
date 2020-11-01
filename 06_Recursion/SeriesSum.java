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
class SeriesSum
{
    int x, n;
    double sum;
    SeriesSum(int xx, int nn)
    {
        x =xx;
        n =nn;
    }
    double findfact(int m)
    {
        if(m<=1)
            return 1;
        else
            return m*findfact(m-1);
    }
    double findpower(int x, int y)
    {
        if(y == 0)
            return 1;
        else if(y==1)
            return x;
        else
        {
            return x * findpower(x, y-1);
        }
    }
    void calculate()
    {
        sum=0;
        for(int i=2;i<=n;i+=2)
        {
            sum += findpower(x,i)/findfact(i-1);
        }
    }
    void display()
    {
        System.out.println("Sum is: " + sum);
    }
    public static void main(String args[])
    {
        SeriesSum ob = new SeriesSum(2, 5);
        ob.calculate();
        ob.display();
    }
}