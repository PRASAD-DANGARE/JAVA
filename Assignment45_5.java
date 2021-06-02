///////////////////////////////////////////////////////////
//
// Description   :  Accept Number From User And Return Difference Between Addition Of Even And Odd Digits
// Input         :  Int
// Output        :  Int
// Author        :  Prasad Dangare
// Date          :  31 May 2021
//
///////////////////////////////////////////////////////////

import java.util.*;

class Digits
{
    public int Count_Diff(int iNo)
    {
        int iDigit = 0, Even = 0, Odd = 0, iDiff = 0;

        if(iNo < 0)
        {
            iNo =- iNo;
        }

        while(iNo != 0)
        {
            if(((iDigit = iNo % 10) % 2 ) == 0)
            {
                Even = Even + iDigit;
            }
            else if(iDigit % 2 != 0)
            {
                Odd = Odd + iDigit;
            }
            iNo = iNo / 10;
        }
        return iDiff = Even - Odd;
    }
}

class Assignment45_5
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter The Number : ");
        int iValue = sobj.nextInt();

        Digits dobj = new Digits();
        int iRet = dobj.Count_Diff(iValue);

        System.out.println("Difference Is : " + iRet);
    }
}