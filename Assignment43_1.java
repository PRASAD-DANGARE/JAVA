///////////////////////////////////////////////////////////
//
// Description   :  Accept String From User And Count Number Of Capital Characters
// Input         :  Int, Str
// Output        :  Int, Str
// Author        :  Prasad Dangare
// Date          :  31 May 2021
//
///////////////////////////////////////////////////////////


import java.util.*;

class Count
{
    public int Count_Capital(String str)
    {
        int iCnt = 0;
        char arr[] = str.toCharArray();

        for(int i = 0; i < arr.length; i++)
        {
            if((arr[i] >= 'A') && (arr[i] <= 'Z'))
            {
                iCnt++;
            }
        }
        return iCnt;
    }
}

class Assignment43_1
{
    public static void main(String arg[])
    {
        String sValue;
        int iRet;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter The String : ");
        sValue = sobj.nextLine();

        Count cobj = new Count();
        iRet = cobj.Count_Capital(sValue);

        System.out.println("Count Of Capital Letters Are : " + iRet);
    }
}

