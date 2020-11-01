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
import java.util.*;
class Stack
{
    int arr[];
    int top;
    int cap;
    Stack(int cap)
    {
        this.cap = cap;
        arr = new int[cap];
        top=-1;
    }
    void push(int n)
    {
        if(top == cap-1)
        {
            System.out.println("Stack Overflow");
        }
        else
        {
            arr[++top]=n;
        }
    }
    int pop()
    {
        if(top == -1)
        {
            return -999;
        }
        else
        {
            return arr[top--];
        }
    }
    void display()
    {
        System.out.println("The elements are: ");
        for(int i=top;i>=0;i--)
        {
            System.out.println(arr[i]);
        }
            
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Stack ob = new Stack(20);
        int n,ch;
        do
        {
            System.out.println("Select an option: ");
            System.out.println("1. push");
            System.out.println("2. pop");
            System.out.println("3. display");
            System.out.println("4. exit");
            ch = sc.nextInt();
            switch(ch)
            {
                case 1: 
                    System.out.println("Enter the number to push: ");
                    n = sc.nextInt();
                    ob.push(n);
                break;
                case 2:
                    n = ob.pop();
                    if(n==-999)
                        System.out.println("No elements");
                    else
                        System.out.println("Popped value is: " +n);
                break;
                case 3:
                    ob.display();
                break;
                case 4:
                    System.out.println("Exited.");
                break;
                default:
                    System.out.println("Invalid choice.");
            }
        }while(ch!=4);
    }
}
