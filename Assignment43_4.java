///////////////////////////////////////////////////////////
//
// Description   :  Accept String From User And Check Whether It Contains Vowels In It Or Not
// Input         :  Int, Str
// Output        :  Int, Str
// Author        :  Prasad Dangare
// Date          :  31 May 2021
//
///////////////////////////////////////////////////////////

import java.util.*;

class Vowel
{
    boolean Chk_Vowels(String str)
    {
        int iCnt = 0, i = 0;
        char arr[] = str.toCharArray();
        for(i = 0; i < arr.length; i++)
        {
            if(arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u'||
               arr[i] == 'A' || arr[i] == 'E' || arr[i] == 'I' || arr[i] == 'O' || arr[i] == 'U')
            {
                iCnt = i;
                break;
            }
        }
        if(iCnt == i)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class Assignment43_4
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter The String : ");
        String sValue = sobj.nextLine();

        Vowel obj = new Vowel();
        boolean bRet = obj.Chk_Vowels(sValue);

        if(bRet == true)
        {
            System.out.println("It Contain Vowels");
        }
        else
        {
            System.out.println("It Does Not Contain Vowels");
        }
    }
}


/*import java.util.*;

class Vowel
{
    public boolean Chk_Vowels(String str)
    {
        char Arr[] = str.toCharArray();

        for(int i = 0; i < Arr.length; i++)
        {
            if((Arr[i] == 'a') || (Arr[i] == 'e') || (Arr[i] == 'i') || (Arr[i] == 'o') || (Arr[i] == 'u'))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }
}

class Assignment43_4
{
    public static void main(String arg[])
    {
        String charS;
        boolean bRet;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter The String : ");

        charS = sobj.nextLine();

        Vowel vobj = new Vowel();
        bRet = vobj.Chk_Vowels(charS);

        if(bRet == true)
        {
            System.out.println("It Contains Voewls In It ");
        }
        else
        {
            System.out.println("It Dosen't Have Vowels In It ");
        }
    }
}*/
