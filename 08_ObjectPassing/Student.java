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
    String name;
    int marks;
    Student(String name, int marks)
    {
        this.name = name;
        this.marks = marks;
    }
    Student highest(Student s1, Student s2)
    {
        if(s1.marks>s2.marks)
            return s1;
        else
            return s2;
    }
    void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
    public static void main(String args[])
    {
        Student s1 = new Student("Rohan",30);
        Student s2 = new Student("Sanjay",100);
        Student h;
        h = s1.highest(s1,s2);
        h.display();
    }
}