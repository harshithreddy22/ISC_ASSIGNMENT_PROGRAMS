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
/*#

WAP to count the capital letters from a text file.

*/
import java.io.*;
class TextFile
{
    public static void main(String args[]) throws FileNotFoundException, IOException
    {
        FileInputStream fis;
        int c;
        fis = new FileInputStream("d:/filesamples/myfile.txt");
        c=0;
        while(true)
        {
            int v = fis.read();
            if(v==-1)
                break;
            if(Character.isUpperCase((char)v))
                c++;
        }
        
        fis.close();
        System.out.println("Number of capital: " + c);
    }
}