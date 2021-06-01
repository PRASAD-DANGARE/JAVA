///////////////////////////////////////////////////////////
//
// Description   :  Accept N Numbers From User And Return Difference Of Addition Of Even And Odd Elements
// Input         :  Int
// Output        :  Int
// Author        :  Prasad Dangare
// Date          :  31 May 2021
//
///////////////////////////////////////////////////////////

import java.util.*;

class Array
{
    public int Difference(int Arr[])
    {
        int iSum1 = 0, iSum2 = 0, iDiff = 0;

        for(int i = 0; i < Arr.length; i++)
        {
            if(Arr[i] % 2 == 0)
            {
                iSum1 = iSum1 + Arr[i];
            }
        }

        for(int j = 0; j < Arr.length; j++)
        {
            if(Arr[j] % 2 != 0)
            {
                iSum2 = iSum2 + Arr[j];
            }
        }

        iDiff = iSum1 - iSum2;

        return iDiff;
    }
}

class Assignment44_1
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
        int iRet = aobj.Difference(Arr);

        System.out.println("Difference Is : " + iRet);
    }
}