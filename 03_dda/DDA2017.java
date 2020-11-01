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
//isc 2017 practical dda problem

import java.util.*;
class DDA2017
{

    private int n;
    private char ans[][];
    private char keys[];
    private int scores[];
    
    public DDA2017()
    {
        n=0;
        keys = new char[5];
    }
    public boolean input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for N: ");
        n = sc.nextInt();
        if(!(n>3&&n<11))
        {
            return false;
        }
        else
        {
            ans=new char[n][5];
            scores = new int[n];
            
            System.out.println("ENTER THE ANSWERS: ");
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<5;j++)
                {
                    ans[i][j] = sc.next().charAt(0);
                }
            }
            
            System.out.println("ENTER THE KEYS: ");
            for(int i=0;i<5;i++)
            {
                keys[i]= sc.next().charAt(0);
            }
            return true;
        }
    }
    public void computeScores()
    {
        for(int i=0;i<n;i++)
        {
            scores[i]=0;
            for(int j=0;j<5;j++)
            {
                if(ans[i][j]==keys[j])
                    scores[i]++;
            }
        }
    }
   
    
    public void display()
    {
        System.out.println("Scores: ");
        for(int i=0;i<n;i++)
        {
            System.out.println("Participant " + (i+1) + "=" + scores[i]);
        }
        
        int ihs=0;
        for(int i=1;i<n;i++)
            if(scores[i]>scores[ihs])
                ihs = i;
                
        System.out.println("Highest Scorer: ");
        for(int i=0;i<n;i++)
        {
            if(scores[i]==scores[ihs])
                System.out.println("Participant " + (i+1));
        }
    }
    public static void main(String args[])
    {
        DDA2017 ob = new DDA2017();
        if(!ob.input())
            System.out.println("INPUT SIZE OUT OF RANGE");
        else
        {
            ob.computeScores();
            ob.display();
        }
    }
}