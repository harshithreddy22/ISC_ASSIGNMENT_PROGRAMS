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
class MarksDetail extends Student
{
    int marks;
    MarksDetail(int roll, String name, int marks)
    {
        super(roll, name);
        this.marks = marks;
        
    }
    void display()
    {
        super.display();
        System.out.println("Marks : " + marks);
    }
}