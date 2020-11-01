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
//WAP to accept two sorted arrays of m, n numbers respectively and merge them
// in such a way that the resultant array comes sorted.

import java.util.*;
class MergeSorted
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int m,n,a[],b[],r[],i,j,k;
        System.out.println("Enter the values for m and n: ");
        m = sc.nextInt();
        n = sc.nextInt();
        a = new int[m];
        b = new int[n];
        r = new int[m+n];
        
        System.out.println("Enter " + m + " numbers for the first array: ");
        for(i=0;i<m;i++)
        {
            a[i] = sc.nextInt();
        }
        
        System.out.println("Enter " + n + " numbers for the second array: ");
        for(i=0;i<n;i++)
        {
            b[i] = sc.nextInt();
        }
        
        for(i=0,j=0,k=0;i<m && j<n;k++)
        {
           if(a[i]<b[j])
                r[k]=a[i++];
           else
                r[k]=b[j++];
        }
        
        while(i<m)
            r[k++] = a[i++];
        while(j<n)
            r[k++] = b[j++];
        
        System.out.println("The merged array is: ");
        for(i=0;i<m+n;i++)
        {
            System.out.print(r[i] + " ");
        }
    }
}