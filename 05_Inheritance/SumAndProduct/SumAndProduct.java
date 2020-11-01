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
class SumAndProduct extends Sum
{
    int p;
    SumAndProduct()
    {
        p = 0;
    }
    void computeProduct()
    {
        p = a*b;
    }
    void displayProduct()
    {
        System.out.println("Product is: " + p);
    }
}