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
//isc 2016 practical dda problem

import java.util.*;
class DDA2016
{
    private int m;
    private int mat[][];
    private int sld, srd;
    
    public DDA2016()
    {
        m=0;
        sld=0;
        srd=0;
    }
    public boolean input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for M: ");
        m = sc.nextInt();
        if(!(m>3&&m<10))
        {
            return false;
        }
        else
        {
            mat=new int[m][m];
            System.out.println("ENTER ELEMENTS OF THE MATRIX: ");
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<m;j++)
                {
                    mat[i][j] = sc.nextInt();
                }
            }
            return true;
        }
    }
    public void sort()
    {
        int r,c,i,j,t;
        int n = (m-2)*(m-2);
        int arr[] = new int[n];
        i=0;
        for(r=1;r<m-1;r++)
        {
            for(c=1;c<m-1;c++)
            {
                arr[i++] = mat[r][c];
            }
        }
        
        
        for(i=1;i<n;i++)
        {
            for(j=0;j<n-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
        }
        
        i=0;
        for(r=1;r<m-1;r++)
        {
            for(c=1;c<m-1;c++)
            {
                mat[r][c] = arr[i++];
            }
        }
    }
    
    public void display()
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
    public void processDiagonals()
    {
        int i;
        System.out.println("Left diagonal elements are: ");
        for(i=0;i<m;i++)
        {
            sld += mat[i][i];
            System.out.print(mat[i][i]+ " ");
        }
        System.out.println("\nSum of left diagonal: " + sld);
        
        System.out.println("Right diagonal elements are: ");
        for(i=0;i<m;i++)
        {
            sld += mat[i][m-1-i];
            System.out.print(mat[i][m-1-i]+ " ");
        }
        System.out.println("\nSum of right diagonal: " + srd);
        
    }
    public static void main(String args[])
    {
        DDA2016 ob = new DDA2016();
        if(!ob.input())
            System.out.println("MATRIX SIZE OUT OF RANGE");
        else
        {
            
            System.out.println("ORIGINAL MATRIX: ");
            ob.display();
            ob.processDiagonals();
            ob.sort();
            System.out.println("MATRIX AFTER SORTING NON-BOUNDARY ELEMENTS: ");
            ob.display();
            
        }
    }
}