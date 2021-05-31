///////////////////////////////////////////////////////////
//
// Description   :  Accept N Number From User And Perform Addition Of That Number
// Input         :  Int
// Output        :  Int
// Author        :  Prasad Dangare
// Date          :  28 May 2021
//
///////////////////////////////////////////////////////////

import java.util.*;

class Numbers
{
    public int Sum(int Arr[])
    {
        int iSum = 0;
        for(int i = 0; i < Arr.length; i++)
        {
            iSum = iSum + Arr[i];
        }
        return iSum;
    }
}

class Program201
{
    public static void main(String arg[])
    {
        int iSize = 0;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Number Of Elements : ");
        iSize = sobj.nextInt();

        int Arr[] = new int[iSize];
        System.out.println("Please Enter The Values : ");
        for(int i = 0; i < Arr.length; i++)
        {
            Arr[i] = sobj.nextInt();
        }
        Numbers nobj = new Numbers();
        int iRet = nobj.Sum(Arr);
        System.out.println("Addition of N numbers : " + iRet);
    }
}
