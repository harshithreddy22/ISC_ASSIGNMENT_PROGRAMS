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
class ArraySum
{
    static int sum(int arr[], int i)
    {
        if(i == arr.length-1)
            return arr[i];
        else
        {
           
            return arr[i] + sum(arr,i+1);
        }
    }
    public static void main(String args[])
    {
        int arr[] = {3,4,5,6};
        System.out.println("Sum is: " + sum(arr,0));
    }
}