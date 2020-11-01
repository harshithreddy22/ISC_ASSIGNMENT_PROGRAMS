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
WAP in to accept values in a 4x4 matrix and swap alternate rows. i.e. first row with second, third
row with fourth.
*/
import java.util.*;
class SwapRows
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int mat[][]=new int[4][4],i,j,t;
        
        System.out.println("Enter the values: ");
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {
                mat[i][j] =sc.nextInt();
            }
        }
        
        
        for(i=0;i<4;i+=2)
        {
            for(j=0;j<4;j++)
            {
                t = mat[i][j];
                mat[i][j]= mat[i+1][j];
                mat[i+1][j]=t;
            }
        }

        System.out.println("Resulting matrix is: ");
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}

