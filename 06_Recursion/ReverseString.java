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
class ReverseString
{
    static String reverse(String s)
    {
        if(s.length()==1)
            return s;
        else
            return reverse(s.substring(1))+s.charAt(0);
    }
    public static void main(String argsf[])
    {
        System.out.println(reverse("recursion"));
    }
}