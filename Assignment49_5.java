///////////////////////////////////////////////////////////
//
// Description   :  Accept String From User And Check Whather String Is Palindrome Or Not
// Input         :  String
// Output        :  String
// Author        :  Prasad Dangare
// Date          :  3 June 2021
//
///////////////////////////////////////////////////////////

import java.util.*;

class StringDemo
{
    public boolean StrPallindrome(String str)
    {
        int j = str.length();
        String strCpy = "";
 
        for (int i = j - 1; i >= 0; i--)
        {
            //strCpy = strCpy + str.charAt(i);
            strCpy += str.charAt(i);
        }
 
        if (str.equals(strCpy))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class Assignment49_5
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter The String : ");
        
        String str = sobj.nextLine();
        
        StringDemo obj = new StringDemo();
        boolean bRet = obj.StrPallindrome(str);

        if(bRet == true)
        {
            System.out.println("Its An Palindrome String ");
        }
        else
        {
            System.out.println("Its Not An Palindrome String ");
        }
    }
}