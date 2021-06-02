///////////////////////////////////////////////////////////
//
// Description   :  Accept N Numbers From User And Accept One Another Number As NO, Check Whether NO Is Present Or Not
// Input         :  Int
// Output        :  Int
// Author        :  Prasad Dangare
// Date          :  31 May 2021
//
///////////////////////////////////////////////////////////

import java.util.*;

class Number
{
    boolean Check(int Arr[], int iNo)
    {
        int iCnt = 0, i = 0;

        for(i = 0; i < Arr.length; i++)
        {
            if(Arr[i] == iNo)
            {
                iCnt = i;
                break;
            }
        }
        if(iCnt == i)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class Assignment46_1
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

        System.out.println("Enter The Element To Search : ");
        int iSearch = sobj.nextInt();

        Number nobj = new Number();
        boolean bRet = nobj.Check(Arr, iSearch);

        if(bRet == true)
        {
            System.out.println("Element Found");
        }
        else
        {
            System.out.println("Element Not Found");
        }
    }
}