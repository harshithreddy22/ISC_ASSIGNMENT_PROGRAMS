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
class CountLetters
{
    int c;
    CountLetters()
    {
        c=0;
    }
    void count(String s)
    {
        if(s.length()>=1)
        {
            if(Character.isDigit(s.charAt(0)))
                c++;
            count(s.substring(1));
        }
    }
    void display()
    {
        System.out.println("Number of letters: " + c);
    }
    public static void main(String argsf[])
    {
        CountLetters ob = new CountLetters();
        ob.count("A123b?");
        ob.display();
    }
}