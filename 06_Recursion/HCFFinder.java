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
//HCF
class HCFFinder
{
    int hcf(int a, int b)
    {
        if(a%b == 0)
            return b;
        else
            return hcf(b,a%b);
    }
    public static void main(String args[])
    {
        HCFFinder ob = new HCFFinder();
        System.out.println(ob.hcf(60,80));
    }
}