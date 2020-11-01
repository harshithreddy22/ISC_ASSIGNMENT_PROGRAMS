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
class MyClass
{
    int n;
    MyClass(int n)
    {
        this.n = n;
    }
    void fun(MyClass ob)
    {
        n = n + ob.n;
    }
    void display()
    {
        System.out.println(n);
    }
    public static void main(String args[])
    {
        MyClass ob1 = new MyClass(1);
        MyClass ob2 = new MyClass(2);
        MyClass ob3 = new MyClass(3);
        ob1.fun(ob2);
        ob2.fun(ob3);
        ob1.display();
        ob2.display();
    }
}
