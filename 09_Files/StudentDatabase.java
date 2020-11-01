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
//Write a menu drive program to manage list of students (roll, name, marks) in a text file

import java.util.*;
import java.io.*;
class StudentDatabase
{
    public static void main(String args[]) throws FileNotFoundException
    {
        Scanner sc = new Scanner(System.in);
        int roll;
        String name;
        int marks;
        
        int choice;
        System.out.println("Select an option: ");
        System.out.println("1. Add a student");
        System.out.println("2. display the list of student.");
        choice = Integer.parseInt(sc.nextLine());
        switch(choice)
        {
            case 1:
                System.out.println("Enter the details of book:");
                System.out.print("Roll: ");
                roll = Integer.parseInt(sc.nextLine());
                System.out.print("Name: ");
                name = sc.nextLine();
                System.out.print("marks: ");
                marks = Integer.parseInt(sc.nextLine());
               
                PrintWriter pw = new PrintWriter(new FileOutputStream("stud.txt",true));
                pw.print(roll+";"+name+";"+marks+";");
                pw.close();
            break;
            case 2:
                Scanner scfile = new Scanner(new FileInputStream("stud.txt"));
                scfile.useDelimiter(";");
                System.out.println("Roll\tName\tMarks");
                while(scfile.hasNext())
                {
                    roll = Integer.parseInt(scfile.next());
                    name = scfile.next();
                    marks = Integer.parseInt(scfile.next());
                    System.out.println(roll+"\t"+name+"\t"+marks);
                    
                }
                scfile.close();
            break;
            default:
                System.out.println("Invalid choice.");
        }
  
    }
}