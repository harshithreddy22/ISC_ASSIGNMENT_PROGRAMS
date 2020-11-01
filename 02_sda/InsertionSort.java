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
//WAP to accept n numbers in an array and sort them into ascending order using
//selection sort technique.

import java.util.*;
class InsertionSort
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,arr[],i,j,x;
        System.out.println("Enter the value for n: ");
        n = sc.nextInt();
        arr = new int[n];
        System.out.println("Enter " + n + " numbers: ");
        for(i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        
        for(i=1;i<n;i++)
        {
            x = arr[i];
            for(j=i-1;j>=0 && x<arr[j]; j--)
                arr[j+1] = arr[j];
            arr[j+1]=x;
        }
        
        System.out.println("The sorted array is: ");
        for(i=0;i<n;i++)
        {
            System.out.println(arr[i] + " ");
        }
    }
}