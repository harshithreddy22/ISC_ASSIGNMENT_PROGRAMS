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
class Queue
{
    int Que[] = new int[100];
    int size;
    int front;
    int rear;
    Queue(int mm)
    {
        size = mm;
        front = 0;
        rear = 0;
    }
    void addele(int v)
    {
        if(rear == size)
            System.out.println("Overflow");
        else
            Que[rear++]=v;
        
    }
    int delete()
    {
        if(front == rear)
        {
            System.out.println("Underflow");
            return -9999;
        }
        else
        {
            return Que[front++];
        }
    }
    void display()
    {
        int i;
        for(i=front;i<rear;i++)
        {
            System.out.print(Que[i]+" ");
        }
        System.out.println();
    }
}