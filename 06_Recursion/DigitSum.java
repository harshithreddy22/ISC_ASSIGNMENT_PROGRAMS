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

WAP to define a class "DigitSum" to find sum of digits of a number having
following description:
Data Members:
n   :   to store the given integer
s   :   to store the sum of digits
Member Functions:
DigitSum()  : default constructor
void input(): to input the number
int sum(int): recursive function to find sum of digits of the number
                passed as parameter and return the result.
void compute() :    to invoke the function 'sum' to calculate sum of digits
            of the given number.
void display(): to display the result on screen.

Also define the main function to accomplice the task.

*/
import java.util.*;
class DigitSum
{
    int n,s;
    DigitSum()
    {
        n=s=0;
    }
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        n = sc.nextInt();
    }
    int sum(int a)
    {
        if(a<10)
            return a;
        else
            return a%10 + sum(a/10);
    }
    void compute()
    {
        s = sum(n);
    }
    void display()
    {
        System.out.println("Sum is: " + s);
    }
    
    public static void main(String args[])
    {
        DigitSum ob = new DigitSum();
        ob.input();
        ob.compute();
        ob.display();
    }
}