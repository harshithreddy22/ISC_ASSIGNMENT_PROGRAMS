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
//isc 2018 string problem

import java.util.*;
class Banner
{
    private int n;
    private String names[];
    public Banner()
    {
        n=0;
    }
    public boolean input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for n: ");
        n = Integer.parseInt(sc.nextLine());
        if(!(2<n&&n<9))
            return false;
        else
        {
            names = new String[n];
            System.out.println("Enter the names: ");
            for(int i=0;i<n;i++)
            {
                names[i] = sc.nextLine();
            }
            
            return true;
        }
    }
    public void display()
    {
        System.out.println("Here goes the banner: ");
        int ne = 0;
        for(int i=0;ne<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==names[j].length())
                    ne++;
                else if(i<names[j].length())
                    System.out.print(names[j].charAt(i));
                
                System.out.print("\t");
                    
            }
            System.out.println();
        }
    }
    
    public static void main(String args[])
    {
        Banner ob = new Banner();
        if(!ob.input())
            System.out.println("INVALID INPUT");
        else
        {
            ob.display();
        }
    }
}