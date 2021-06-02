///////////////////////////////////////////////////////////
//
// Description   :  Accept Number From User And Return The Count Of Odd Digits
// Input         :  Int
// Output        :  Int
// Author        :  Prasad Dangare
// Date          :  31 May 2021
//
///////////////////////////////////////////////////////////

import java.util.*;

class Digits
{
    public int Count_Odd(int iNo)
    {
        int iDigit = iNo, iCnt = 0;

        if(iDigit < 0)
        {
            iDigit =- iDigit;
        }

        while(iDigit != 0)
        {
            if(((iDigit % 10) % 2) != 0)
            {
                iCnt++;
            }
            iDigit = iDigit / 10;
        }
        return iCnt;
    }
}

class Assignment45_2
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter The Number : ");
        int iValue = sobj.nextInt();

        Digits dobj = new Digits();
        int iRet = dobj.Count_Odd(iValue);

        System.out.println("Count Of Odd Digits Are : " + iRet);
    }
}