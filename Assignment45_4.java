///////////////////////////////////////////////////////////
//
// Description   :  Accept Number From User And Return Multiplication Of All Digits
// Input         :  Int
// Output        :  Int
// Author        :  Prasad Dangare
// Date          :  31 May 2021
//
///////////////////////////////////////////////////////////

import java.util.*;

class Digits
{
    public int Multiply(int iNo)
    {
        int iDigit = 0, iMult = 1;

        while(iNo > 0)
        {
            iDigit = iNo % 10;
            if(iDigit != 0)
            {
                iMult = iMult * iDigit;
            }
            iNo = iNo / 10;
        }
        return iMult;
    }
}

class Assignment45_4
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter The Number : ");
        int iValue = sobj.nextInt();

        Digits dobj = new Digits();
        int iRet = dobj.Multiply(iValue);

        System.out.println("Multiplication Of All Digits Are : " + iRet);
    }
}