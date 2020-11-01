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

void FindNode(Node str, int b)
{
    Node tn;
    for(tn = str;tn!=null;tn=tn.link)
    {
        if(tn.n == b)
            break;
    }
    if(tn == null)
        System.out.println("Not found");
    else
        System.out.println("Found");
}