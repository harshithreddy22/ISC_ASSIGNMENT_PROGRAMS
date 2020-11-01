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
/*#

Define a class 'SpecialNumber' having following members:
Data Members
=============
n   : to store the given number
s   : to store the sum

Member Function
===============
SpecialNumber(int n): constructor to initialize data members
int fact(int d):    to find factorial of a number d using recursion.
void compute(): to compute the sum of facotorials of the digits of given
                number by invoking the function fact()
void display(): to check and display if the given number is special number
                or not.

Also define the main function to create an object of the class and carry
out the task.

*/
class SpecialNumber
{
    int n;
    int s;
    SpecialNumber(int n)
    {
        this.n = n;
        s=0;
    }
    int fact(int d)
    {
        if(d>1)
            return d*fact(d-1);
        else
            return 1;
    }
    void compute()
    {
        int div, digit;
        for(div= n;div>0;div/=10)
        {
            digit = div%10;
            s += fact(digit);
        }
    }
    void display()
    {
        if(n==s)
            System.out.println("It is special number.");
        else
            System.out.println("Not special number.");
    }
    public static void main(String args[])
    {
        SpecialNumber ob = new SpecialNumber(120);
        ob.compute();
        ob.display();
    }
}