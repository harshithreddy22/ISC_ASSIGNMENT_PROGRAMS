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
class NumberReverse
{
    int r;
    NumberReverse()
    {
        r = 0;
    }
    void reverse(int n)
    {
        if(n>0)
        {
            int digit = n%10;
            r = r*10 + digit;
            reverse(n/10);
        }
    }
    void display()
    {
        System.out.println("Reverse is: " + r);
    }
    public static void main(String args[])
    {
        NumberReverse ob = new NumberReverse();
        ob.reverse(123);
        ob.display();
    }
}