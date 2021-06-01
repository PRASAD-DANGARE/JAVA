///////////////////////////////////////////////////////////
//
// Description   :  Accept String From User And Return Difference Between Frequency Of Small And Capital Characters
// Input         :  Int, Str
// Output        :  Int, Str
// Author        :  Prasad Dangare
// Date          :  31 May 2021
//
///////////////////////////////////////////////////////////

import java.util.*;

class Frequency
{
    public int Count_Diff(String str)
    {
        int iCount1 = 0, iCount2 = 0, iDiff = 0;

        char Arr1[] = str.toCharArray();
        char Arr2[] = str.toCharArray();

        for(int i = 0; i < Arr1.length; i++)
        {
            if((Arr1[i] >= 'a') && (Arr1[i] <= 'z'))
            {
                iCount1++;
            }
        }

        for(int j = 0; j < Arr2.length; j++)
        {
            if((Arr1[j] >= 'A') && (Arr1[j] <= 'Z'))
            {
                iCount2++;
            }
        }

        iDiff = iCount1 - iCount2;

        return iDiff;
    }
}

class Assignment43_3
{
    public static void main(String arg[])
    {
        String charS;
        int iRet;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter The String : ");

        charS = sobj.nextLine();

        Frequency cobj = new Frequency();
        iRet = cobj.Count_Diff(charS);

        System.out.println("Difference Is : " + iRet);
    }
}