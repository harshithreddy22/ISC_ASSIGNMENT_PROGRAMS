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
class NumberSystem
{
    int r;
    int i;
    NumberSystem()
    {
        r = 0;
        i=0;
    }
    void convert(int n)
    {
        if(n>0)
        {
            int digit = n%10;
            r += digit * (int)Math.pow(2,i);
            i++;
            convert(n/10);
        }
    }
    void display()
    {
        System.out.println("Decimal is: " + r);
    }
    public static void main(String args[])
    {
        NumberSystem ob = new NumberSystem();
        ob.convert(1111);
        ob.display();
    }
}