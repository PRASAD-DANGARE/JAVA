///////////////////////////////////////////////////////////
//
// Description   :  Accept N Numbers From User And Return Product Of All Odd Elements
// Input         :  Int
// Output        :  Int
// Author        :  Prasad Dangare
// Date          :  31 May 2021
//
///////////////////////////////////////////////////////////

import java.util.*;

class Number
{
    public int Product(int Arr[])
    {
        int i = 0, iMult = 1;

        for(i = 0; i < Arr.length; i++)
        {
            if((Arr[i] % 2) != 0)
            {
                iMult = iMult * Arr[i];
            }
        }
        return iMult;
    }
}

class Assignment46_5
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

        Number nobj = new Number();
        int iRet = nobj.Product(Arr);
        System.out.println("Product Of All Odd Elements Is : " + iRet);
    }
}