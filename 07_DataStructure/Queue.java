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
class Queue
{
    int arr[];
    int rear, front;
    int cap;
    Queue(int cap)
    {
        this.cap = cap;
        arr = new int[cap];
        rear = -1;
        front=0;
    }
    void push(int n)
    {
        if(rear == cap-1)
        {
            System.out.println("Overflow");
        }
        else
        {
            arr[++rear]=n;
        }
    }
    int pop()
    {
        if(front>rear)
        {
            return -999;
        }
        else
        {
            return arr[front++];
        }
    }
    void display()
    {
        System.out.println("The elements are: ");
        for(int i=front;i<=rear;i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
            
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Queue ob = new Queue(20);
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
