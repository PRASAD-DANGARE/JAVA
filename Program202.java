///////////////////////////////////////////////////////////
//
// Description   :  Accept N Number From User And Check Wather Number Is Perfect Or Not
// Input         :  Int
// Output        :  Int
// Author        :  Prasad Dangare
// Date          :  28 May 2021
//
///////////////////////////////////////////////////////////

import java.util.*;

class Numbers
{
    public boolean CheckPerfect(int iNo)
    {
        int iSum = 0;
        for(int i = 1; i <= (iNo/2); i++)
        {
            if(iNo % i == 0)
            {
                iSum = iSum + i;
            }
        }
        if(iSum == iNo)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public int Sum(int Arr[])
    {
        int iSum = 0;
        for(int i = 0; i < Arr.length; i++)
        {
            if(CheckPerfect(Arr[i]) == true)
            {
                iSum = iSum + Arr[i];
            }
        }
        return iSum;
    }
}

class Program202
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iSize = 0;

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
