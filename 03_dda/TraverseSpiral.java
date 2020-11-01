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
WAP to traverse a square matrix in spiral fashion
*/


import java.util.*;
class TraverseSpiral
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,mat[][],r = 0,  c = 0,size, limit,v,i;
        
        System.out.println("Enter the value for n: ");
        n = sc.nextInt();
        mat= new int[n][n];
 
        size=n;
        limit = (n-1)/2;
        v=1;
        
        for(i=0;i<=limit;i++)
        {
            for(c=i;c<size;c++)
                mat[i][c] = v++;
            c--;
            for(r=i+1;r<size;r++)
                mat[r][c] = v++;
            r--;
            for(c--;c>=i;c--)
                mat[r][c] =  v++;
            c++;
            for(r--;r>i;r--)
                mat[r][c] = v++;
            size--;
        }

        System.out.println("The matrix is: ");
        for(r =0;r<n;r++)
        {
            for(c = 0;c<n;c++)
                System.out.print(mat[r][c] + "\t");
            System.out.println();
        }
    }
}