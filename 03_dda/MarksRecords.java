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
/*

WAP to accept name, marks of three subjects of five students and display the
details along with total and average marks of each student.

*/

import java.util.*;
class MarksRecords
{
    private String name[];
    private int marks[][];
    public MarksRecords()
    {
        name = new String[5];
        marks = new int[5][3];
    }
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name and marks of five students: ");
        for(int i=0;i<5;i++)
        {
            name[i] = sc.nextLine();
            for(int j=0;j<3;j++)
            {
                marks[i][j]= Integer.parseInt(sc.nextLine());
            }
        }
    }
    public void display()
    {
        int i,j,total;
        double avg;
        System.out.println("The records are: ");
        System.out.println("Name\tMarks1\tMarks2\tMarks3\tTotal\tAverage\n");
        for(i=0;i<5;i++)
        {
            System.out.print(name[i]);
            total=0;
            for(j=0;j<3;j++)
            {
                System.out.print("\t" + marks[i][j]);
                total += marks[i][j];
            }
            avg = total/3.0;
            System.out.println("\t" + total + "\t" + avg);  
            
        }
    }
    public static void main(String args[])
    {
        MarksRecords ob = new MarksRecords();
        ob.input();
        ob.display();
    }
}