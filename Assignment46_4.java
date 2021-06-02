///////////////////////////////////////////////////////////
//
// Description   :  Accept N Numbers From User And Accept Range, Display All Elements From That Range
// Input         :  Int
// Output        :  Int
// Author        :  Prasad Dangare
// Date          :  31 May 2021
//
///////////////////////////////////////////////////////////

import java.util.*;

class Number
{
    public void Display(int Arr[], int iStart, int iEnd)
    {
        int i = 0;
        System.out.println("Elements In Between Range Are : ");
        for(i = 0; i < Arr.length; i++)
        {
            if((Arr[i] > iStart) && (Arr[i] < iEnd))
            {
                System.out.println(Arr[i]);
            }
        }
    }
}

class Assignment46_4
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Number Of Elements : ");
        int iSize = sobj.nextInt();

        int Arr[] = new int[iSize];
        System.out.println("Enter The Elements : ");
        for(int i = 0; i < iSize; i++)
        {
            Arr[i] = sobj.nextInt();
        }

        System.out.println("Enter Starting Point : ");
        int iValue1 = sobj.nextInt();

        System.out.println("Enter Ending Point : ");
        int iValue2 = sobj.nextInt();

        Number nobj = new Number();
        nobj.Display(Arr, iValue1, iValue2);
    }
}