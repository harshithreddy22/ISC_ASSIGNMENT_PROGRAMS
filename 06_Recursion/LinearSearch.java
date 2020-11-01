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
class LinearSearch
{
    static int search(int arr[], int n, int i)
    {
        if(i==arr.length)
        {`
            return -1;
        }
        else if(arr[i] == n)
        {
            return i;
        }
        else
        {
            return search(arr,n,i+1);
        }
    }
    public static void main(String args[])
    {
        int arr[] = {3,4,15,6};
        System.out.println("Sum is: " + search(arr,10,0));
    }
}