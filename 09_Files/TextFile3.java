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

WAP to copy the lines larger than 20 characters to another file.

*/
import java.io.*;
import java.util.*;
class TextFile3
{
    public static void main(String args[])throws FileNotFoundException
    {
        Scanner sc = new Scanner(new FileInputStream("d:/filesamples/file1.txt"));
        PrintWriter pw = new PrintWriter(new FileOutputStream("d:/filesamples/file2.txt"));
        String line;
        while(sc.hasNext())
        {
            line = sc.nextLine();
            if(line.length()>20)
                pw.println(line);
            
        }
        sc.close();
        pw.close();
        
    }
}