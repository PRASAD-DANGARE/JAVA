///////////////////////////////////////////////////////////
//
// Description   :  Accept 2 Strings From User And Check Whather Both Are Same Or Not
// Input         :  String
// Output        :  String
// Author        :  Prasad Dangare
// Date          :  3 June 2021
//
///////////////////////////////////////////////////////////

import java.util.*;

class StringDemo
{
    public boolean StrCmpX(String src, String dest)
    {
        if(src.equals(dest))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class Assignment49_2
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter First String : ");
        String schar1 = sobj.nextLine();

        System.out.println("Enter Second String : ");
        String schar2 = sobj.nextLine();

        StringDemo dobj = new StringDemo();
        boolean iRet = dobj.StrCmpX(schar1, schar2);

        if(iRet == true)
        {
            System.out.println("Strings Are Same ");
        }
        else
        {
            System.out.println("String Are Different ");
        }
    }
}