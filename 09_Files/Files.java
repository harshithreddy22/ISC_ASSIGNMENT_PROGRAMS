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
//WAP to read a text file one character at a time and print on screen.

import java.io.*;
class Files
{
    public static void main(String args[]) throws Exception
    {
        FileInputStream fis = new FileInputStream("d:/filesamples/package.bluej");
        while(true)
        {
            int ch = fis.read();
            
            if(ch==-1)
                break;
            
            System.out.print((char)ch);
            
        }
        fis.close();
    }
}