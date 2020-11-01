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
class Main5
{
    public static void main(String args[])
    {
        TwinPrime ob = new TwinPrime();
        ob.input();
        if(ob.areTwinPrime())
            System.out.println("Yes it is");
        else
            System.out.println("Not twin prime");
            
    }
}