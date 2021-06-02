///////////////////////////////////////////////////////////
//
// Description   :  Accept N Numbers From User And Accept One Another Number As NO, Return Index Of Last Occurrence Of That NO
// Input         :  Int
// Output        :  Int
// Author        :  Prasad Dangare
// Date          :  31 May 2021
//
///////////////////////////////////////////////////////////

import java.util.*;

class Number
{
    int Last_Occ(int Arr[], int iNo)
    {
        int iCnt = 0, i = 0;

        for(i = Arr.length - 1; i >= 0; i--)
        {
            if(Arr[i] == iNo)
            {
                iCnt = i;
                break;
            }
        }
        if(iCnt == i)
        {
            return i;
        }
        else
        {
            return -1;
        }
    }
}

class Assignment46_3
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
        int iRet = nobj.Last_Occ(Arr, iSearch);

        if(iRet == -1)
        {
            System.out.println("Element Not Found");
        }
        else
        {
            System.out.println("Last Occurance Found At Index : " + iRet);
        }
    }
}