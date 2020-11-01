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

WAP to read the capital letters from a text file.

*/
import java.io.*;
class TextFileHandleExceptions
{
    public static void main(String args[])
    {
        FileInputStream fis;
        int c;
        
        try
        {
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
        catch(FileNotFoundException e)
        {
            System.out.println("The file does not exist.");
        }
        catch(IOException e)
        {
            System.out.println("Error while reading.");
        }
        
        
    }
}