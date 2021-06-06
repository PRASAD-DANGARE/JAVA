///////////////////////////////////////////////////////////
//
// Description   :  Accept 2 Strings From User And Concat Second String After First String V2
// Input         :  String
// Output        :  String
// Author        :  Prasad Dangare
// Date          :  3 June 2021
//
///////////////////////////////////////////////////////////

import java.util.*;

class StringDemo
{
    public void StrNCmpX(String src, String dest)
    {
        StringBuffer bobj = new StringBuffer(); 
        bobj.append(src).append(dest); 
        System.out.println(bobj.toString());
    }
}

class Assignment49_3
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter First String : ");
        String schar1 = sobj.nextLine();

        System.out.println("Enter Second String : ");
        String schar2 = sobj.nextLine();

        StringDemo dobj = new StringDemo();
        dobj.StrNCmpX(schar1, schar2);
    }
}