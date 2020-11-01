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
class Dequeue
{
    int arr[] = new int[100];
    int lim;
    int front;
    int rear;
    Dequeue(int l)
    {
        lim = l;
        front = rear = 0;
    }
    void addrear(int val)
    {
        if(rear == lim)
            System.out.println("Overflow from the rear.");
        else
            arr[rear++]=val;
    }
    int popfront()
    {
        if(front == rear)
            return -9999;
        else
            return arr[front++];
    }
    void addfront(int val)
    {
        if(front == 0)
            System.out.println("Overflow from the front");
        else
            arr[--front]=val;
    }

    int poprear()
    {
        if(front == rear)
            return -9999;
        else
            return arr[--rear];
    }
}