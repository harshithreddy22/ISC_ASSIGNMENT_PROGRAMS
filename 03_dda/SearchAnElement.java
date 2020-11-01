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

WAP in java to accept values in a 3x4 matrix and search a given element, display found or not found,
 also display the position if found.

*/

import java.util.*;
class SearchAnElement
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int mat[][]=new int[3][4],i=0,j=0,ns;

        System.out.println("Enter the values: ");
        for(i=0;i<3;i++)
        {
            for(j=0;j<4;j++)
            {
                mat[i][j] =sc.nextInt();
            }
        }
        
        System.out.println("Enter the element to search: ");
        ns = sc.nextInt();
        
        outerloop: for(i=0;i<3;i++)
        {
            for(j=0;j<4;j++)
            {
                if(ns == mat[i][j])
                    break outerloop;
            }
        }
        if(i==3)
            System.out.println("Not found");
        else
            System.out.println("Fount at position: (" + i +","+j+")"); 
    }
}

