///////////////////////////////////////////////////////////
//
// Description   :  Accept String From User And Count Capital Letters
// Input         :  Int, Str
// Output        :  Int, Str
// Author        :  Prasad Dangare
// Date          :  30 May 2021
//
///////////////////////////////////////////////////////////

import java.util.*;

class StringX
{
    public int CapCount(String str)
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
class Program206
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Please Enter String : ");
        
        String str = sobj.nextLine();
        
        StringX obj = new StringX();

        int iRet = obj.CapCount(str);
        System.out.println("Number Of Capital Letters Are : " + iRet);
    }
}