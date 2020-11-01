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
//isc 2013 theory

import java.util.*;
class Emirp
{
    private int n, rev,f;
    public Emirp(int nn)
    {
        n=nn;
        rev = 0;
        f = 2;
    }
    int isprime(int x)
    {
        int ret=1;
        while(f<x)
        {
            if(x%f==0)
            {
                ret=0;
                break;
            }
            f++;
        }
        f=2;
        return ret;
    }
    void isEmirp()
    {
        int div,digit;
        for(div=n;div>0;div=div/10)
        {
            digit = div%10;
            rev = rev*10 + digit;
        }
        
        if(isprime(n)==1 && isprime(rev)==1)
            System.out.println("It is emirp");
        else
            System.out.println("Not emirp");
    }
    public static void main(String args[])
    {
        Emirp ob = new Emirp(13);
        ob.isEmirp();
    }
}