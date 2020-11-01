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
class Student
{
    int roll;
    String name;
    Student(int roll, String name)
    {
        this.roll = roll;
        this.name = name;
    }
    void display()
    {
        System.out.println("Roll: " + roll);
        System.out.println("Name : " + name);
    }
}