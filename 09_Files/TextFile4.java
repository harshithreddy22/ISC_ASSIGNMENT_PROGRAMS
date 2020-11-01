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

WAP to count number of lines starting with a capital letter.
 (use bufferedreader)

*/
import java.io.*;
class TextFile4
{
    public static void main(String args[])throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("d:/filesamples/lines.txt")));
        int c;
        String line;
        c=0;
        while(true)
        {
            line = br.readLine();
            if(line==null)
                break;
            if(Character.isUpperCase(line.charAt(0)))
                c++;
        }
        br.close();
        System.out.println("Number of such lines: " + c);
        
    }
}