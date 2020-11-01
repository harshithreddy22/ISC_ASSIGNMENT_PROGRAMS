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
class Main14
{
    public static void main(String args[])
    {
        //Calculator ob = new Calculator();
        
        MyCalculator ob = new MyCalculator();
        fun(ob);
    }
    
    static void fun(Calculator c)
    {
        System.out.println(c.sum(3,4));
        c.factorial(5);
    }
}