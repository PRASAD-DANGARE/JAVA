///////////////////////////////////////////////////////////
//
// Description   :  Accept N Numbers From User And Display All Such Elements Which Are Divisible By 3 And 5
// Input         :  Int
// Output        :  Int
// Author        :  Prasad Dangare
// Date          :  31 May 2021
//
///////////////////////////////////////////////////////////

import java.util.*;

class Array
{
    public void Display(int Arr[])
    {
        System.out.println("Elements Divisible By 3 And 5 : ");
        for(int i = 0; i < Arr.length; i++)
        {
            if(((Arr[i] % 3) == 0) && ((Arr[i] % 5) == 0))
            {
                System.out.println(Arr[i]);
            }
        }
    }
}

class Assignment44_4
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Number Of Elements : ");
        int iSize = sobj.nextInt();

        int Arr[] = new int[iSize];
        System.out.println("Enter The Elements : ");

        for(int i = 0; i < Arr.length; i++)
        {
            Arr[i] = sobj.nextInt();
        }

        Array aobj = new Array();
        aobj.Display(Arr);
    }
}