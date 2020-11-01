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

//WAP to accept integers in a 3x5 dda and sort the individual rows separately in ascending order

import java.util.*;
class SortEachRow
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int mat[][]=new int[3][5],r,c,i,j,k,t;
        
        System.out.println("Enter the values: ");
        for(r=0;r<3;r++)
        {
            for(c=0;c<5;c++)
            {
                mat[r][c] =sc.nextInt();
            }
        }
        
        
        for(k=0;k<3;k++)
        {
            for(i=1;i<5;i++)
            {
                for(j=0;j<5-i;j++)
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
        
        
        System.out.println("The resulting matrix is: ");
        for(r=0;r<3;r++)
        {
            for(c=0;c<5;c++)
            {
                System.out.print(mat[r][c] + " ");
            }
            System.out.println();
        }
        
    }
}

