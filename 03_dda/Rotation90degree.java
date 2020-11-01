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

WAP to accept values in a 3x3 matrix and rotate it by 90/180 degree clockwise/anticlockwise.

Eg:Input(m)=3
     1 2 3        7 4 1 
     4 5 6        8 5 2 
     7 8 9        9 6 3
     

*/
import java.util.*;
class Rotation90degree
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int mat[][]=new int[3][3];
        int r,c;
        
        System.out.println("Enter the values: ");
        for(r = 0;r<3;r++)
        {
            for(c =0;c<3;c++)
            {
                mat[r][c] = sc.nextInt();
            }
        }
        
        
        System.out.println("The matrix after rotation is is: " );
        for(c = 0;c<3;c++)
        {
            for(r =2;r>=0;r--)
            {
                System.out.print(mat[r][c] + "\t");
            }
            System.out.println();
        }
        
        
    }
}