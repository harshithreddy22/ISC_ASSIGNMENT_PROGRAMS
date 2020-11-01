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

Topic recursive function for integer power calculation

*/

class Power
{
    static int pow(int a, int b)
    {
        if(b == 0)
            return 1;
        else if(b == 1)
            return a;
        else
            return a*pow(a,b-1);
    }
}