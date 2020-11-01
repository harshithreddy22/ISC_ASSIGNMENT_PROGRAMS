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
/*WAP to accept values in a square matrix of size N and display the submatrix of size M from
top-left corner.*/
import java.util.*;
class Submatrix
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,mat[][],i,j,m;
        System.out.println("Enter the size of the matrix: ");
        n = sc.nextInt();
        
        System.out.println("Enter the values: ");
        mat = new int[n][n];
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                mat[i][j] =sc.nextInt();
            }
        }
        
        System.out.println("Enter the submatrix size: ");
        m = sc.nextInt();
        System.out.println("The submatrix is: ");
        for(i=0;i<m;i++)
        {
            for(j=0;j<m;j++)
            {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}

