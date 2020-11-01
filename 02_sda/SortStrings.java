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
//WAP to accept 5 strings in an array and sort them into descending (reverse-
//lexicographic) order using selection sort technique.


import java.util.*;
class SortStrings
{
    private String arr[];
    public SortStrings()
    {
        arr = new String[5];
    }
    public void input()
    {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 strings: ");
        for(i=0;i<5;i++)
        {
            arr[i] = sc.nextLine();
        }
    }
    
    public void compute()
    {
        int i,j;
        String x;
        for(i=1;i<5;i++)
        {
            x = arr[i];
            for(j=i-1;j>=0 && x.compareTo(arr[j])>0; j--)
                arr[j+1] = arr[j];
            arr[j+1]=x;
        }
    }
    
    public void display()
    {
        int i;
        System.out.println("The sorted array is: ");
        for(i=0;i<5;i++)
        {
            System.out.println(arr[i] + " ");
        }
    }
    
    public static void main(String args[])
    {
        
        SortStrings ob = new SortStrings();
        ob.input();
        ob.compute();
        ob.display();
    }
}
