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
/*

WAP to accept a matrix of size 3x3 and find its saddle point if present.
(the element which is minimum in its row and maximum in its column)

Example:

1  2  3
4  5  6
7  8  9

Here 7 is the saddle point.

*/

import java.util.*;
class SaddlePoint
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int mat[][]=new int[3][3],i,j,ii;
        int imax=0, jmin=0;
        
        
        
        System.out.println("Enter the values: ");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                mat[i][j] =sc.nextInt();
            }
        }
        
        for(i=0;i<3;i++)
        {
            jmin=0;
            for(j=1;j<3;j++)
            {
                if(mat[i][j]<mat[i][jmin])
                {
                    jmin= j;
                }
            }
            
            imax=0;
            for(ii=1;ii<3;ii++)
            {
                if(mat[ii][jmin]>mat[imax][jmin])
                    imax=ii;
            }
            
            if(imax == i)
                break;
                
                
        }
        if(i==3)
        {
            System.out.println("No saddle point");
        }
        else
        {
            System.out.println("Saddle point at (" + imax +"," + jmin+") = "+ mat[imax][jmin]);
        }
        
    }
}

