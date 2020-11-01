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
class DoublyLinkedList
{
    public static void main(String args[])
    {
        Item n1 = new Item();
        n1.num = 10;
        n1.next = null;
        n1.prev = null;
        
        Item n2 = new Item();
        n2.num = 20;
        n2.next = null;
        n2.prev = n1;
        n1.next = n2;
        
        Item n3 = new Item();
        n3.num=50;
        n3.next = null;
        n3.prev = n2;
        n2.next = n3;
        
        Item tn;
        System.out.println("The list is: ");
        for(tn=n1;tn!=null;tn=tn.next)
        {
            System.out.println(tn.num);
        }
        
        
        System.out.println("The list in reverse is: ");
        for(tn=n3;tn!=null;tn=tn.prev)
        {
            System.out.println(tn.num);
        }
        
    }
}