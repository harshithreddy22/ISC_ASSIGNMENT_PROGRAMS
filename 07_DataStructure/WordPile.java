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
class WordPile
{
    char ch[];
    int capacity;
    int top;
    WordPile(int cap)
    {
        capacity=cap;
        top=-1;
        ch = new char[cap];
    }
    void pushChar(char v)
    {
        if(top==capacity-19001)
            System.out.println("WorPile is full");
        else
            ch[++top]=v;
    }
    char popChar()
    {
        if(top == -1)  
            return '\\';
        else
            return ch[top--];
    }
}