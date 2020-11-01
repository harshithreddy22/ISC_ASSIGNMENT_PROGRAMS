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
//isc 2018 practical dda problem

import java.util.*;
class DDA2018
{
    private int m,n;
    private int mat[][];
    
    public DDA2018()
    {
        m=0;
        n=0;
    }
    public boolean input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for M and N: ");
        m = sc.nextInt();
        n = sc.nextInt();
        if(!(m>2&&m<10&&n>2&&n<10))
        {
            return false;
        }
        else
        {
            mat=new int[m][n];
            System.out.println("ENTER ELEMENTS OF THE MATRIX: ");
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    mat[i][j] = sc.nextInt();
                }
            }
            return true;
        }
    }
    public void sort()
    {
        int t;
        for(int k=0;k<m;k++)
        {
            for(int i=1;i<n;i++)
            {
                for(int j=0;j<n-i;j++)
                {
                    if(mat[k][j]>mat[k][j+1])
                    {
                        t = mat[k][j];
                        mat[k][j] = mat[k][j+1];
                        mat[k][j+1] = t;
                    }
                }
            }
        }
    }
    
    public void display()
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        DDA2018 ob = new DDA2018();
        if(!ob.input())
            System.out.println("MATRIX SIZE OUT OF RANGE");
        else
        {
            System.out.println("ORIGINAL MATRIX: ");
            ob.display();
            ob.sort();
            System.out.println("MATRIX AFTER SORTING ROWS: ");
            ob.display();
        }
    }
}