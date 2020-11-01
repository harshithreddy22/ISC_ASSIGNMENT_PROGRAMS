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
//WAP to accept integers in a 3x5 dda and sort the matrix in ascending order.
import java.util.*;
class SortMatrix
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int mat[][]=new int[3][5],r,c;
        int arr[]=new int[15],i,j,k,t;
        
        System.out.println("Enter the values: ");
        for(r=0;r<3;r++)
        {
            for(c=0;c<5;c++)
            {
                mat[r][c] =sc.nextInt();
            }
        }
        
        k=0;
        for(r=0;r<3;r++)
        {
            for(c=0;c<5;c++)
            {
                arr[k++]=mat[r][c];
            }
        }
        
        for(i=1;i<15;i++)
        {
            for(j=0;j<15-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
        }
        
        k=0;
        for(r=0;r<3;r++)
        {
            for(c=0;c<5;c++)
            {
                mat[r][c]=arr[k++];
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

