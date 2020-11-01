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
class Adder
{
    int a[]=new int[2];
    Adder()
    {
        a[0]=a[1]=0;
    }
    void readtime()
    {
        Scanner sc = new Scanner(System.in);
        a[0] = sc.nextInt();
        a[1] = sc.nextInt();
    }
    void addtime(Adder X, Adder Y)
    {
        a[1] = X.a[1]+Y.a[1];
        a[0] = X.a[0] + Y.a[0]+a[1]/60;
        a[1]%=60;
    }
    void disptime()
    {
        System.out.println("hours=" + a[0] + " minutes= " + a[1]);
    }
    public static void main(String args[])
    {
        Adder A = new Adder();
        System.out.println("Enter the first time: " );
        A.readtime();
        Adder B = new Adder();
        System.out.println("Enter the second time: ");
        B.readtime();
        Adder C = new Adder();
        C.addtime(A,B);
        C.disptime();
    }
}