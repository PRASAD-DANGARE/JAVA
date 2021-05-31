///////////////////////////////////////////////////////////
//
// Description   :  Accept N Number From User And Perform Addition Of Perfect Numbers V2
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
        int iSum = 0, iResult = 0;
        for(int i = 0; i < Arr.length; i++) // addition of perfect numbers loop
        {
            iSum = 0;
            for(int j = 1; j <= (Arr[i]/2); j++) // perfect numbers loop
            {
                if(Arr[i] % j == 0)
                {
                    iSum = iSum + j;
                }
            }
            if(iSum == Arr[i])
            {
                iResult = iResult + Arr[i];
            }
        }
        return iResult;
    }
}

class Program203
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
