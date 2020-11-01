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
//WAP to read the first line of a text file and display on screen.

import java.io.*;
import java.util.*;
class StreamRead
{
    public static void main(String args[]) throws FileNotFoundException
    {
        Scanner sc = new Scanner(new FileInputStream("d:/filesamples/streams.txt"));
        String s = sc.nextLine();
        System.out.println("Data read: " + s);
        sc.close();
    }
}