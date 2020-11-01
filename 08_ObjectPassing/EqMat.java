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
class EqMat
{
    int a[][];
    int m;
    int n;
    EqMat(int mm, int nn)
    {
        m = mm;
        n = nn;
    }
    void readarray()
    {
        Scanner sc = new Scanner(System.in);
        int i,j;
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j] =sc.nextInt();
            }
        }
    }
    int check(EqMat P, EqMat Q)
    {
        if(P.m != Q.m || P.n != Q.n)
            return 0;
            
        int i,j;
        outer:for(i=0;i<P.m;i++)
        {
            for(j=0;j<Q.n;j++)
            {
                if(P.a[i][j]!=Q.a[i][j])
                    break outer;
            }
        }
        if(i==P.m)
            return 1;
        else
            return 0;
    }
    void print()
    {
        int i,j;
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        
    }
    public static void main(String args[])
    {
        EqMat A = new EqMat(3,3);
        System.out.println("Enter the first Matrix: ");
        A.readarray();
        EqMat B = new EqMat(3,3);
        System.out.println("Enter the second Matrix: ");
        B.readarray();
        if(A.check(A,B)==1)
            System.out.println("They are equal");
        else
            System.out.println("Not equal");
    }
}