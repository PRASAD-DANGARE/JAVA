///////////////////////////////////////////////////////////
//
// Description   :  Accept String From User And Count Number Of Small Characters
// Input         :  Int, Str
// Output        :  Int, Str
// Author        :  Prasad Dangare
// Date          :  31 May 2021
//
///////////////////////////////////////////////////////////

import java.util.*;

class Count
{
    public int Count_Small(String str)
    {
        int iCount = 0;
        char Arr[] = str.toCharArray();

        for(int i = 0; i < Arr.length; i++)
        {
            if((Arr[i] >= 'a') && (Arr[i] <= 'z'))
            {
                iCount++;
            }
        }
        return iCount;
    }
}

class Assignment43_2
{
    public static void main(String arg[])
    {
        String charS;
        int iRet;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter The String : ");

        charS = sobj.nextLine();

        Count cobj = new Count();
        iRet = cobj.Count_Small(charS);

        System.out.println("Count Of Small Letters Is : " + iRet);
    }
}