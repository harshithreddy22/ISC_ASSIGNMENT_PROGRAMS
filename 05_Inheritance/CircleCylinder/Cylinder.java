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
import java.util.*;
class Cylinder extends Circle
{
    double h;
    Cylinder()
    {
        h = 0;
    }
    void input()
    {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height: ");
        h = sc.nextDouble();
    }
    double getVolume()
    {
        return getArea() * h;
    }
}